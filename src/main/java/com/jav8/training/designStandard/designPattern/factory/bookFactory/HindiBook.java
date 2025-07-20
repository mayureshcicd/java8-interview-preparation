package com.jav8.training.designStandard.designPattern.factory.bookFactory;

public class HindiBook implements Books {

	@Override
	public void BookInfo() {
		System.out.println("Hindi Book");

	}

	@Override
	public void BookPrice() {
		System.out.println("300 Rs.");

	}

}