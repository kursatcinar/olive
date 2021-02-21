package com.kursatcinar.olive.repository;

import org.springframework.data.repository.CrudRepository;
import com.kursatcinar.olive.model.Country;

import java.util.Optional;

public interface CountryRepository extends CrudRepository<Country, Long> {
    Optional<Country> findByName(String name);
    Optional<Country> findByPlateCode(String plateCode);
    Optional<Country> findByPhoneCode(String phoneCode);
}
