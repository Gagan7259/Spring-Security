package CONTROLLER;

import SERVICE.UserService;
import com.security1.COPY.MODEL.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    //devalop api

    //get all users
    @GetMapping("/uses")
    public List<User> getalluser() {
        return userService.getallUsers();
    }

    //Create user
    @PostMapping("/use")
    public void createUsers(@RequestBody User user) {
        userService.createUser(user);
    }

    //update user
    @PutMapping("/uses")
    public void updateUsers(@RequestBody User user) {
        userService.updateUser(user);
    }

    //Delete mapping
    @DeleteMapping("/uses/{id}")
    public void deleteUsers(@PathVariable Integer id) {
        userService.deletUser(id);
    }

}
