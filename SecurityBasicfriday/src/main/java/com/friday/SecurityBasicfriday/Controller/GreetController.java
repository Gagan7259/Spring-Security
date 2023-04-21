package com.friday.SecurityBasicfriday.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greet")
public class GreetController {

    @GetMapping
    public ResponseEntity<String> h(){
        return  ResponseEntity.ok("How r u buddy");
    }

    @GetMapping("/bye")
    public  ResponseEntity<String> bye(){
        return  ResponseEntity.ok("Pora bey");
    }
}
