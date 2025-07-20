package com.jav8.training.learn.customException;

import java.util.List;

public class CustomExceptionDemo {

	public static void main(String[] args) {

		showSingleException();

		showGroupException();

	}

	public static void showSingleException() {
		try {

			CustomerHelper.validateStringIsEmptyOrNot("");
		} catch (CustomException ex) {
			System.out.println("\n Error Standard Message (this message is coming from super(message) in CustomException.java  : " + ex.getMessage() +
					"\n Error Custom Message : " + ex.getError() + "\n Error Message Code  : " + ex.getHttpStatus());
		}
		showLine();
	}

	public static void showGroupException() {
		try {

			CustomerHelper.validateOddNumberIsPresentOrNot(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		} catch (CustomException ex) {
			System.out.println("\n Error Standard Message (this message is coming from super(message) in CustomException.java  : " + ex.getMessage() +
					"\n Error Custom Message : " + ex.getErrorMessages() + "\n Error Message Code  : " + ex.getHttpStatus());
		}
		showLine();
	}
	private static void showLine()
	{
		System.out.println("\n\n");
	}

}
