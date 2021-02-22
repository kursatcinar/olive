package com.kursatcinar.olive.service;

import com.kursatcinar.olive.model.Administrator;

public interface AdministratorService extends CrudService<Administrator, Long> {

    Administrator findByFirstName(String firstName);
    Administrator findByLastName(String lastName);
    Administrator findByEmail(String email);
}
