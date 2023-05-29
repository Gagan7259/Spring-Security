package com.jwtAuthorization.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private  String name;

    private  String username;

    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Roles> roles=new ArrayList<>();
}
