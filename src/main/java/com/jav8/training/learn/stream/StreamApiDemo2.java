package com.jav8.training.learn.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamApiDemo2 {

	public static void main(String[] args) {
		
		List<String> lst=Arrays.asList("Swami","om","ganesh");
		 Collections.sort(lst); //Assending order
		for(String s:lst)
		{
			System.out.println(s);
		}
		
		 Collections.reverse(lst);//descending order
			for(String s:lst)
			{
				System.out.println(s);
			}
		lst.stream().sorted().forEach(s->System.out.println(s));
		
		lst.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));
		
	}

}
