package com.kursatcinar.olive.repository;

import com.kursatcinar.olive.model.Administrator;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AdministratorRepository extends CrudRepository<Administrator, Long> {
    Optional<Administrator> findByFirstName(String firstName);
    Optional<Administrator> findByLastName(String lastName);
    Optional<Administrator> findByEmail(String email);
}
