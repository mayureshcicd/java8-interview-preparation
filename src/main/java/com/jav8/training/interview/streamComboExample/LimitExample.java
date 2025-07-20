package com.jav8.training.interview.streamComboExample;

import java.util.*;
import java.util.stream.*;

public class LimitExample {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(90, 85, 78, 92, 88);

        List<Integer> top3 = scores.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Top 3 scores: " + top3);
    }
}
