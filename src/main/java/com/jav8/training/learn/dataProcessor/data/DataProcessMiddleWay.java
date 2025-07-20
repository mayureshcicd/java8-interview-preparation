package com.jav8.training.learn.dataProcessor.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataProcessMiddleWay {

	public static void initializeBlackDatabase(Map<String,List<Choice>> mp)
	{
		List<Choice> ls= new ArrayList<Choice>();
		List<String> answers=new ArrayList<String>();

		answers.add("South Africa");
		ls.add( new Choice("human",answers));

		answers=new ArrayList<String>();

		answers.add("American Crow");
		answers.add("Common Raven");
		answers.add("European Starling");
		ls.add( new Choice("birds",answers));

		answers=new ArrayList<String>();

		answers.add("Buffalo");
		answers.add("chimpanzee");
		answers.add("gorilla");
		ls.add( new Choice("animal",answers));

		mp.put("black",ls);
	}
	public static void initializeLanguageDatabase(Map<String,List<Choice>> mp)
	{
		List<Choice> ls= new ArrayList<Choice>();
		List<String> answers=new ArrayList<String>();

		answers.add("Maharashtra");
		ls.add( new Choice("marathi",answers));

		answers=new ArrayList<String>();

		answers.add("Maharashtra");
		answers.add("Gujrath");
		answers.add("Delhi");
		ls.add( new Choice("hindi",answers));

		answers=new ArrayList<String>();

		answers.add("Gujrath");
		ls.add( new Choice("gujarati",answers));

		mp.put("language",ls);
	}
	
	public static void initializeGameDatabase(Map<String,List<Choice>> mp)
	{
		List<Choice> ls= new ArrayList<Choice>();
		List<String> answers=new ArrayList<String>();

		answers.add("Maharashtra");
		ls.add( new Choice("kabaddi",answers));

		answers=new ArrayList<String>();

		answers.add("Maharashtra");
		answers.add("Gujrath");
		answers.add("Delhi");
		ls.add( new Choice("cricket",answers));

		answers=new ArrayList<String>();

		answers.add("India");
		answers.add("britain");
		answers.add("germany");
		ls.add( new Choice("chess",answers));

		mp.put("game",ls);
	}
	public static void printAnswers(Map<String,List<Choice>> mp,String color, String type, String sentence)
	{
		List<Choice> d=mp.get(color);
		d.stream().filter(p->p.getType().equalsIgnoreCase(type)).forEach(e->{
			System.out.println(color.concat(" ").concat(type).concat(" ").concat(sentence).concat(" ").concat(e.getAnswers().toString()));
			
		}); 
	}
	public static void main(String[] args) {
		Map<String,List<Choice>> mp=new HashMap<String,List<Choice>>();
		initializeBlackDatabase(mp);
		initializeLanguageDatabase(mp);
		initializeGameDatabase(mp);
		
		System.out.println("-----------------SEMI ADVANCE CODING STYLE------------------------------------\n\n");
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
