package com.jav8.training.interview.streamComboExample;

import java.util.Arrays;
import java.util.List;

public class MatchExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        boolean anyStartsWithA = names.stream().anyMatch(name -> name.startsWith("A"));
        boolean allShorterThan10 = names.stream().allMatch(name -> name.length() < 10);
        boolean noneContainZ = names.stream().noneMatch(name -> name.contains("z"));

        System.out.println("Any start with A? " + anyStartsWithA); // true
        System.out.println("All <10 chars? " + allShorterThan10); // true
        System.out.println("None have z? " + noneContainZ);       // true
    }
}

