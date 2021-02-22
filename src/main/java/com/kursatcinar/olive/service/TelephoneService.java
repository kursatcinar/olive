package com.kursatcinar.olive.service;

import com.kursatcinar.olive.model.Country;
import com.kursatcinar.olive.model.Customer;
import com.kursatcinar.olive.model.Telephone;

public interface TelephoneService extends CrudService<Telephone,Long> {
    Telephone findByTitle(String title);
    Telephone findByCountry(Country country);
    Telephone findByAreaCode(String areaCode);
    Telephone findByPhoneNumber(String phoneNumber);
    Telephone findByPrimaryFlag(Boolean primaryFlag);
    Telephone findByCustomer(Customer customer);
}
