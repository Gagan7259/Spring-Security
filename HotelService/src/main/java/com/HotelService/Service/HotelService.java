package com.HotelService.Service;

import com.HotelService.Entity.Hotel;

import java.util.List;

public interface HotelService {
    //create
    Hotel create(Hotel hotel);

    //getall
    List<Hotel> getall();

    //getsingle
    Hotel getone(String id);
}
