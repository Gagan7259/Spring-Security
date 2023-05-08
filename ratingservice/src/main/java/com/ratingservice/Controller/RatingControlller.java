package com.ratingservice.Controller;

import com.ratingservice.Entity.Ratingg;
import com.ratingservice.Service.RatingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingControlller {

    private RatingService ratingService;

    //create
    @PostMapping
    public ResponseEntity<Ratingg> createrating(@RequestBody Ratingg ratingg) {
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.createrating(ratingg));
    }

    //getall
    @GetMapping
    public ResponseEntity<List<Ratingg>> getrating() {
        return ResponseEntity.ok(ratingService.getallratings());
    }

    //get all Hotelid ratings
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Ratingg>> getHotelrating(@PathVariable String hotelId) {
        return ResponseEntity.ok(ratingService.getallhotelRatings(hotelId));
    }

    //get all by userid
    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Ratingg>> getuserrating(@PathVariable String userId) {
        return ResponseEntity.ok(ratingService.getalluserRatings(userId));
    }
}
