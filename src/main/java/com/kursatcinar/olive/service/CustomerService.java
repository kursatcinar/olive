package com.kursatcinar.olive.service;

import com.kursatcinar.olive.model.Customer;

public interface CustomerService extends CrudService<Customer, Long> {
    Customer findByTckn (String tckn);
    Customer findByFirstName (String firstName);
    Customer findByLastName (String lastName);
    Customer findByEmail (String email);
}
