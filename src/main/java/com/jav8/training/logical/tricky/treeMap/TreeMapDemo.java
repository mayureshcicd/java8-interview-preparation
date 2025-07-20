package com.jav8.training.logical.tricky.treeMap;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer,String> t=new TreeMap<>();
		t.put(3,"a");
		t.put(6,"a");
		t.put(3,"a");
		t.put(7,"a");
		System.out.println(t.keySet());
		
		List<Integer> ls=Arrays.asList(1,2,3,4,5,6,7,8);
		ls.parallelStream().peek(System.out::print)
		.forEachOrdered(System.out::print);
		
		int[] a= {1,2,4};
		Arrays.asList(a);
	}

}
