package com.kursatcinar.olive.service;

import com.kursatcinar.olive.model.City;
import com.kursatcinar.olive.model.Country;

import java.util.Optional;

public interface CityService extends CrudService<City, Long> {

    Optional<City> findByCountry (Country country);
    Optional<City> findByPlateCode (String plateCode);
    Optional<City> findByName (String name);

}
