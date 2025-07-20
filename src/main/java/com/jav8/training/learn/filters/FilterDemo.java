package com.jav8.training.learn.filters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;


public class FilterDemo {

	public static void main(String[] args) {
		List<String> lines = Arrays.asList("CN=InfoDir-CloudHub-CA-Ex, OU=spring", "CN=InfoDir-CloudHub-CA-Ex, OU=java",
				"CN=InfoDir-CloudHub-CA-Ex, OU=jyoti", "CN=InfoDir-CloudHub-CA-Ex, OU=filter");

		List<String> result = lines.stream().filter(line -> line.contains("OU=java") || line.contains("OU=jyoti") )
				.collect(Collectors.toList());

		result.forEach(System.out::println);
		// readValue("User","pass");
		
		 /*
		
		  String[] test=new String[93];
		  System.out.println(test['[']);
		
		  Set<String> slt= new HashSet<String>();
		  slt.add("CN=InfoDir-CloudHub-CA-Ex, OU=spring");
		  slt.add("CN=InfoDir-CloudHub-CA-Ex, OU=java");
		  slt.add("CN=InfoDir-CloudHub-CA-Ex, OU=jyoti");
		  slt.add("CN=InfoDir-CloudHub-CA-Ex, OU=filter");
		  
		  List<String> results =  new ArrayList<>(slt).stream().filter(line -> line.contains("OU=java") || line.contains("OU=jyoti") )
			.collect(Collectors.toList());
			*/
		 readValue(null, "pass");
		 readValue("Jyoti", "");
	}

	public static void readValue(String userName, String password) {
 
		
		if (checkNullOrEmpty(userName))
		{
		System.out.println("User Name is Required");	
		new RuntimeException("User Name is Required");
		}
		
		if (checkNullOrEmpty(password))
		{
			System.out.println("Password is Required");	
		new RuntimeException("Password is Required");
		}
		/*
		
		Optional.ofNullable(userName).orElseThrow(() -> new RuntimeException("User Name is Required"));
		if (userName.isEmpty())
			new RuntimeException("User Name is Required");
		
		
		Optional.ofNullable(password).orElseThrow(() -> new RuntimeException("Password is Required"));
		if (userName.isEmpty())
			new RuntimeException("Password is Required");
		
		if (!Optional.of(userName).isPresent() || Optional.of(userName).isEmpty()) {
			new RuntimeException("User Name is Required");
		}
		Optional.of(userName).orElseThrow(() -> new RuntimeException("User Name is Required"));
		Optional.ofNullable(password).orElseThrow(() -> new RuntimeException("User Name is Required"));
		System.out.println(userName.concat(" ").concat(password));
		*/
	}
	
	public static boolean checkNullOrEmpty(String value)
	{
		if (value==null ||value.isEmpty())
			return true;
		return false;
	}
}
