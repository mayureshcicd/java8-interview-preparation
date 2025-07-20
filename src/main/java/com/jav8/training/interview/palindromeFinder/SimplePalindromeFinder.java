package com.jav8.training.interview.palindromeFinder;

public class SimplePalindromeFinder {
    public static void main(String[] args) {
        String input = "Thisismyracecarhowdoyoudoisitdaldamadamorsirpleasetellme".toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 3; j <= input.length(); j++) {
                String sub = input.substring(i, j);
                if (isPalindrome(sub)) {
                    System.out.println(sub);
                }
            }
        }
    }

    static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
