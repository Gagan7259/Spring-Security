package com.jwtAuthorization.Serivice;

import com.jwtAuthorization.Model.Roles;
import com.jwtAuthorization.Model.User;

import java.util.List;

public interface UserService {
    User saveuser(User user);
    Roles addRole(Roles roles);
    void  addRoletoUser(String username,String roleName);
User getuser(String username);
    List<User> getallusers();
}
