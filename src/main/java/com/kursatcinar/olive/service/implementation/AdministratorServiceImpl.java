package com.kursatcinar.olive.service.implementation;

import com.kursatcinar.olive.model.Administrator;
import com.kursatcinar.olive.repository.AdministratorRepository;
import com.kursatcinar.olive.service.AdministratorService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class AdministratorServiceImpl implements AdministratorService {

    private final AdministratorRepository administratorRepository;

    public AdministratorServiceImpl(AdministratorRepository administratorRepository) {
        this.administratorRepository = administratorRepository;
    }

    @Override
    public Administrator findByFirstName(String firstName) {
        return administratorRepository.findByFirstName(firstName);
    }

    @Override
    public Administrator findByLastName(String lastName) {
        return administratorRepository.findByLastName(lastName);
    }

    @Override
    public Administrator findByEmail(String email) {
        return administratorRepository.findByEmail(email);
    }

    @Override
    public Set<Administrator> findAll() {
        Set<Administrator> administratorSet = new HashSet<>();
        administratorRepository.findAll().forEach(administratorSet::add);
        return administratorSet;
    }

    @Override
    public Administrator findById(Long aLong) {
        return administratorRepository.findById(aLong).orElse(null);
    }

    @Override
    public Administrator save(Administrator object) {
        return administratorRepository.save(object);
    }

    @Override
    public void delete(Administrator object) {
        administratorRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        administratorRepository.deleteById(aLong);
    }
}
