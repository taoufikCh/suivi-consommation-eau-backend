package com.service.gateway.response;

import org.springframework.http.HttpStatus;

public class UserAuthenticationResponse {
    private boolean isAuthenticated;
    private String role;
    private HttpStatus status;

    // Default constructor
    public UserAuthenticationResponse() {
    }

    public UserAuthenticationResponse(boolean isAuthenticated, String role, HttpStatus status) {
        this.isAuthenticated = isAuthenticated;
        this.role = role;
        this.status = status;
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    public String getRole() {
        return role;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setAuthenticated(boolean isAuthenticated) {
        this.isAuthenticated = isAuthenticated;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}

