package com.kursatcinar.olive.service.implementation;

import com.kursatcinar.olive.model.City;
import com.kursatcinar.olive.model.District;
import com.kursatcinar.olive.repository.DistrictRepository;
import com.kursatcinar.olive.service.DistrictService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class DistrictServiceImpl implements DistrictService {

    private final DistrictRepository districtRepository;

    public DistrictServiceImpl(DistrictRepository districtRepository) {
        this.districtRepository = districtRepository;
    }

    @Override
    public Optional<District> findByName(String name) {
        return districtRepository.findByName(name);
    }

    @Override
    public Optional<District> findByCity(City city) {
        return districtRepository.findByCity(city);
    }

    @Override
    public Set<District> findAll() {
        Set<District> districtSet = new HashSet<>();
        districtRepository.findAll().forEach(districtSet::add);
        return districtSet;
    }

    @Override
    public District findById(Long aLong) {
        return districtRepository.findById(aLong).orElse(null);
    }

    @Override
    public District save(District object) {
        return districtRepository.save(object);
    }

    @Override
    public void delete(District object) {
        districtRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        districtRepository.deleteById(aLong);
    }
}
