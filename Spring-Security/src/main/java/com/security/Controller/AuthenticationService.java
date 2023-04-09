package com.security.Controller;

import Repository.UserRepository;
import com.security.Model.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;

    public AuthenticationResponse rigister(RegisterRequest request) {
        var user1 = User.builder()
                .username(request.getFname())
                .username(request.getLname())
                .username((request.getEmail()))
                .password(passwordEncoder.encode(request.getPassword()))
                .roles(String.valueOf(Role.User))
                .build();
        //repository.save(user1);
        return null;
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        return null;
    }
}
