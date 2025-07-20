package com.jav8.training.designStandard.designPattern.factory.bookFactory;

public class MarathiBook implements Books {

	@Override
	public void BookInfo() {
		System.out.println("Marathi Book");

	}

	@Override
	public void BookPrice() {
		System.out.println("400 Rs.");

	}

}