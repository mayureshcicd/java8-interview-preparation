package com.jav8.training.learn.practical;

public class FindFirstNonRepeatingCharacterInAString {
	public static void main(String[] args) {
		String inputStr = "SWISS";
		String nonRepChar="";
		for(char i :inputStr.toCharArray()){
	        if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
	        	nonRepChar= String.valueOf(i);
	            break;
	        }
	        }
		System.out.println("First non-repeating character is: "+nonRepChar);
	}

}
