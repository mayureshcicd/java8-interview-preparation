package com.jav8.training.interview.streamComboExample;

import java.util.*;
import java.util.stream.*;

public class DistinctExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> unique = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Unique values: " + unique);
    }
}
