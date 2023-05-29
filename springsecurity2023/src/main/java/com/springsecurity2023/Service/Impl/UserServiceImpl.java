package com.springsecurity2023.Service.Impl;

import com.springsecurity2023.Model.User;
import com.springsecurity2023.Repository.UserRepository;
import com.springsecurity2023.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getallusers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findbyname(String name) {
        return userRepository.findByname(name);
    }

    @Override
    public String saveuser(User user) {
        User user1 = userRepository.save(user);
        if (user1 != null && user1.getName() != "") {
            return "HuRRy USER SUCCESSFULLY CREATED";
        }
        return "Pleasr Try Again";
    }
}
