package com.jav8.training.learn.stream.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MultiplePredicateDemo {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10);

		List<Integer> result = list1.stream().filter(con1.or(con2).or(con3)).collect(Collectors.toList());
        System.out.println("Filter Numbers = " + result);
	}
	static Predicate<Integer> con1 = i -> i==0;
	static Predicate<Integer> con2 = i -> i==1;
	static Predicate<Integer> con3 = i -> i==2;
}
