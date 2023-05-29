package com.springsecurity2023.Controller;

import com.springsecurity2023.Model.User;
import com.springsecurity2023.Service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    //create user
    @PostMapping
    public String createuser(@RequestBody User user){
        return  userService.saveuser(user);
    }

    //get all users
    @GetMapping
    public List<User> findallusers(){
        return  userService.getallusers();
    }

    //user find by name
    @GetMapping("/{name}")
    public Optional<User> findUserbyname(@PathVariable String  name){
        return  userService.findbyname(name);
    }
}
