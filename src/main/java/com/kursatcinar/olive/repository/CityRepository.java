package com.kursatcinar.olive.repository;

import com.kursatcinar.olive.model.City;
import com.kursatcinar.olive.model.Country;
import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<City, Long> {
    City findByCountry (Country country);
    City findByPlateCode (String plateCode);
    City findByName (String name);
}
