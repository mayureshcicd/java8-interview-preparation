package com.jav8.training.learn.practical;

public class Palindrome {

	public static void main(String[] args) {
		String name="MADAM";
		if (name.equals(new StringBuffer().append(name).reverse().toString())==true)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Sorry ");
		}

	


	}

}
