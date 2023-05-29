package com.springsecurity2023.Service;

import com.springsecurity2023.Model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    //get all users
    List<User> getallusers();

    //get singleuser
    Optional<User> findbyname(String name);

    String saveuser(User user);
}
