package com.kursatcinar.olive.service;

import com.kursatcinar.olive.model.Customer;

import java.util.Optional;

public interface CustomerService extends CrudService<Customer, Long> {
    Optional<Customer> findByTckn (String tckn);
    Optional<Customer> findByFirstName (String firstName);
    Optional<Customer> findByLastName (String lastName);
    Optional<Customer> findByEmail (String email);
}
