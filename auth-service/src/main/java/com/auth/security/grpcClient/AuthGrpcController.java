package com.auth.security.grpcClient;

import com.auth.security.auth.AuthRequest;
import com.auth.security.auth.AuthResponse;
import com.auth.security.auth.RegisterRequest;
import com.auth.security.auth.UserAuthenticationResponse;
import com.auth.security.mapper.UserMapper;
import com.auth.security.stub.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.grpc.stub.StreamObserver;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthGrpcController {

    @GrpcClient(value = "securityService")
    private AuthServiceGrpc.AuthServiceBlockingStub authServiceBlockingStub;
    @Autowired
    private UserMapper authMapper;


    @PostMapping("/authenticate")
    public ResponseEntity<AuthResponse> authenticate(@RequestBody AuthRequest request){
        System.out.println("AuthRequest "+request);
        AuthenticationRequest authenticationRequest = authMapper.toGrpcAuthRequest(request);
        System.out.println("authenticationRequest "+authenticationRequest);
        AuthenticationResponse authenticationResponse = authServiceBlockingStub.authenticate(authenticationRequest);
        System.out.println("authenticationResponse "+authenticationResponse);
        return ResponseEntity.ok(authMapper.fromGrpcAuth(authenticationResponse));
    }

    @PostMapping("/isValid")
    public ResponseEntity<UserAuthenticationResponse> validateAuthentication(@RequestBody String token) {
        System.out.println("token in auth service : "+token);
        TokenRequest tokenRequest = TokenRequest.newBuilder()
                .setToken(token).build();
        System.out.println("tokenRequest in auth service : "+tokenRequest);
        TokenValidationResponse validationResponse = authServiceBlockingStub.validateToken(tokenRequest);
        System.out.println("validationResponse in auth service : "+validationResponse);
        UserAuthenticationResponse response = UserAuthenticationResponse.builder()
                .isAuthenticated(validationResponse.getValid())
                .role(validationResponse.getRole())
                .build();
        System.out.println("response : "+response);

        return ResponseEntity.ok(response);
    }

    @PostMapping("/refresh-token")
    public void refreshToken( HttpServletRequest request,
                              HttpServletResponse response ) throws IOException {
        final String authHeader = request.getHeader(HttpHeaders.AUTHORIZATION);
        final String refreshToken;

        if (authHeader == null ||!authHeader.startsWith("Bearer ")) {
            return;
        }
        refreshToken = authHeader.substring(7);
        System.out.println("refresh token : "+refreshToken);
        RefreshTokenRequest refreshTokenRequest = RefreshTokenRequest.newBuilder()
                .setRefreshToken(refreshToken)
                .build();
        AuthenticationResponse refreshTokenResponse = authServiceBlockingStub.refreshToken(refreshTokenRequest);
        AuthResponse authResponse = AuthResponse.builder()
                .accessToken(refreshTokenResponse.getAccessToken())
                .refreshToken(refreshTokenResponse.getRefreshToken())
                .build();
        System.out.println("response : "+response);
        new ObjectMapper().writeValue(response.getOutputStream(), authResponse);
    }


}
