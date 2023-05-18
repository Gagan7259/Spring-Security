package com.example.RatingService.Service;

import com.example.RatingService.Model.Rating;

import java.util.List;

public interface RatingService {
    Rating createratings(Rating rating);

    List<Rating> getallratings();

    List<Rating> getratingbyuserId(String userId);

    List<Rating> getratingbyhotelId(String hotelId);


}
