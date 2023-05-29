package com.springsecurity2023.Repository;

import com.springsecurity2023.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "select * from user where name=?1", nativeQuery = true)
    Optional<User> findByname(String name);
}
