package com.kursatcinar.olive.repository;

import org.springframework.data.repository.CrudRepository;
import com.kursatcinar.olive.model.Country;

public interface CountryRepository extends CrudRepository<Country, Long> {
    Country findByName(String name);
    Country findByPlateCode(String plateCode);
    Country findByPhoneCode(String phoneCode);
}
