package com.auth.security.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserAuthenticationResponse {
    private boolean isAuthenticated;
    private String role;
    private HttpStatus status;
}

