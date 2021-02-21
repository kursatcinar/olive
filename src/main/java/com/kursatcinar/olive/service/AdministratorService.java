package com.kursatcinar.olive.service;

import com.kursatcinar.olive.model.Administrator;

import java.util.Optional;

public interface AdministratorService extends CrudService<Administrator, Long> {

    Optional<Administrator> findByFirstName(String firstName);
    Optional<Administrator> findByLastName(String lastName);
    Optional<Administrator> findByEmail(String email);
}
