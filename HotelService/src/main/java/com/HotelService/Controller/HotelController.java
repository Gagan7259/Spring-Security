package com.HotelService.Controller;

import com.HotelService.Entity.Hotel;
import com.HotelService.Service.Impl.HotelserviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelserviceImpl hotelserviceimpl;

    //create
    @PostMapping
    public ResponseEntity<Hotel> createhotel(@RequestBody Hotel hotel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelserviceimpl.create(hotel));
    }

    //get single
    @GetMapping("/{hotelid}")
    public ResponseEntity<Hotel> getsingleone(@PathVariable String hotelid) {
        return ResponseEntity.status(HttpStatus.OK).body(hotelserviceimpl.getone(hotelid));
    }

    //get all
    @GetMapping
    public ResponseEntity<List<Hotel>> getallhotels() {
        return ResponseEntity.ok(hotelserviceimpl.getall());
    }
}

