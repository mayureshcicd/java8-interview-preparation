package com.jav8.training.learn.practical;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverseString("This is not sample program"));
	}

	private static String reverseString(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}

}
