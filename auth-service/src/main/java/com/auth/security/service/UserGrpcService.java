package com.auth.security.service;

import com.auth.security.auth.AuthResponse;
import com.auth.security.auth.AuthenticationService;
import com.auth.security.auth.RegisterRequest;
import com.auth.security.entities.User;
import com.auth.security.mapper.UserMapper;
import com.auth.security.stub.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class UserGrpcService extends UserServiceGrpc.UserServiceImplBase {
    private UserMapper userMapper;
    private AuthenticationService authService;

    public UserGrpcService(UserMapper userMapper, AuthenticationService authService) {
        this.userMapper = userMapper;
        this.authService = authService;
    }

    @Override
    public void register(RegistrationRequest request, StreamObserver<RegistrationResponse> responseObserver) {
        UserRequest userRequest = request.getUser();
        RegisterRequest user = userMapper.fromGrpcUserRequest(userRequest);

        AuthResponse saveUser =  authService.register(user);
        RegistrationResponse response = RegistrationResponse.newBuilder()
                .setMessage("l'enregistrement est effectué avec success "
                +saveUser)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
