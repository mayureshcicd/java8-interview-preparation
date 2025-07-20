package com.jav8.training.designStandard.designPattern.factory.bookFactory;

public class BookProducer extends Factory {

	@Override
	public Books createBook(String bookName) {
		if (bookName.equalsIgnoreCase("marathi"))
			return new MarathiBook();
		else if (bookName.equalsIgnoreCase("hindi"))
			return new HindiBook();
		else if (bookName.equalsIgnoreCase("english"))
			return new EnglishBook();
		return null;
	}

}
