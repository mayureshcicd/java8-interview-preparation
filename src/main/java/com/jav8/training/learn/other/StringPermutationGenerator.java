package com.jav8.training.learn.other;

import java.util.HashSet;
import java.util.Set;

public class StringPermutationGenerator {
	public static void main(String[] args) {
		System.out.println(generatePermutations("ABC"));
	}

	private static Set<String> generatePermutations(String input) {
		input = input.toLowerCase();
		Set<String> result = new HashSet<>();
		permutations("", input, result);
		return result;
	}

	private static void permutations(String prefix, String letters, Set<String> result) {
		if (letters.length() == 0) {
			result.add(prefix);
		} else {
			for (int i = 0; i < letters.length(); i++) {
				String letter = letters.substring(i, i + 1);
				String otherLetters = letters.substring(0, i) + letters.substring(i + 1);
				permutations(prefix + letter, otherLetters, result);
			}
		}
	}
}
