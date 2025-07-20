package com.jav8.training.designStandard.designPattern.factory.bookFactory;

public class BookShop {

	public static Factory getBooks()
	{
		return new BookProducer();
	}
}
