package com.ratingservice.Service.Impl;

import com.ratingservice.Entity.Ratingg;
import com.ratingservice.Repository.RatingRepository;
import com.ratingservice.Service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {
    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public Ratingg createrating(Ratingg ratingg) {
        return ratingRepository.save(ratingg);
    }

    @Override
    public List<Ratingg> getallratings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Ratingg> getalluserRatings(String userId) {
        return ratingRepository.findByUserId(userId);
    }

    @Override
    public List<Ratingg> getallhotelRatings(String hotelId) {
        return ratingRepository.findByHotelId(hotelId);
    }
}
