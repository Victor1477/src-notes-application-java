package com.mongodb.notes.security.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Random;

@Service
public class TokenService {
    private static String SECRET_SUBJECT;

    @Value("${api.jwt.algorithm.secret}")
    private String secret;

    public String generateToken(UserDetails user) {
        Algorithm algorithm = Algorithm.HMAC256(secret + getSecretSubject());
        return JWT.create().withIssuer("notes-application")
                .withSubject(user.getUsername())
                .withExpiresAt(generateExpirationDate())
                .sign(algorithm);
    }

    public String validateToken(String token) {
        Algorithm algorithm = Algorithm.HMAC256(secret + getSecretSubject());
        return JWT.require(algorithm)
                .withIssuer("notes-application")
                .build()
                .verify(token)
                .getSubject();
    }

    private static String getSecretSubject() {
        if (SECRET_SUBJECT == null) {
            SECRET_SUBJECT = generateRandomString();
        }
        return SECRET_SUBJECT;
    }

    private static String generateRandomString() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 2048; i++) {
            sb.append((char) random.nextInt(97, 123));
        }
        return sb.toString();
    }

    public Instant generateExpirationDate() {
        return LocalDateTime.now(ZoneId.of("America/Sao_Paulo")).plusHours(4).toInstant(ZoneOffset.of("-03:00"));
    }
}
