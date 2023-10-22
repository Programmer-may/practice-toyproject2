package com.example.ToyProject2.service;

import com.example.ToyProject2.domain.entity.Trip;
import com.example.ToyProject2.dto.TripResponseDto;
//import com.example.ToyProject2.repository.ItineraryRepository;
import com.example.ToyProject2.repository.TripRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TripService {
    private final TripRepository tripRepository;
    //private final ItineraryRepository itineraryRepository;

    public List<TripResponseDto> findAllTrips() {
        List<Trip> trips = tripRepository.findAll();
        List<TripResponseDto> tripResponseDtos = new ArrayList<>();
        for(Trip trip : trips){
            TripResponseDto tripResponseDto = new TripResponseDto(trip);
            tripResponseDtos.add(tripResponseDto);
        }
        return tripResponseDtos;
    }
}
