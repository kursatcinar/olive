package com.kursatcinar.olive.repository;

import com.kursatcinar.olive.model.City;
import com.kursatcinar.olive.model.Country;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CityRepository extends CrudRepository<City, Long> {
    Optional<City> findByCountry (Country country);
    Optional<City> findByPlateCode (String plateCode);
    Optional<City> findByName (String name);
}
