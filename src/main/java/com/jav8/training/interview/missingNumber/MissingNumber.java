package com.jav8.training.interview.missingNumber;
public class MissingNumber {
    /*
    * Find the missing number in an array of size N-1 containing numbers from 1 to N.
    * */
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6; // because 1 to 6

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        int missing = expectedSum - actualSum;
        System.out.println("Missing number: " + missing);
    }
}
