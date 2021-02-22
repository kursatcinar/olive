package com.kursatcinar.olive.repository;

import com.kursatcinar.olive.model.Country;
import com.kursatcinar.olive.model.Customer;
import com.kursatcinar.olive.model.Telephone;
import org.springframework.data.repository.CrudRepository;

public interface TelephoneRepository extends CrudRepository<Telephone, Long> {

    Telephone findByTitle(String title);
    Telephone findByCountry(Country country);
    Telephone findByAreaCode(String areaCode);
    Telephone findByPhoneNumber(String phoneNumber);
    Telephone findByPrimaryFlag(Boolean primaryFlag);
    Telephone findByCustomer(Customer customer);
}
