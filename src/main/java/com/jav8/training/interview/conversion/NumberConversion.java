package com.jav8.training.interview.conversion;
public class NumberConversion {

	public static void main(String[] args) {
	 int num=1999;
	 String number=String.valueOf(num);
	 String output="";
	 for (int i=0;i<number.length();i++)
	 {
		  output=output.concat(String.valueOf((i+1)*(Integer.valueOf(String.valueOf(number.charAt(i))))));
 	 
	 }
		System.out.println(output);	 
	}

}
