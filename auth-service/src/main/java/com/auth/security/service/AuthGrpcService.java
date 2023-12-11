package com.auth.security.service;

import com.auth.security.auth.AuthRequest;
import com.auth.security.auth.AuthResponse;
import com.auth.security.auth.AuthenticationService;
import com.auth.security.auth.UserAuthenticationResponse;
import com.auth.security.config.LogoutService;
import com.auth.security.repositories.TokenRepository;
import com.auth.security.stub.*;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.StringValue;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@GrpcService
public class AuthGrpcService extends AuthServiceGrpc.AuthServiceImplBase {

    @Autowired
    private  AuthenticationService authService;
    @Autowired
    private LogoutService logoutservice;
    @Autowired
    private TokenRepository tokenRepository;
    @Override
    public void authenticate(AuthenticationRequest request, StreamObserver<AuthenticationResponse> responseObserver)  {

        String email = request.getEmail();
        String password = request.getPassword();
        AuthRequest authRequest = new AuthRequest(email, password);
        AuthResponse authResponse = authService.authenticate(authRequest);

        AuthenticationResponse response = AuthenticationResponse.newBuilder()
                .setAccessToken(authResponse.getAccessToken())
                .setRefreshToken(authResponse.getRefreshToken()) // You can implement refresh tokens if needed
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void validateToken(TokenRequest request, StreamObserver<TokenValidationResponse> responseObserver) {
        String token =  request.getToken();
        System.out.println("token auth grpc : "+token);
        UserAuthenticationResponse tokenValid = authService.isValidateToken(token);
        System.out.println("tokenValid auth grpc : "+tokenValid);
        TokenValidationResponse response = TokenValidationResponse.newBuilder()
                .setValid(tokenValid.isAuthenticated())
                .setRole(tokenValid.getRole())
                .build();
        System.out.println("response auth grpc : "+response);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void refreshToken(RefreshTokenRequest request, StreamObserver<AuthenticationResponse> responseObserver) {
        String refreshToken =  request.getRefreshToken();
        AuthResponse refreshTokenResponse = null;
            refreshTokenResponse = authService.refreshToken(refreshToken);

        AuthenticationResponse response = AuthenticationResponse.newBuilder()
                .setAccessToken(refreshTokenResponse.getAccessToken())
                .setRefreshToken(refreshTokenResponse.getRefreshToken()) // You can implement refresh tokens if needed
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void logout(TokenRequest request, StreamObserver<LogoutResponse> responseObserver) {
        String token = request.getToken();
        boolean status = false;

        var storedToken = tokenRepository.findByToken(token)
                .orElse(null);
        if (storedToken != null) {
            storedToken.setExpired(true);
            storedToken.setRevoked(true);
            tokenRepository.save(storedToken);
            //SecurityContextHolder.clearContext();
            status=true;
        }
        LogoutResponse response = LogoutResponse.newBuilder()
                .setSuccess(status)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
