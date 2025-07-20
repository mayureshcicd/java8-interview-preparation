package com.jav8.training.learn.javaBeansPropertyDescriptor;

public class Person {
    private String seaferCode;
    private String address;

    public Person(String seaferCode, String address) {
        this.seaferCode = seaferCode;
        this.address = address;
    }

    public void setSeaferCode(String seaferCode) {
        this.seaferCode = seaferCode;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSeaferCode() {
        return seaferCode;
    }

    public String getAddress() {
        return address;
    }
}
