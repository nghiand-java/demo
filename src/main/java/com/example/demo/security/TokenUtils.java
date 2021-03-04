package com.example.demo.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.example.demo.ultis.Dates;
import org.apache.commons.lang3.time.DateUtils;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
public class TokenUtils {

    private static final Logger logger = LoggerFactory.getLogger(TokenUtils.class);

    @Value("${jwt.client-secret}")
    private String clientSecret;

    @Value("${jwt.clientId}")
    private String clientId;

    @Value("${jwt.accessTokenValidititySeconds}")
    private int tokenValiditySeconds;

    public String generateJwtToken(Authentication authentication) {

        UserDetailsImpl userPrincipal = (UserDetailsImpl) authentication.getPrincipal();
        String token = "";
        try {
            Algorithm algorithm = Algorithm.HMAC256(clientSecret);
            token = JWT.create()
                    .withIssuer(clientId)
                    .withSubject(userPrincipal.getUsername())
                    .withExpiresAt(Dates.plusSeconds(tokenValiditySeconds))
                    .sign(algorithm);
        } catch (JWTCreationException exception) {
            //Invalid Signing configuration / Couldn't convert Claims.
        }
        return token;
    }

    public String getUserNameFromJwtToken(String token) {
        String username = "";
        try {
            Algorithm algorithm = Algorithm.HMAC256(clientSecret);
            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT jwt = verifier.verify(token);
            username = jwt.getSubject();
        } catch (JWTVerificationException exception) {
            //Invalid signature/claims
        }
        return username;
    }

    public boolean validateJwtToken(String authToken) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(clientSecret);
            JWTVerifier verifier = JWT.require(algorithm).build();
            verifier.verify(authToken);
            return true;
        } catch (JWTVerificationException exception) {
            //Invalid signature/claims
            logger.error(exception.getMessage());
        }
        return false;
    }
}
