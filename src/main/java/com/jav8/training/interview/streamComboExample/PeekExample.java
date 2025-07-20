package com.jav8.training.interview.streamComboExample;

import java.util.*;
import java.util.stream.*;

public class PeekExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        List<String> processed = names.stream()
                .map(String::toUpperCase)
                .peek(s -> System.out.println("Upper: " + s))
                .collect(Collectors.toList());

        System.out.println("Final list: " + processed);
    }
}

