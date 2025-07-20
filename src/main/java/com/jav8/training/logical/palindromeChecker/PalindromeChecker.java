package com.jav8.training.logical.palindromeChecker;


public class PalindromeChecker {
    public static void main(String[] args) {
        String checkVal = "abccaa";
        System.out.println("\nIs near-palindrome? " + (PalindromeChecker.isNearPalindrome(checkVal) ? "Yes" : "No"));

    }
    public static boolean isNearPalindrome(String input) {
        int mismatch = 0;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                mismatch++;
                if (mismatch > 1) return false;
            }
        }
        return true;
    }
}