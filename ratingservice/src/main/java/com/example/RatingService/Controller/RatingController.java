package com.example.RatingService.Controller;

import com.example.RatingService.Model.Rating;
import com.example.RatingService.Service.Impl.RatingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {
    @Autowired
    private RatingServiceImpl ratingService;

    @PostMapping
    public ResponseEntity<Rating> createrating(@RequestBody Rating rating) {
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.createratings(rating));
    }

    @GetMapping
    public ResponseEntity<List<Rating>> getallratings() {
        return ResponseEntity.ok(ratingService.getallratings());
    }
    @GetMapping("/users/{userId}")
    public  ResponseEntity<List<Rating>> getbyusersbyid(@PathVariable String userId){
        return  ResponseEntity.ok(ratingService.getbyuserId(userId));
    }

    @GetMapping("/hotels/{hotelId}")
    public  ResponseEntity<List<Rating>> getbyhotelsbyid(@PathVariable String hotelId){
        return  ResponseEntity.ok(ratingService.getbyhotelId(hotelId));
    }
}
