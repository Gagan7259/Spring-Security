package com.Practise2.Service.Impl;

import com.Practise2.Entity.Hotel;
import com.Practise2.Exception.ResourcenotfoundException;
import com.Practise2.Repository.HotelRepository;
import com.Practise2.Service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service

public class HotelServiceimpl implements HotelService {
    @Autowired

    private HotelRepository hotelRepository;

    @Override
    public Hotel createhotel(Hotel hotel) {
        String hotelid = UUID.randomUUID().toString();
        hotel.setId(hotelid);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getallHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getsinglehotel(String id) {
        return hotelRepository.findById(id).orElseThrow(() -> new ResourcenotfoundException("Opps!!!! Hotel Not Found"));
    }
}
