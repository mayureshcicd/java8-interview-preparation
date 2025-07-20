package com.jav8.training.interview.streamComboExample;

import java.util.*;
import java.util.stream.*;

public class SortedExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");

        List<String> sorted = names.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted names: " + sorted);


        List<String> sortedByLength = names.stream()
                .sorted((a, b) -> b.length() - a.length())
                .collect(Collectors.toList());
        System.out.println("Sorted by length: " + sortedByLength);
    }
}

