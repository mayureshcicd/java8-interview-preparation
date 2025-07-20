package com.jav8.training.learn.stream.merge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeList {

	public static void main(String[] args) {
		List<String> names1 = Arrays.asList("Dzmitry", "John");
		List<String> names2 = Arrays.asList("David", "Laura");
		Stream<List<String>> s = Stream.of(names1, names2);
		s.flatMap(names -> names.stream()).forEach(System.out::println);
	}

}
