package com.jav8.training.interview.sortMapByValue;

import java.util.*;

public class SortMapByValue {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 10, "B", 5, "C", 15);
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));
    }
}
