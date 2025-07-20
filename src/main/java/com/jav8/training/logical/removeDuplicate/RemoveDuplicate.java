package com.jav8.training.logical.removeDuplicate;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] nos = {1, 2, 2, 3, 3};

		// For integers
		System.out.println("Distinct integers:");
		Arrays.stream(nos)
				.distinct()
				.forEach(n -> System.out.print(n + " "));
		System.out.println("\nCount: " + Arrays.stream(nos).distinct().count());

		// For words in a string
		String A = "jyoti jyoti only jyoti";
		System.out.println("\nDistinct words:");
		Arrays.stream(A.split(" "))
				.distinct()
				.forEach(word -> System.out.print(word + " "));
		System.out.println("\nCount: " + Arrays.stream(A.split(" ")).distinct().count());
	}
}
