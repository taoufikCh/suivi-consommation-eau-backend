package com.auth.security.auth;

import com.auth.security.config.JwtService;
import com.auth.security.entities.Token;
import com.auth.security.entities.TokenType;
import com.auth.security.entities.User;
import com.auth.security.repositories.TokenRepository;
import com.auth.security.repositories.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.ExpiredJwtException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final TokenRepository tokenRepository;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    private final UserDetailsService userDetailsService;

    public AuthResponse register(RegisterRequest request) {
        var user = User.builder()
                .firstname(request.getFirstname())
                .lastname(request.getLastname())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                //.role(Role.USER)
                .role(request.getRole())
                .build();
        var savedUser = userRepository.save(user);
        var jwtToken = jwtService.generateToken(user);
        var refreshToken = jwtService.generateRefreshToken(user);
        saveUserToken(savedUser, jwtToken);
        return AuthResponse.builder()
                .accessToken(jwtToken)
                .refreshToken(refreshToken).build();
    }

    public AuthResponse authenticate(AuthRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );

        var user = userRepository.findByEmail(request.getEmail()).orElseThrow();
        var jwtToken = jwtService.generateToken(user);
        var refreshToken = jwtService.generateRefreshToken(user);
        revokeAllUserTokens(user);
        saveUserToken(user, jwtToken);
        return AuthResponse.builder()
                .accessToken(jwtToken)
                .refreshToken(refreshToken)
                //.username(user.getFirstname()+" "+user.getLastname())
               // .email(user.getUsername())
               // .role(String.valueOf(user.getRole()))
                .build();
    }

    private void saveUserToken(User user, String jwtToken) {
        var token = Token.builder()
                .user(user)
                .token(jwtToken)
                .tokenType(TokenType.BEARER)
                .expired(false)
                .revoked(false)
                .build();
        tokenRepository.save(token);
    }

    private void revokeAllUserTokens(User user) {
        var validUserTokens = tokenRepository.findAllValidTokenByUser(user.getId());
        if (validUserTokens.isEmpty())
            return;
        validUserTokens.forEach(token -> {
            token.setExpired(true);
            token.setRevoked(true);
        });
        tokenRepository.saveAll(validUserTokens);
    }


    public AuthResponse refreshToken(String refreshToken
             )  {
        final String userEmail;
        AuthResponse authResponse = null;
        userEmail = jwtService.extractUsername(refreshToken);
        System.out.println("userEmail : "+userEmail);
        if (userEmail != null) {
            var user = this.userRepository.findByEmail(userEmail)
                    .orElseThrow();
            if (jwtService.isTokenValid(refreshToken, user)) {
                var accessToken = jwtService.generateToken(user);
                revokeAllUserTokens(user);
                saveUserToken(user, accessToken);
                authResponse = AuthResponse.builder()
                        .accessToken(accessToken)
                        .refreshToken(refreshToken)
                        .build();

            }
        }
        return authResponse;
    }
    public boolean validateToken(String token) {
        final String userEmail;
        boolean isValid = false;

        userEmail = jwtService.extractUsername(token);

        System.out.println("Token is "+token);
        var isTokenValid = tokenRepository.findByToken(token)
                .map(t -> !t.isExpired() && !t.isRevoked())
               .orElse(false);
        System.out.println("is Token Valid : "+isTokenValid);
        if (userEmail != null ) {
            UserDetails userDetails = this.userDetailsService.loadUserByUsername(userEmail);
           if (jwtService.isTokenValid(token, userDetails) && isTokenValid){

                isValid= true;
            }
        }
        return isValid;
    }

    public UserAuthenticationResponse isValidateToken(String token) {
        final String userEmail;
        boolean isValid = false;
        String role = "";
        System.out.println("token in isValidToken method : "+token);
        try {
        userEmail = jwtService.extractUsername(token);
        //System.out.println("userEmail in isValidToken method : "+userEmail);
        role = jwtService.extractRole(token);
        //System.out.println("role in isValidToken method : "+role);
        var isTokenValid = tokenRepository.findByToken(token)
                .map(t -> !t.isExpired() && !t.isRevoked())
                .orElse(false);
        System.out.println("isTokenValid is "+isTokenValid);
        //System.out.println("SecurityContextHolder.getContext().getAuthentication() is "+SecurityContextHolder.getContext().getAuthentication());
        if (userEmail != null ) {
            UserDetails userDetails = this.userDetailsService.loadUserByUsername(userEmail);
            if (jwtService.isTokenValid(token, userDetails) && isTokenValid){
                UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(
                        userDetails, null, userDetails.getAuthorities()
                );
                SecurityContextHolder.getContext().setAuthentication(authToken);

                isValid= true;
            }
        }
        } catch (ExpiredJwtException e) {
            // Handle the expired token here and return a 403 Forbidden response
            return UserAuthenticationResponse.builder()
                    .isAuthenticated(false)
                    .role("")
                    .build();
        }
        return UserAuthenticationResponse.builder()
                .isAuthenticated(isValid)
                .role(role)
                .build();
    }




}
