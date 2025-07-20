package com.jav8.training.interview.missingNumber;

import java.util.*;

public class FirstUnique {
    /*
    * Question 2: Find the first non-repeating element in an array
    * */
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 0, 4};
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating: " + entry.getKey());
                break;
            }
        }
    }
}
