package com.jav8.training.interview.streamComboExample;

import java.util.*;
import java.util.stream.*;

public class SkipExample {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(90, 85, 78, 92, 88);

        List<Integer> afterTop2 = scores.stream()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .collect(Collectors.toList());

        System.out.println("After top 2: " + afterTop2);
    }
}
