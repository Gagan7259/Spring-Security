package com.example.RatingService.Service.Impl;

import com.example.RatingService.Model.Rating;
import com.example.RatingService.Repository.RatingRepository;
import com.example.RatingService.Service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {
    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public Rating createratings(Rating rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getallratings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getratingbyuserId(String userId) {
        return ratingRepository.findbyuserId(userId);
    }

    @Override
    public List<Rating> getratingbyhotelId(String hotelId) {
        return ratingRepository.findbyhotelId(hotelId);
    }


}


