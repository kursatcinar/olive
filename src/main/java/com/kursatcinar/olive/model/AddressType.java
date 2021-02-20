package com.kursatcinar.olive.model;

public enum AddressType {

    HOME("H"), WORK("W"), OTHER("O");

    private String code;

    private AddressType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
