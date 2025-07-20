package com.jav8.training.logical.logic;

import java.util.Optional;

public class TEstNullOptionalField {
    public static void main(String[] args) {
        Optional<Integer> value=null;
        checkNullOrZero(value);
        EmpData empData=new EmpData();

        checkNullOrZero(empData.getCode());

    }
    public static void checkNullOrZero(Optional<Integer> value) {
        if (Optional.ofNullable( value).orElse(Optional.of(0)).get().equals(0)) {
           System.out.println("Error...................................");
        }
    }
}

