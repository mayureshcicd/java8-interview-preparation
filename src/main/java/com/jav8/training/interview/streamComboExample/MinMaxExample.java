package com.jav8.training.interview.streamComboExample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 5, 30);

        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);

        min.ifPresent(m -> System.out.println("Min: " + m));
        max.ifPresent(m -> System.out.println("Max: " + m));
    }
}
