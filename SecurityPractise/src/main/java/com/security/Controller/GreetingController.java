package com.security.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
public class GreetingController {

    @GetMapping
    public ResponseEntity<String> greeting() {
        return ResponseEntity.ok("Hello form bottom of my heart");
    }

    @GetMapping("/goodbye")
    public ResponseEntity<String> goodbye() {
        return ResponseEntity.ok("Get out from here");
    }
}
