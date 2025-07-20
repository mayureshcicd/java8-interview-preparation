package com.jav8.training.learn.practical;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class FindMaxNumberFromString {

	public static void main(String[] args) {
		String numbers = "10,20,80,78.90,100,765.90";
		OptionalDouble val = Stream.of(numbers.split(",")).mapToDouble(li -> Double.parseDouble(li)).max();
		Double output = val.isPresent() ? val.getAsDouble() : null;
		System.out.println(output);

		OptionalDouble d = Arrays.stream(numbers.split(",")).mapToDouble(dv -> Double.parseDouble(dv)).max();
		Double outputd = d.isPresent() ? d.getAsDouble() : null;
		System.out.println(outputd);

		List<Integer> nums = Arrays.asList(5, 9, 11, 2, 8, 21, 1);
		var o = nums.stream().mapToInt(k -> k).max().getAsInt();
		System.out.println(o);

		var g = Arrays.stream(numbers.split(",")).mapToDouble(k -> Double.parseDouble(k)).max().getAsDouble();
		System.out.println(g);
	}
	
	

}
