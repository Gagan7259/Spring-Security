package com.UserRating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserRatingApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserRatingApplication.class, args);
    }

}
