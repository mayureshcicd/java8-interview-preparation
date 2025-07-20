package com.jav8.training.learn.customException;

import java.util.ArrayList;
import java.util.List;

public class CustomerHelper {

	public static void validateStringIsEmptyOrNot(String name) throws CustomException {
		if (name.isBlank() || name.isEmpty())
			throw new CustomException("Name is required , It should not be empty", "400");

		System.out.println(name + " is not empty");
	}

	public static void validateOddNumberIsPresentOrNot(List<Integer> numbers) throws CustomException {
		List<String> errors = new ArrayList<String>();
		numbers.forEach(number -> {
			if (number % 2 == 0)
				System.out.println(number + " Number is even and it is accepted");
			else
				errors.add(number + " is odd & odd numbers are not allowed.");

		});
		if (!errors.isEmpty())
			throw new CustomException(errors, "400");
	}
}
