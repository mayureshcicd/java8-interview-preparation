package com.jav8.training.designStandard.designPattern.factory.bookFactory;

public class TestBookFactory {

	public static void main(String[] args) {
		 Factory book= BookShop.getBooks();
		 Books bk=book.createBook("English");
		 bk.BookInfo();
		 bk.BookPrice();
		
	}

}
