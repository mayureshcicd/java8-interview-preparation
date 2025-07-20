package com.jav8.training.interview.streamComboExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("apple", "banana", "apricot");

        List<String> startsWithA = names.stream()
                .filter(name -> name.startsWith("a"))
                .collect(Collectors.toList());

        System.out.println(startsWithA); // [apple, apricot]
    }
}
