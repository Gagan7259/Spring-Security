package com.Practise2.Controller;

import com.Practise2.Entity.Hotel;
import com.Practise2.Service.Impl.HotelServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/Hotels")
public class HotelController {
    @Autowired
    private HotelServiceimpl hotelServiceimpl;

    //api create
    @PostMapping
    public ResponseEntity<Hotel> Createhotel(@RequestBody Hotel hotel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelServiceimpl.createhotel(hotel));
    }

    //getall hotels
    @GetMapping
    public ResponseEntity<List<Hotel>> getallHotels() {
        return ResponseEntity.ok(hotelServiceimpl.getallHotels());
    }

    //singleone
    @GetMapping("/{hid}")
    public ResponseEntity<Hotel> getonehotel(@PathVariable String hid) {
        return ResponseEntity.status(HttpStatus.OK).body(hotelServiceimpl.getsinglehotel(hid));
    }
}
