package com.kursatcinar.olive.repository;

import com.kursatcinar.olive.model.*;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {

    Address findByTitle(String title);
    Address findByCountry(Country country);
    Address findByCity(City city);
    Address findByDistrict(District district);
    Address findByAddress(String address);
    Address findByPrimaryFlag(Boolean primaryFlag);
    Address findByCustomer(Customer customer);
}
