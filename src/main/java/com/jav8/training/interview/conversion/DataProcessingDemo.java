package com.jav8.training.interview.conversion;

import java.util.HashMap;
import java.util.Map;

public class DataProcessingDemo {

	public static Map<String,Integer> readWords(String temp[], String findWords)
	{
		Map<String,Integer> result=new HashMap<String,Integer>();
		for (String word:findWords.split(","))
		{
			int count = 0;
			for (int i = 0; i < temp.length; i++) {
			if (word.equals(temp[i]))
			count++;
			}
			result.put(word, count);
		}
		return result;
	}
	public static void main(String[] args) {
		String data="Turtles are reptiles characterized by a shell developed mainly from their ribs."
				+ " The shell consists of two parts: the domed carapace on the back,"
				+ " and the flatter plastron on the belly. There are 360 living and recently extinct turtle species,"
				+ " including land-dwelling tortoises and freshwater terrapins. "
				+ "They are found on most continents, some islands and, in the case of sea turtles, much of the ocean."
				+ " Their closest living relatives are crocodilians and birds.  ";
		
		Map<String,Integer> result=	readWords(data.split(" "),"are,by,of");
	 
		result.entrySet().forEach(entry -> {
		    
		    System.out.println("The word " + entry.getKey() + " occurs " + entry.getValue() + " times in the above string");
		});

	}
	
}
