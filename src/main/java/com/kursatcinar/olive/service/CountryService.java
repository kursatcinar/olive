package com.kursatcinar.olive.service;

import com.kursatcinar.olive.model.Country;

import java.util.Optional;

public interface CountryService extends CrudService<Country, Long> {
    Optional<Country> findByName(String name);
    Optional<Country> findByPlateCode(String plateCode);
    Optional<Country> findByPhoneCode(String phoneCode);
}
