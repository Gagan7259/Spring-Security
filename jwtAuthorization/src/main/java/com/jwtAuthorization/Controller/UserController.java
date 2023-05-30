package com.jwtAuthorization.Controller;

import com.jwtAuthorization.Model.Roles;
import com.jwtAuthorization.Model.User;
import com.jwtAuthorization.Serivice.Impl.UserServiceImpl;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
    @Autowired
    private UserServiceImpl userService;


    //create user
    @PostMapping("/user/save")
    public ResponseEntity<User> createuser(@RequestBody User user) {
        return ResponseEntity.ok().body(userService.saveuser(user));
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getusers() {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/user/save").toUriString());
        return ResponseEntity.created(uri).body(userService.getallusers());
    }

    //create role
    @PostMapping("/role/save")
    public ResponseEntity<Roles> createrole(@RequestBody Roles roles) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/role/save").toUriString());
        return ResponseEntity.created(uri).body(userService.addRole(roles));
    }



@PostMapping("/api/addroletouser")
    public ResponseEntity addroletouser(@RequestBody RoleForm Form){
        return  ResponseEntity.ok().body(userService.addRoletoUser(Form.getUsername(), Form.roleName));)
    }

    @Data
    public class RoleForm {
        private String roleName;
        private String username;
    }
}
