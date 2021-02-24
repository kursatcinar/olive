package com.kursatcinar.olive.service.implementation;

import com.kursatcinar.olive.model.UnitOfMeasure;
import com.kursatcinar.olive.model.UnitOfMeasureType;
import com.kursatcinar.olive.repository.UnitOfMeasureRepository;
import com.kursatcinar.olive.service.UnitOfMeasureService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UnitOfMeasureServiceImpl implements UnitOfMeasureService {

    private final UnitOfMeasureRepository unitOfMeasureRepository;

    public UnitOfMeasureServiceImpl(UnitOfMeasureRepository unitOfMeasureRepository) {
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @Override
    public UnitOfMeasure findByName(String name) {
        return unitOfMeasureRepository.findByName(name);
    }

    @Override
    public UnitOfMeasure findByType(UnitOfMeasureType type) {
        return unitOfMeasureRepository.findByType(type);
    }

    @Override
    public UnitOfMeasure findByAbbreviation(String abbreviation) {
        return unitOfMeasureRepository.findByAbbreviation(abbreviation);
    }

    @Override
    public Set<UnitOfMeasure> findAll() {
        Set<UnitOfMeasure> unitOfMeasureSet = new HashSet<>();
        unitOfMeasureRepository.findAll().forEach(unitOfMeasureSet::add);
        return unitOfMeasureSet;
    }

    @Override
    public UnitOfMeasure findById(Long aLong) {
        return unitOfMeasureRepository.findById(aLong).orElse(null);
    }

    @Override
    public UnitOfMeasure save(UnitOfMeasure object) {
        return unitOfMeasureRepository.save(object);
    }

    @Override
    public void delete(UnitOfMeasure object) {
        unitOfMeasureRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        unitOfMeasureRepository.deleteById(aLong);
    }
}
