package com.kursatcinar.olive.service;

import com.kursatcinar.olive.model.Country;
import com.kursatcinar.olive.model.Customer;
import com.kursatcinar.olive.model.Telephone;

import java.util.Optional;

public interface TelephoneService extends CrudService<Telephone,Long> {
    Optional<Telephone> findByTitle(String title);
    Optional<Telephone> findByCountry(Country country);
    Optional<Telephone> findByAreaCode(String areaCode);
    Optional<Telephone> findByPhoneNumber(String phoneNumber);
    Optional<Telephone> findByPrimaryFlag(Boolean primaryFlag);
    Optional<Telephone> findByCustomer(Customer customer);
}
