package com.kursatcinar.olive.service.implementation;

import com.kursatcinar.olive.model.City;
import com.kursatcinar.olive.model.Country;
import com.kursatcinar.olive.repository.CityRepository;
import com.kursatcinar.olive.service.CityService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public City findByCountry(Country country) {
        return cityRepository.findByCountry(country);
    }

    @Override
    public City findByPlateCode(String plateCode) {
        return cityRepository.findByPlateCode(plateCode);
    }

    @Override
    public City findByName(String name) {
        return cityRepository.findByName(name);
    }

    @Override
    public Set<City> findAll() {
        Set<City> citySet = new HashSet<>();
        cityRepository.findAll().forEach(citySet::add);
        return citySet;
    }

    @Override
    public City findById(Long aLong) {
        return cityRepository.findById(aLong).orElse(null);
    }

    @Override
    public City save(City object) {
        return cityRepository.save(object);
    }

    @Override
    public void delete(City object) {
        cityRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        cityRepository.deleteById(aLong);
    }
}
