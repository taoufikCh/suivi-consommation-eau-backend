package com.auth.security.mapper;

import com.auth.security.auth.AuthRequest;
import com.auth.security.auth.AuthResponse;
import com.auth.security.auth.RegisterRequest;
import com.auth.security.entities.User;
import com.auth.security.stub.AuthenticationRequest;
import com.auth.security.stub.AuthenticationResponse;
import com.auth.security.stub.UserRequest;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    private ModelMapper modelMapper=new ModelMapper();

    public RegisterRequest fromGrpcUserRequest(UserRequest userRequest){
        return modelMapper.map(userRequest, RegisterRequest.class);
    }
    public AuthenticationRequest toGrpcAuthRequest(AuthRequest request) {;
        return modelMapper.map(request, AuthenticationRequest.Builder.class).build();
    }

    public AuthResponse fromGrpcAuth(AuthenticationResponse response){
        return modelMapper.map(response, AuthResponse.class);
    }
}
