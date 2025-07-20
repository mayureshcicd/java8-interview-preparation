package com.jav8.training.learn.filters;

import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringReverse {

	public static void main(String[] args) {
		System.out.println("Archana");

		System.out.println(reverse("Archana"));
		System.out.println(reverseOrder("Archana"));
		System.out.println(reverseString("Archana"));
	}

	static String reverseCase(String source) {
		return IntStream.range(0, source.length())
	    .boxed()
	    .collect(Collector.of(
	        () -> new char[source.length()],
	        (char[] arr, Integer i) -> arr[(source.length() - 1) - i] = source.charAt(i),
	        (char[] left, char[] right) -> {
	            for (int i = 0; i < left.length; i++) left[i] = (char) Math.max(left[i], right[i]); return left;
	        },
	        String::new));
	}
	static String reverseOrder(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i=s.length()-1;i>=0;i--) 
		{
			sb.append(String.valueOf(s.charAt(i)));
		}
		return sb.toString();
	}
	static String reverseString(String s) {
		String reverseString="";
		for (int i=s.length()-1;i>=0;i--) 
		{
			reverseString=reverseString.concat(String.valueOf(s.charAt(i)));
		}
		return reverseString;
	}
	static String reverse(String s) {
		if (s.length() == 0)
			return "";
		return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
	}

}
