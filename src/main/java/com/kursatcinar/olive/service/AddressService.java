package com.kursatcinar.olive.service;

import com.kursatcinar.olive.model.*;

public interface AddressService extends CrudService<Address, Long> {
    Address findByTitle(String title);
    Address findByCountry(Country country);
    Address findByCity(City city);
    Address findByDistrict(District district);
    Address findByAddress(String address);
    Address findByPrimaryFlag(Boolean primaryFlag);
    Address findByCustomer(Customer customer);
}
