package com.UserRating.Service;

import com.UserRating.Model.User;

import java.util.List;

public interface UserService {
    //create user
    User saveUser(User user);

    //get all users
    List<User> getallusers();

    //get single user
    User getUser(String userId);

    //delete
    User deleteuser(String userId);

    //update
    User UpdateUser(String userId);
}
