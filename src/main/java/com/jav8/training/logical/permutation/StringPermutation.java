package com.jav8.training.logical.permutation;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {
    public static void main(String[] args) {
        List<String> permutations = new ArrayList<>();
        StringPermutation.permute("", "XYZ", permutations);
        System.out.println("Permutations of XYZ:");
        permutations.forEach(System.out::println);
    }
    public static void permute(String context, String input, List<String> result) {
        if (input.isEmpty()) {
            result.add(context);
            return;
        }
        for (int i = 0; i < input.length(); i++) {
            permute(context + input.charAt(i), input.substring(0, i) + input.substring(i + 1), result);
        }
    }
}
