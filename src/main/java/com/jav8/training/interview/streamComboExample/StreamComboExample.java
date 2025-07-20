package com.jav8.training.interview.streamComboExample;

import java.util.*;
import java.util.stream.*;

public class StreamComboExample {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("alpha", "beta", "apple", "ball", "apple", "zebra");

        List<String> result = data.stream()
                .filter(s -> s.startsWith("a"))         // ["alpha", "apple", "apple"]
                .distinct()                             // ["alpha", "apple"]
                .map(String::toUpperCase)               // ["ALPHA", "APPLE"]
                .sorted()                               // ["ALPHA", "APPLE"]
                .peek(s -> System.out.println(">> " + s))
                .collect(Collectors.toList());

        System.out.println("Final result: " + result);
    }
}
