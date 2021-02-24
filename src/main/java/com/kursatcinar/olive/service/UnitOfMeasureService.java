package com.kursatcinar.olive.service;

import com.kursatcinar.olive.model.UnitOfMeasure;
import com.kursatcinar.olive.model.UnitOfMeasureType;

public interface UnitOfMeasureService extends CrudService<UnitOfMeasure, Long> {
    UnitOfMeasure findByName(String name);
    UnitOfMeasure findByType(UnitOfMeasureType type);
    UnitOfMeasure findByAbbreviation(String abbreviation);
}
