package com.jav8.training.interview.streamComboExample;

import java.util.Arrays;
import java.util.stream.Stream;

public class ToArrayExample {
    public static void main(String[] args) {
        String[] result = Stream.of("A", "B", "C")
                .toArray(String[]::new);

        System.out.println(Arrays.toString(result));
    }
}
