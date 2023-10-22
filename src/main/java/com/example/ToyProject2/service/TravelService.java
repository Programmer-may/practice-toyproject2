package com.example.ToyProject2.service;

import com.example.ToyProject2.dto.TripResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TravelService {
    private final TripService tripService;
    //private final ItineraryService itineraryService;

    public List<TripResponseDto> findAllTrips() {
        return tripService.findAllTrips();
    }
}
