package com.kursatcinar.olive.repository;

import com.kursatcinar.olive.model.Address;
import com.kursatcinar.olive.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AddressRepository extends CrudRepository<Address, Long> {

    Optional<Address> findByTitle(String title);
    Optional<Address> findByCountry(String country);
    Optional<Address> findByCity(String city);
    Optional<Address> findByDistrict(String district);
    Optional<Address> findByAddress(String address);
    Optional<Address> findByPrimaryFlag(Boolean primaryFlag);
    Optional<Address> findByCustomer(Customer customer);
}
