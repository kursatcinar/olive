package com.kursatcinar.olive.model;

public enum TelephoneType {
    MOBILE("M"), HOME("H"), WORK("W"), OTHER("O");

    private String code;

    private TelephoneType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
