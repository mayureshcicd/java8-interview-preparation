package com.jav8.training.learn.practical;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemovingDuplicatesCharacterFromAString {

	public static void main(String[] args) {
		String myString="SWISS";
		String noDuplicates = Arrays.asList(myString.split(""))
                .stream()
                .distinct()
                .collect(Collectors.joining());
		System.out.println(noDuplicates);
		
		Set<String> set=new LinkedHashSet<String>();
		for(char c:myString.toCharArray())
		{
		    set.add(String.valueOf(c));
		}
		String message = String.join("", set);
		System.out.println(message);
	}

}
