package com.jav8.training.learn.practical;

public class JAVA8Practice {

	public static void main(String[] args) {
		function1("abccaa");
		function1("madaswewr");
	}
	private static void function1(String input)
	{
		int n=input.length();
		int count=0;
		for (int i=0;i<n/2;i++)
		{
			if (input.charAt(i)!=input.charAt(n-i-1))
			{
				count++;				
			}
		}
		var output= (count<=1)? "yes":"no";
		System.out.println(output);
	}
}
