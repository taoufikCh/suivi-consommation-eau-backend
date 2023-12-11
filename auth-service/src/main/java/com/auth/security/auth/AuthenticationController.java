package com.auth.security.auth;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/v2/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authService;
    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(
            @RequestBody RegisterRequest request
    ){
        return ResponseEntity.ok(authService.register(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthResponse> authenticate(
            @RequestBody AuthRequest request
    ){
        return ResponseEntity.ok(authService.authenticate(request));
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
        AuthResponse authResponse = authService.refreshToken(refreshToken);
        new ObjectMapper().writeValue(response.getOutputStream(), authResponse);
    }
    @GetMapping("/check-validate-token")
    public boolean validateToken(@RequestParam String token) {
       return authService.validateToken(token);
        //return "Token is valid";
    }
    @PostMapping("/isValid")
    public ResponseEntity<UserAuthenticationResponse> validateAuthentication(@RequestBody String token) {

        String hardcodedToken = "valid_token";
        String role = "user"; // Change this to "admin" for an admin user.
        System.out.println("token in auth service : "+token);

        UserAuthenticationResponse response = authService.isValidateToken(token);
        System.out.println("response : "+response);
       /* if (response.isAuthenticated()&& response.getRole()!=null) {
            response.setStatus(HttpStatus.ACCEPTED);
            //return ResponseEntity.ok(response);
        } else {
            //UserAuthenticationResponse response = new UserAuthenticationResponse(false, null);
            response.setStatus(HttpStatus.UNAUTHORIZED);
            //return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
        }*/
        return ResponseEntity.ok(response);
    }


}
