package com.jav8.training.designStandard.designPattern.factory.bookFactory;

public class EnglishBook implements Books {

	@Override
	public void BookInfo() {
		System.out.println("English Book");

	}

	@Override
	public void BookPrice() {
		System.out.println("500 Rs.");

	}

}
