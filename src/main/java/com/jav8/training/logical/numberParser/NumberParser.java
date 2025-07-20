package com.jav8.training.logical.numberParser;


import java.util.Arrays;

public class NumberParser {
    public static void main(String[] args) {
        double max = NumberParser.getMaxValueFromCSV("10,20,45.90,85,220");
        System.out.println("\nMax value: " + max);
    }
    public static double getMaxValueFromCSV(String csvNumbers) {
        return Arrays.stream(csvNumbers.split(","))
                .mapToDouble(Double::parseDouble)
                .max().orElseThrow();
    }
}
