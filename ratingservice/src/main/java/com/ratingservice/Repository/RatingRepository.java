package com.ratingservice.Repository;

import com.ratingservice.Entity.Ratingg;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RatingRepository extends MongoRepository<Ratingg, String> {
//custom finder method


    List<Ratingg> findByUserId(String userid);

    List<Ratingg> findByHotelId(String hotelid);
}
