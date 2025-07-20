package com.jav8.training.interview.streamComboExample;

import java.util.stream.Stream;

public class CountExample {
    public static void main(String[] args) {
        long count = Stream.of("one", "two", "three", "two")
                .filter(word -> word.equals("two"))
                .count();

        System.out.println("Count of 'two': " + count); // 2
    }
}
