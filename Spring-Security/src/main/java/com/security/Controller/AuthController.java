package com.security.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthenticationService service;

    @PostMapping("/rigister")
    public ResponseEntity<AuthenticationResponse> rigister(
            @RequestBody RegisterRequest request) {

        return ResponseEntity.ok(service.rigister(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> rigister(@RequestBody AuthenticationRequest request) {

        return ResponseEntity.ok(service.authenticate(request))
                ;
    }

}
