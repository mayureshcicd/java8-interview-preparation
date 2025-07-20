package com.jav8.training.logical.reverseStrings;


import java.util.Arrays;
import java.util.stream.Collectors;

public class StringReverser {
    public static void main(String[] args) {
        String fullName = "         Mayuresh Vishnu                  Ratnaparkhi ";
        System.out.println("\nReversed words: " + StringReverser.reverseEachWord(fullName));
        System.out.println("Entire reversed: " + StringReverser.reverseEntireString(fullName));

    }
    public static String reverseEachWord(String input) {
        return Arrays.stream(input.trim().split("\\s+"))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
    }

    public static String reverseEntireString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}