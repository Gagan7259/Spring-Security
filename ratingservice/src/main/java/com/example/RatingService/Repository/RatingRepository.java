package com.example.RatingService.Repository;

import com.example.RatingService.Model.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RatingRepository extends MongoRepository<Rating, String> {

    //custom methods

    List<Rating> findByuserId(String userId);

    List<Rating> findByhotelId(String hotelId);
}
