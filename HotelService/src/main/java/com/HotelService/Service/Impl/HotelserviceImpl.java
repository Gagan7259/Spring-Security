package com.HotelService.Service.Impl;

import com.HotelService.Entity.Hotel;
import com.HotelService.Exception.ResourceNotFoundException;
import com.HotelService.Repository.HotelRepository;
import com.HotelService.Service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelserviceImpl implements HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel create(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getall() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getone(String id) {
        return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("hotel given id not found"));
    }
}
