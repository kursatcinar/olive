package com.kursatcinar.olive.repository;

import com.kursatcinar.olive.model.City;
import com.kursatcinar.olive.model.District;
import org.springframework.data.repository.CrudRepository;

public interface DistrictRepository extends CrudRepository<District, Long> {
    District findByName(String name);
    District findByCity(City city);
}
