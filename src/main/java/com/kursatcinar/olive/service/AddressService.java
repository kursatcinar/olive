package com.kursatcinar.olive.service;

import com.kursatcinar.olive.model.*;

import java.util.Optional;

public interface AddressService extends CrudService<Address, Long> {
    Optional<Address> findByTitle(String title);
    Optional<Address> findByCountry(Country country);
    Optional<Address> findByCity(City city);
    Optional<Address> findByDistrict(District district);
    Optional<Address> findByAddress(String address);
    Optional<Address> findByPrimaryFlag(Boolean primaryFlag);
    Optional<Address> findByCustomer(Customer customer);
}
