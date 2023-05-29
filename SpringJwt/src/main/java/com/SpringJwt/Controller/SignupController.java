package com.SpringJwt.Controller;

import com.SpringJwt.DTO.SignUpDto;
import com.SpringJwt.Services.Impl.AuthServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignupController {

    @Autowired
    private AuthServiceImpl authService;

    public ResponseEntity<SignUpDto> signupuser(@RequestBody SignUpDto signUpDto)

}
