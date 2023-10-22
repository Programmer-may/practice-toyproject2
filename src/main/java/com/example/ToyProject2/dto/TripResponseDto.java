package com.example.ToyProject2.dto;

import com.example.ToyProject2.domain.entity.Trip;
import com.example.ToyProject2.domain.type.TripType;
import lombok.ToString;

import java.time.LocalDate;


public record TripResponseDto(
        Long id,

        String name,

        LocalDate start_date,
        LocalDate end_date,

        int tripType
) {
    public TripResponseDto(Trip trip) {
        this(
                trip.getId(),
                trip.getName(),
                trip.getStart_date(),
                trip.getEnd_date(),
                trip.getTripType()
        );
    }
}
