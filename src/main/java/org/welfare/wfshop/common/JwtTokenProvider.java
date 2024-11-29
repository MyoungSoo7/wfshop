package org.welfare.wfshop.common;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;

import java.security.Key;
import java.util.Date;

@Slf4j
public class JwtTokenProvider {

    private final Key secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS256);
    private static final long TOKEN_VALIDITY_IN_MILLISECONDS = 3600000;

    @Bean
    public String createToken(String userId, String role) {
        Date now = new Date();
        Date validity = calculateValidity(now);
        return buildToken(userId, role, now, validity);
    }
    private Date calculateValidity(Date now) {
        return new Date(now.getTime() + TOKEN_VALIDITY_IN_MILLISECONDS);
    }

    private String buildToken(String userId, String role, Date issuedAt, Date expiration) {
        return Jwts.builder()
                .setSubject(userId)
                .claim("role", role)
                .setIssuedAt(issuedAt)
                .setExpiration(expiration)
                .signWith(secretKey)
                .compact();
    }

    public Key getSecretKey() {
        return secretKey;
    }
}

