package com.kursatcinar.olive.repository;

import com.kursatcinar.olive.model.Customer;
import com.kursatcinar.olive.model.Telephone;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    Optional<Customer> findByTckn (String tckn);
    Optional<Customer> findByFirstName (String firstName);
    Optional<Customer> findByLastName (String lastName);
    Optional<Customer> findByEmail (String email);
}
