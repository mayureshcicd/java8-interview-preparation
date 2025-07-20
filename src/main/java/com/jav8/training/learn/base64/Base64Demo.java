package com.jav8.training.learn.base64;

import java.util.Base64;

public class Base64Demo {

	public static void main(String[] args) {
		String originalInput = "shrawan.dadarwal@simplifysynergy.com:Laptop@2022";
		String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
		System.out.println(encodedString);
	}

}
