package com.jav8.training.interview.streamComboExample;

import java.util.stream.Stream;

public class ReduceExample {
    public static void main(String[] args) {
        int sum = Stream.of(1, 2, 3, 4)
                .reduce(0, Integer::sum); // (identity, accumulator)

        System.out.println("Sum: " + sum);
    }
}
