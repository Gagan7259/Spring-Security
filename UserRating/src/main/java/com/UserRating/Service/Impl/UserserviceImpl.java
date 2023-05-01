package com.UserRating.Service.Impl;

import com.UserRating.Exception.ResorceNotFoundException;
import com.UserRating.Model.User;
import com.UserRating.Repository.UserRepository;
import com.UserRating.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserserviceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        String randomid = UUID.randomUUID().toString();
        user.setUserId(randomid);
        return userRepository.save(user);
    }

    @Override
    public List<User> getallusers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(() -> new ResorceNotFoundException("User with Given Id Not found on server"));
    }

    @Override
    public User deleteuser(String userId) {
        return null;
    }

    @Override
    public User UpdateUser(String userId) {
        return null;
    }
}
