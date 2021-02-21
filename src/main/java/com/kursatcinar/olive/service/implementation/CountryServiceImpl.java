package com.kursatcinar.olive.service.implementation;

import com.kursatcinar.olive.model.Country;
import com.kursatcinar.olive.repository.CountryRepository;
import com.kursatcinar.olive.service.CountryService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public Optional<Country> findByName(String name) {
        return countryRepository.findByName(name);
    }

    @Override
    public Optional<Country> findByPlateCode(String plateCode) {
        return countryRepository.findByPlateCode(plateCode);
    }

    @Override
    public Optional<Country> findByPhoneCode(String phoneCode) {
        return countryRepository.findByPhoneCode(phoneCode);
    }

    @Override
    public Set<Country> findAll() {
        Set<Country> countrySet = new HashSet<>();
        countryRepository.findAll().forEach(countrySet::add);
        return countrySet;
    }

    @Override
    public Country findById(Long aLong) {
        return countryRepository.findById(aLong).orElse(null);
    }

    @Override
    public Country save(Country object) {
        return countryRepository.save(object);
    }

    @Override
    public void delete(Country object) {
        countryRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        countryRepository.deleteById(aLong);
    }
}
