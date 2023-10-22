package com.example.ToyProject2.domain.entity;

import com.example.ToyProject2.domain.type.TripType;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String name;

    private LocalDate start_date;
    private LocalDate end_date;

    @Enumerated(EnumType.STRING)
    private int tripType;

    //private final List<Itinerary> itineraries = new ArrayList<>();


}
