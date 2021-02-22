package com.kursatcinar.olive.service;

import com.kursatcinar.olive.model.City;
import com.kursatcinar.olive.model.District;

public interface DistrictService extends CrudService<District, Long> {
    District findByName(String name);
    District findByCity(City city);
}
