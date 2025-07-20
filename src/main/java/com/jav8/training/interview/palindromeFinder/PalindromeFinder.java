package com.jav8.training.interview.palindromeFinder;
import java.util.HashSet;
import java.util.Set;

public class PalindromeFinder {

    public static void main(String[] args) {
        String input = "Thisismyracecarhowdoyoudoisitdaldamadamorsirpleasetellme";
        input = input.toLowerCase(); // Normalize to lowercase

        Set<String> palindromes = new HashSet<>();
        int minLength = 3;

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + minLength; j <= input.length(); j++) {
                String sub = input.substring(i, j);
                if (isPalindrome(sub)) {
                    palindromes.add(sub);
                }
            }
        }

        System.out.println("True palindromes found:");
        for (String p : palindromes) {
            System.out.println(p);
        }
    }

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
