package com.jav8.training.learn.imutable;

public class ImmutableStringDemo {

	public static void main(String[] args) {
		ImmutableString name= new ImmutableString("swami om");
		System.out.println(name);
		System.out.println(name.value());
		System.out.println(name.toUpper());
		System.out.println(name.value().concat(" shree swami samrath"));

	}

}
