package com.mongodb.notes.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

@Service
public class TokenService {

    @Value("${api.jwt.algorithm.secret}")
    private String secret;

    public String generateToken(UserDetails user) {
        Algorithm algorithm = Algorithm.HMAC256(secret);
        return JWT.create().withIssuer("notes-application")
                .withSubject(user.getUsername())
                .withExpiresAt(generateExpirationDate())
                .sign(algorithm);
    }

    public String validateToken(String token) {
        Algorithm algorithm = Algorithm.HMAC256(secret);
        return JWT.require(algorithm)
                .withIssuer("notes-application")
                .build()
                .verify(token)
                .getSubject();
    }

    public Instant generateExpirationDate() {
        return LocalDateTime.now(ZoneId.of("America/Sao_Paulo")).plusHours(1).toInstant(ZoneOffset.of("-03:00"));
    }
}
