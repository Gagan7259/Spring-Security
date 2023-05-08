package com.ratingservice.Service;

import com.ratingservice.Entity.Ratingg;

import java.util.List;

public interface RatingService {

    //create rating
    public Ratingg createrating(Ratingg ratingg);

    //get all rating
    List<Ratingg> getallratings();


    //get all by userid
    List<Ratingg> getalluserRatings(String userId);

    //get all by hotelid
    List<Ratingg> getallhotelRatings(String hotelId);

}
