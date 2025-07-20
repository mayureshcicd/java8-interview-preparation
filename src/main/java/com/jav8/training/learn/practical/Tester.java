package com.jav8.training.learn.practical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Tester {

	public static void main(String[] args) {
		 String input="SWISS";
		 String fno="";
		 for (char c:input.toCharArray())
		 {
			 if (input.indexOf(c)==input.lastIndexOf(c))
			 {
				 fno=String.valueOf(c);
				 break;
			 }
		 }
		 System.out.println("String "+fno);
		 
		 List<String> result=new ArrayList<String>();
		 input="XYZ";
		 reverseFun("", input, result);
		 System.out.println("String "+result);
		 
		 int[] ar1= {1,2,36,94};
		 int[] ar2= {45,65,89,3,4};
		 
		 int[] rev= new int[ar1.length+ar2.length];
		 System.arraycopy(ar1, 0, rev, 0, ar1.length);
		 System.arraycopy(ar2, 0, rev, ar1.length, ar2.length);
		 Arrays.parallelSort(rev);
		 for (int i:rev)
		 {
			 System.out.println(i);
		 }
		 System.out.println(checkP("abccaa"));
		 List<Integer> revs=IntStream.concat(Arrays.stream(ar1), Arrays.stream(ar2)).boxed().sorted().collect(Collectors.toList());
		 System.out.println(revs);
	}

	public static void reverseFun(String context,String input, List<String>ref)
	{
		if (input.isEmpty())
		{
			ref.add(context+input);
			return;
		}
		for (int i=0;i<input.length();i++)
		{
			reverseFun(context+input.charAt(i), input.substring(0, i)+input.substring(i+1), ref);
		}
	}
	
	public static String checkP(String input)
	{
		int n=input.length();
		int count=0;
		for (int i=0;i<n/2;++i)
		{
			if (input.charAt(i)!=input.charAt(n-i-1))
			{
				count++;
			}
		}
		return (count <= 1)==true?"Yes":"No";
	}
}
