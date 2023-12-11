package com.service.gateway.filter;

import com.service.gateway.response.UserAuthenticationResponse;
import com.service.gateway.util.JwtUtil;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import javax.naming.AuthenticationException;
import java.util.List;

@Component
public class AuthenticationFilter extends AbstractGatewayFilterFactory<AuthenticationFilter.Config> {


    private RouteValidator validator;
    //private RestTemplate template;
    private JwtUtil jwtUtil;
    private final WebClient.Builder webClient;

    public AuthenticationFilter(RouteValidator validator, JwtUtil jwtUtil, WebClient.Builder webClient) {
        super(Config.class);
        this.validator = validator;
       // this.template = template;
        this.jwtUtil = jwtUtil;
        this.webClient = webClient;
    }
    //work
   /* @Override
    public GatewayFilter apply(Config config) {
        return ((exchange, chain) -> {
            if (validator.isSecured.test(exchange.getRequest())) {
                //header contains token or not
                if (!exchange.getRequest().getHeaders().containsKey(HttpHeaders.AUTHORIZATION)) {
                    throw new RuntimeException("missing authorization header");
                }

                String authHeader = exchange.getRequest().getHeaders().get(HttpHeaders.AUTHORIZATION).get(0);
                if (authHeader != null && authHeader.startsWith("Bearer ")) {
                    authHeader = authHeader.substring(7);

                }
                System.out.println("token : "+authHeader);


                    return  webClient.build()
                            .post()
                            .uri("http://localhost:8222/api/v1/auth/validate")
                            .body(Mono.just(authHeader), String.class)
                            .retrieve()
                            .bodyToMono(Boolean.class)
                            //.block() // Block to wait for the response;
                            .flatMap(response -> {
                                // Handle the response here, e.g., log or validate
                                System.out.println("response : "+response);
                                if (response) {
                                    return chain.filter(exchange);
                                } else {
                                    throw new RuntimeException("unauthorized access to application");
                                }
                            });



            }
            return chain.filter(exchange);
        });

    }*/
  /*  @Override
    public GatewayFilter apply(Config config) {

        return ((exchange, chain) -> {
            String requiredRole = config.getRole();
            if (validator.isSecured.test(exchange.getRequest())) {
                //header contains token or not
                System.out.println("exchange.getRequest() "+exchange.getRequest().getPath());
                System.out.println(("header : "+exchange.getRequest().getHeaders()));
                if (!exchange.getRequest().getHeaders().containsKey(HttpHeaders.AUTHORIZATION)) {
                    throw new RuntimeException("missing authorization header");
                }

                String authHeader = exchange.getRequest().getHeaders().get(HttpHeaders.AUTHORIZATION).get(0);
                if (authHeader != null && authHeader.startsWith("Bearer ")) {
                    authHeader = authHeader.substring(7);

                }
                System.out.println("token : "+authHeader);


                return  webClient.build()
                        .post()
                        .uri("http://localhost:8222/api/v1/auth/validate")
                        .body(Mono.just(authHeader), String.class)
                        .retrieve()
                        .bodyToMono(String.class)
                        //.block() // Block to wait for the response;
                        .flatMap(response -> {
                            // Handle the response here, e.g., log or validate
                            System.out.println("role : "+response);
                            if (response.equals(requiredRole)) {
                                return chain.filter(exchange);
                            } else {
                                throw new RuntimeException("unauthorized access to application");
                            }
                        });



            }
            return chain.filter(exchange);
        });

    }*/

    @Override
    public GatewayFilter apply(Config config) {
        return ((exchange, chain) -> {
            String requiredRole = config.getRole();
            if (validator.isSecured.test(exchange.getRequest())) {
                // Header contains token or not
                if (!exchange.getRequest().getHeaders().containsKey(HttpHeaders.AUTHORIZATION)) {
                    throw new RuntimeException("Missing authorization header");
                }

                String authHeader = exchange.getRequest().getHeaders().get(HttpHeaders.AUTHORIZATION).get(0);
                System.out.println("token before in gateway filter : "+authHeader);
                if (authHeader != null && authHeader.startsWith("Bearer ")) {
                    authHeader = authHeader.substring(7);
                }

                System.out.println("token after in gateway filter : "+authHeader);

                // Use WebClient to validate the token and get user role
                return webClient.build()
                        .post()
                        .uri("http://localhost:8222/api/v1/auth/isValid")
                        .body(Mono.just(authHeader), String.class)
                        .retrieve()
                       /*.onStatus(HttpStatus.UNAUTHORIZED::equals, response -> {
                            // Handle Unauthorized (401) status code here
                            ServerHttpResponse httpResponse = exchange.getResponse();
                            httpResponse.setStatusCode(HttpStatus.UNAUTHORIZED);
                            return Mono.error(new RuntimeException("Unauthorized access to the application"));
                        })*/
                        .bodyToMono(UserAuthenticationResponse.class)
                        .flatMap(response -> {
                            // Handle the response here, e.g., log or validate
                            //if (response.getStatus().equals(HttpStatus.ACCEPTED)) {
                                if (response.isAuthenticated()) {
                                    System.out.println(response);
                                    // Check user role
                                    if (response.getRole().equals(requiredRole)) {
                                        // Admin can access both schools and students microservices
                                        return chain.filter(exchange);
                                    }
                                    else {
                                        //throw new RuntimeException("Unknown user role");
                                        ServerHttpResponse httpResponse = exchange.getResponse();
                                        httpResponse.setStatusCode(HttpStatus.FORBIDDEN);

                                        return httpResponse.setComplete();
                                    }
                                }
                            else {
                                ServerHttpResponse httpResponse = exchange.getResponse();
                                httpResponse.setStatusCode(HttpStatus.UNAUTHORIZED);
                                return httpResponse.setComplete();
                                //System.out.println(response);
                                //throw new RuntimeException("Unauthorized access to the application");
                            }
                        });
            }
            return chain.filter(exchange);
        });

    }


    public static class Config {
        private String role; // Define a field for the required role

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }
    }
}
