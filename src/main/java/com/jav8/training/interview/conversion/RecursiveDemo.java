package com.jav8.training.interview.conversion;
public class RecursiveDemo {
	 public static void main(String[] args) {
		 sum(1,10);
		 
	}

	public static void sum(int start ,int end) {
		System.out.println("Your active Number "+start);
		start=start+1;
		if (start<=end)
		sum(start,end);
		
	}

}
