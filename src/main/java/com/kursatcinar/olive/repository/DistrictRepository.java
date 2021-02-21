package com.kursatcinar.olive.repository;

import com.kursatcinar.olive.model.City;
import com.kursatcinar.olive.model.District;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface DistrictRepository extends CrudRepository<District, Long> {
    Optional<District> findByName(String name);
    Optional<District> findByCity(City city);
}
