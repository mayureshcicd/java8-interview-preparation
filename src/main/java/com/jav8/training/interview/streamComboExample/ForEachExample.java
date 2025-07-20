package com.jav8.training.interview.streamComboExample;

import java.util.*;
import java.util.stream.*;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.stream()
                .forEach(name -> System.out.println("Hello " + name));
    }
}
