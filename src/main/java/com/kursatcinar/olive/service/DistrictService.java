package com.kursatcinar.olive.service;

import com.kursatcinar.olive.model.City;
import com.kursatcinar.olive.model.District;

import java.util.Optional;

public interface DistrictService extends CrudService<District, Long> {
    Optional<District> findByName(String name);
    Optional<District> findByCity(City city);
}
