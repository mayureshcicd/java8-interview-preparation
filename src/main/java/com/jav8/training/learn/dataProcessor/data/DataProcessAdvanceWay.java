package com.jav8.training.learn.dataProcessor.data;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataProcessAdvanceWay {

	public static void initializeBlackDatabase(Map<String,List<Choice>> mp)
	{
		mp.put("black",Arrays.asList(
				new Choice("human",Arrays.asList("South Africa")),
				new Choice("birds",Arrays.asList("American Crow","Common Raven","European Starling")),
				new Choice("animal",Arrays.asList("Buffalo","chimpanzee","gorilla"))
				));
	}
	public static void initializeLanguageDatabase(Map<String,List<Choice>> mp)
	{
		mp.put("language",Arrays.asList(
				new Choice("marathi",Arrays.asList("Maharashtra")),
				new Choice("hindi",Arrays.asList("Maharashtra","Gujrath","Delhi")),
				new Choice("gujarati",Arrays.asList("Gujrath"))				
				));
	}
	
	public static void initializeGameDatabase(Map<String,List<Choice>> mp)
	{

		mp.put("game",Arrays.asList(
				new Choice("kabaddi",Arrays.asList("Maharashtra")),
				new Choice("cricket",Arrays.asList("Maharashtra","Gujrath","Delhi")),
				new Choice("chess",Arrays.asList("India","britain","germany"))
				));
	}
	public static void printAnswers(Map<String,List<Choice>> mp,String color, String type, String sentence)
	{
		 
		mp.get(color).stream().filter(p->p.getType().equalsIgnoreCase(type)).forEach(e->{
			System.out.println(color.concat(" ").concat(type).concat(" ").concat(sentence).concat(" ").concat(e.getAnswers().toString()));
			
		}); 
	}
	public static void main(String[] args) {
		Map<String,List<Choice>> mp=new HashMap<String,List<Choice>>();
		initializeBlackDatabase(mp);
		initializeLanguageDatabase(mp);
		initializeGameDatabase(mp);
		
		System.out.println("-----------------ADVANCE CODING STYLE------------------------------------\n\n");
		printAnswers(mp,"black","animal", "are");
		printAnswers(mp,"black","birds", "are");
		printAnswers(mp,"black","human", "stays in ");
		System.out.println("-----------------------------------------------------\n\n");
		
		System.out.println("-----------------------------------------------------");
	    printAnswers(mp,"language","marathi","is used in"); 
	    printAnswers(mp,"language","hindi","is used in");
		printAnswers(mp,"language","gujarati","is used in");
		System.out.println("-----------------------------------------------------\n\n");
		  
		System.out.println("-----------------------------------------------------");
		printAnswers(mp,"game","kabaddi","is played in"); 
		printAnswers(mp,"game","cricket","is played in");
		printAnswers(mp,"game","chess","is played in");
		System.out.println("-----------------------------------------------------");
		 
		
	}

	
}
