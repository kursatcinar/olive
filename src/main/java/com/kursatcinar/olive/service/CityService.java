package com.kursatcinar.olive.service;

import com.kursatcinar.olive.model.City;
import com.kursatcinar.olive.model.Country;

public interface CityService extends CrudService<City, Long> {

    City findByCountry (Country country);
    City findByPlateCode (String plateCode);
    City findByName (String name);

}
