package com.jwtAuthorization.Serivice.Impl;

import com.jwtAuthorization.Model.Roles;
import com.jwtAuthorization.Model.User;
import com.jwtAuthorization.Repository.RoleRepository;
import com.jwtAuthorization.Repository.UserRepository;
import com.jwtAuthorization.Serivice.UserService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
@Transactional
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private RoleRepository roleRepository;

    @Override
    public User saveuser(User user) {
        log.info("Saved New User{} To The  DataBase", user.getName());
        return userRepository.save(user);
    }

    @Override
    public Roles addRole(Roles roles) {
        log.info("Saved New Role{} To The DataBase", roles.getName());
        return roleRepository.save(roles);
    }

    @Override
    public void addRoletoUser(String username, String roleName) {
        log.info("Adding role{} to User{}", username, roleName);
        User user = userRepository.findByUsername(username);
        Roles roles = roleRepository.findByname(roleName);
        user.getRoles().add(roles);
    }

    @Override
    public User getuser(String username) {
        log.info("Fetching one user", username);
        return userRepository.findByUsername(username);
    }


    @Override
    public List<User> getallusers() {
        log.info("Fetching all users");
        return userRepository.findAll();
    }
}
