package com.example.demo.api.response;


import lombok.Data;
import org.springframework.security.core.userdetails.UserDetails;

@Data
public class AuthenticationResponse {
    private String username;
    private String accessToken;

    public AuthenticationResponse(String token, UserDetails userDetails) {
        this.username = userDetails.getUsername();
        this.accessToken = token;
    }
}
