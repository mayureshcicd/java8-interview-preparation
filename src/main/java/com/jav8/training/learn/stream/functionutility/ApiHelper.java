package com.jav8.training.learn.stream.functionutility;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
public interface ApiHelper {

	Function<String , String>toUpperCase=(name)->{
		return name.toUpperCase();
		
	};
	Consumer<String>myConsumer=(inputName1)->{
		inputName1="string1";
	};
	Function<Input,Output>toFullName=(inputName)->{
		String fullName=inputName.getFirstName().concat(" ").concat(inputName.getMiddleName()).concat(" ").concat(inputName.getLastName());
		return Output.builder()
				.fullName(toUpperCase.apply(fullName))
				.build();
		
	};
	
	static Output getFullName(Input inputName)
	{
		String fullName=inputName.getFirstName().concat(" ").concat(inputName.getMiddleName()).concat(" ").concat(inputName.getLastName());
		return Output.builder()
				.fullName(fullName)
				.build();
	}
	
	BiFunction<Mother,Father,Child>getChild=(mother,father)->{
		String result="The son of ".concat(mother.getMotherName()).concat(" and ").concat(father.getFatherName()).concat(" is smart child ");
		return Child.builder().childDetail(result).build();
		
	};
	
}
