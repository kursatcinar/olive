package com.kursatcinar.olive.converter;

import com.kursatcinar.olive.model.UnitOfMeasureType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class UnitOfMeasureTypeConverter implements AttributeConverter<UnitOfMeasureType, String> {

    @Override
    public String convertToDatabaseColumn(UnitOfMeasureType unitOfMeasureType) {
        if (unitOfMeasureType == null) {
            return null;
        }
        return unitOfMeasureType.getCode();
    }

    @Override
    public UnitOfMeasureType convertToEntityAttribute(String code) {
        if (code == null) {
            return null;
        }
        return Stream.of(UnitOfMeasureType.values())
                .filter(c -> c.getCode().equals(code))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
