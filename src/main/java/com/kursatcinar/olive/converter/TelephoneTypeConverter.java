package com.kursatcinar.olive.converter;

import com.kursatcinar.olive.model.TelephoneType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class TelephoneTypeConverter implements AttributeConverter<TelephoneType,String> {

    @Override
    public String convertToDatabaseColumn(TelephoneType telephoneType) {
        if (telephoneType == null) {
            return null;
        }
        return telephoneType.getCode();
    }

    @Override
    public TelephoneType convertToEntityAttribute(String code) {
        if (code == null) {
            return null;
        }
        return Stream.of(TelephoneType.values())
                .filter(c -> c.getCode().equals(code))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
