package com.security.JWT;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

@Component
public class JwtUtills {
    private final String JwtSigninKey = "secret";

    private boolean istokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }

    public String extractUsername(String token) {
        return extraClaim(token, Claims::getSubject);
    }

    public Date extractExpiration(String token) {
        return extraClaim(token, Claims::getExpiration);
    }

    public <T> T extraClaim(String token, Function<Claims, T> calimsResolver) {
        final Claims claims = extractAllClaims(token);
        return calimsResolver.apply(claims);
    }

    public boolean hasClaim(String token, String claimName) {
        final Claims claims = extractClaims(token);
        return claims.get(claimName) != null;
    }

    private Claims extractClaims(String token) {
        return Jwts.parser().setSigningKey(JwtSigninKey).parseClaimsJws(token).getBody();
    }

    private Claims extractAllClaims(String token) {
        return (Claims) Jwts.parser().setSigningKey(JwtSigninKey);
    }

    public String genarateToken(UserDetails userDetails) {
        Map<String, Object> claims = new HashMap<>();
        return createToken(claims, userDetails);
    }

    public String genarateToken(UserDetails userDetails, Map<String, Object> claims) {
        return createToken(claims, userDetails);
    }

    public String createToken(Map<String, Object> claims, UserDetails userDetails) {

        return Jwts
                .builder()
                .setClaims(claims)
                .setSubject(userDetails.getUsername())
                .claim("authorities", userDetails.getAuthorities())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + TimeUnit.HOURS.toMillis(24)))
                .signWith(SignatureAlgorithm.HS256, JwtSigninKey).compact();
    }

    public boolean isTokenValid(String token, UserDetails userDetails) {
        final String username = extractUsername(token);
        return (username.equals(userDetails.getUsername()) && !istokenExpired(token));
    }
}
