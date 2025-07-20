package com.jav8.training.learn.practical;

import java.util.ArrayList;
import java.util.List;

public class TestStringPermutations {

	public static void main(String[] args) {
		List<String> d = new ArrayList<String>();
		String input = "ABC";
		reverseFun("", input, d);
		System.out.println(d);
		String x="";
		String k="SWISS";
		for (char c:k.toCharArray())
		{
			if (k.indexOf(c)==k.lastIndexOf(c))
			{
				x=String.valueOf(c);
						break;
			}
		}
		System.out.println("First non-repeating character is: "+x);
	}

	public static void reverseFun(String context, String input, List<String> ref) {
		if (input.isEmpty())
		{
			ref.add(context+input);
		}
		for (int i=0;i<input.length();i++)		
		{
			reverseFun(context+input.charAt(i), input.substring(0,i)+input.substring(i+1), ref);
		}
		
	}
}
