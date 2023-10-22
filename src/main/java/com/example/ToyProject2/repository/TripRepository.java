package com.example.ToyProject2.repository;

import com.example.ToyProject2.domain.entity.Trip;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
@Mapper
public interface TripRepository {
    List<Trip> findAll();

    Optional<Trip> findById(Long id);

    Trip save(Trip trip);
}
