package com.jav8.training.learn.function.inbuiltFunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class InbuiltFunctionInterFaceDemo {

	public static void main(String[] args) {
		Function<Long, Long> adder = (value) -> value + 3;
		Long resultLambda = adder.apply((long) 8);
		System.out.println("resultLambda = " + resultLambda);
		BiFunction<String,String,String> fullName=(fName,lName)-> {
		return 	fName.concat(" ").concat(lName).toLowerCase();
		};
		String result=fullName.apply("mayuresh","ratnaparkhi");
		System.out.println(result);
		BiConsumer<String, String> fullNamePrinter = (fName, lName) -> {
			String name = fName.concat(" ").concat(lName).toLowerCase();
			System.out.println(name);
		};
		fullNamePrinter.accept("mayuresh","ratnaparkhi");

	}

}
