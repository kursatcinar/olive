package com.kursatcinar.olive.service;

import com.kursatcinar.olive.model.Country;

public interface CountryService extends CrudService<Country, Long> {
    Country findByName(String name);
    Country findByPlateCode(String plateCode);
    Country findByPhoneCode(String phoneCode);
}
