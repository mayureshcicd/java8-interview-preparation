package com.jav8.training.learn.validity;

import java.util.Arrays;
import java.util.List;

public class MatchString {

	public static void main(String[] args) {
		String documentActionTypes=				"GET,POST,READ";
		 List<String> refDocumentActionTypes =
		          Arrays.asList(documentActionTypes.toLowerCase().split(","));
		 
		 System.out.println(refDocumentActionTypes.contains("post"));
	}

}
