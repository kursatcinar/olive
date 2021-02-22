package com.kursatcinar.olive.repository;

import com.kursatcinar.olive.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    Customer findByTckn (String tckn);
    Customer findByFirstName (String firstName);
    Customer findByLastName (String lastName);
    Customer findByEmail (String email);
}
