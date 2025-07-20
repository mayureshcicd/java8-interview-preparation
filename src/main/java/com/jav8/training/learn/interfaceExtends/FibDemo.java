package com.jav8.training.learn.interfaceExtends;

import java.util.ArrayList;
import java.util.List;

public class FibDemo {

	public static void main(String[] args) {
		geFibonacci();
		System.out.println(showFib("SWISS"));
		show();
		System.out.println(checkNo("abccaa"));
		
	}
	
	private static String checkNo(String input)
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
	private static void show()
	{
		List<String> ref=new ArrayList<String>();
		ParondimeOne("","XYZ",ref);
		ref.forEach(d->{
			
			System.out.println(d);
		});
	}
	private static List<Integer> geFibonacci()
	{
		List<Integer> nos=new ArrayList<Integer>();
		for (int i=0;i<15;i++)
		{
			nos.add(fibValue(i));
		}
		return nos;
	}
	private static int fibValue(int n)
	{
		if (n<=1) return n;
		else return fibValue(n-1)+fibValue(n-2);
		
	}
	private static String showFib(String input)
	{
		String fn="";
		for (char c:input.toCharArray())
		{
			if (input.indexOf(c)==input.lastIndexOf(c))
			{
				fn=String.valueOf(c);
				break;
			}
		}
		return fn;
	}
	
	private static void ParondimeOne(String context,String input,List<String> ref)
	{
		if (input.isEmpty())
			ref.add(context.concat(input));
		for (int i=0;i<input.length();i++)
		{
			ParondimeOne(context+input.charAt(i),input.substring(0,i)+input.substring(i+1),ref);
		}
	}
}
