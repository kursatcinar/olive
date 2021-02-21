package com.kursatcinar.olive.repository;

import com.kursatcinar.olive.model.Customer;
import com.kursatcinar.olive.model.Telephone;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TelephoneRepository extends CrudRepository<Telephone, Long> {

    Optional<Telephone> findByTitle(String title);
    Optional<Telephone> findByCountryCode(String countryCode);
    Optional<Telephone> findByAreaCode(String areaCode);
    Optional<Telephone> findByPhoneNumber(String phoneNumber);
    Optional<Telephone> findByPrimaryFlag(Boolean primaryFlag);
    Optional<Telephone> findByCustomer(Customer customer);
}
