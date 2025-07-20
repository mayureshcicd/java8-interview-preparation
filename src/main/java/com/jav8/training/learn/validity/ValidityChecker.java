package com.jav8.training.learn.validity;

public class ValidityChecker {

	public static boolean checkValidityOfString (String value, String searchChar)
	{	 
		boolean result=false;
		for (char ch: value.toLowerCase().toCharArray()) {
			if (String.valueOf(ch).equalsIgnoreCase(searchChar))
				result=true;
			else
				result=false;
		}
	
		return result;
	}
	public static void main(String[] args) 
	{		
		if (checkValidityOfString("jJyoti00000","j"))
			System.out.println("Valid String");
		else
			System.out.println("InValid String");

		
		if (checkValidityOfString("jjjj","j"))
			System.out.println("Valid String");
		else
			System.out.println("InValid String");
		
		if (checkValidityOfString("jjj","j"))
			System.out.println("Valid String");
		else
			System.out.println("InValid String");		
		
		if (checkValidityOfString("jj","j"))
			System.out.println("Valid String");
		else
			System.out.println("InValid String");		
	 
		if (checkValidityOfString("j","j"))
			System.out.println("Valid String");
		else
			System.out.println("InValid String");		
		
		if (checkValidityOfString("00000",""))
			System.out.println("Valid String");
		else
			System.out.println("InValid String");	
		
		if (checkValidityOfString("0000","0"))
			System.out.println("Valid String");
		else
			System.out.println("InValid String");	
		
		if (checkValidityOfString("1111","0"))
			System.out.println("Valid String");
		else
			System.out.println("InValid String");	
		
		
		if (checkValidityOfString("1111","1"))
			System.out.println("Valid String");
		else
			System.out.println("InValid String");			
	}

}
