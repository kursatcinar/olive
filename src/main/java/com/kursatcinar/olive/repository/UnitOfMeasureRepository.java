package com.kursatcinar.olive.repository;

import com.kursatcinar.olive.model.UnitOfMeasure;
import com.kursatcinar.olive.model.UnitOfMeasureType;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    UnitOfMeasure findByName(String name);
    UnitOfMeasure findByType(UnitOfMeasureType type);
    UnitOfMeasure findByAbbreviation(String abbreviation);
}
