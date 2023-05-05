package com.Practise2.Service;

import com.Practise2.Entity.Hotel;

import java.util.List;

public interface HotelService {

    //create hotel

    Hotel createhotel(Hotel hotel);

    //getall hotels

    List<Hotel> getallHotels();

    //single hotel
    Hotel getsinglehotel(String id);
}
