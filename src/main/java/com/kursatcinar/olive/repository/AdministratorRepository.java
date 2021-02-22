package com.kursatcinar.olive.repository;

import com.kursatcinar.olive.model.Administrator;
import org.springframework.data.repository.CrudRepository;

public interface AdministratorRepository extends CrudRepository<Administrator, Long> {
    Administrator findByFirstName(String firstName);
    Administrator findByLastName(String lastName);
    Administrator findByEmail(String email);
}
