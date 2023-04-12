package com.security.Controller;

import com.security.Dto.AutheticationRequest;
import com.security.JWT.JwtUtills;
import com.security.dao.Userdao;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AutheticateController {
    private final AuthenticationManager authenticationManager;
    private final Userdao userdao;
    private final JwtUtills jwtUtills;

    @PostMapping("/authenticate")
    public ResponseEntity<String> autheticate(
            @RequestBody AutheticationRequest request
    ) {

        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
        final UserDetails user = userdao.findUserByEmail(
                request.getEmail());
        if (user != null) {
            return ResponseEntity.ok(jwtUtills.genarateToken(user));

        }
        return ResponseEntity.status(400).body("Some Error occures");
    }
}
