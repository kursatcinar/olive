package com.kursatcinar.olive.model;

public enum UnitOfMeasureType {
    VOLUME("VOLUME"), WEIGHT("WEIGHT");

    private String code;

    private UnitOfMeasureType(String code) { this.code = code; }

    public String getCode() {
        return code;
    }
}
