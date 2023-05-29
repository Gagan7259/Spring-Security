package com.UserRating.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "miceoservices")
public class User {
    @Id
    @Column(name = "ID")

    private String UserId;
    @Column(name = "NAME", length = 20)

    private String name;
    @Column(name = "EMAIL")

    private String email;
    @Column(name = "ABOUT")

    private String about;
}
