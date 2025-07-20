package com.jav8.training.learn.practical;

import java.util.ArrayList;
import java.util.List;

public class PractDemo {

	public static void main(String[] args) {
		List<String>ref=new ArrayList<String>();
		//getSim("","XYZ",ref);
		//fib();
		//System.out.println(fin("swiss"));
		//System.out.println(ref);
		//System.out.println(checkp("abccaa"));
		fib();
	}

	private static String fin(String input) {
		String fn = "";
		for (char c : input.toCharArray()) {
			if (input.indexOf(c) == input.lastIndexOf(c)) {
				fn = String.valueOf(c);
				break;
			}
		}
		return fn;
	}
	private static void getSim(String constant,String input, List<String>ref)
	{
		if (input.isEmpty())
		{
			ref.add(constant+input);
			return;
		}
		for (int i=0;i<input.length();i++)
		{
			getSim(constant+input.charAt(i), input.substring(0,i)+input.substring(i+1), ref);
		}
	}
	private static String checkp(String input)
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
	private static void showArray()
	{
		int i=0;
	}
	
	private static void fib()
	{
		int value=15;
		List<Integer> fnos=new ArrayList<Integer>();
		int c=0;
		for (int i=0;i<value;i++)
		{
			 
		if(fnos.size()<3)
		{
			fnos.add(fnos.size()==0?0:fnos.size()==1?1:fnos.size()==2?fnos.size()-1:0);
		}
			
		else
		{
			fnos.add((fnos.get(fnos.size()-2))+(fnos.get(fnos.size()-1)));
		}
			
		}
		System.out.println(fnos);
	}
	 
}
