package com.jav8.training.logical.uniqueCharacterFinder;


public class UniqueCharacterFinder {

    public static void main(String[] args) {
        System.out.println("\nFirst non-repeating character in 'SWISS': " +
                UniqueCharacterFinder.findFirstUniqueChar("SWISS"));

    }
    public static String findFirstUniqueChar(String input) {
        for (char c : input.toCharArray()) {
            if (input.indexOf(c) == input.lastIndexOf(c)) {
                return String.valueOf(c);
            }
        }
        return "";
    }
}