package com.jwtAuthorization.Controller;

import com.jwtAuthorization.Model.User;
import com.jwtAuthorization.Serivice.Impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
    @Autowired
    private UserServiceImpl userService;


    //create user
    @PostMapping("/users/create")
    public ResponseEntity<User> createuser(@RequestBody User user){
        return  ResponseEntity.ok(userService.saveuser(user));
    }
    @GetMapping("/users")
    public  ResponseEntity<List<User>> getusers(){
        return  ResponseEntity.ok(userService.getallusers());
    }
}
