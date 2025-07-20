package com.jav8.training.learn.stream.functionutility;

public class FunctionDemo {

	public static void main(String[] args) {
		String result=ApiHelper.toUpperCase.apply("Jyoti");
		String name="23";
		ApiHelper.myConsumer.accept(name);
		System.out.println(name);
		System.out.println(result);
		Input input=Input.builder()
				.firstName("Jyoti")
				.middleName("Praful")
				.lastName("Gaidhani")
				.build();
		
		Output output=ApiHelper.toFullName.apply(input);
		System.out.println(output.getFullName());
		
		Output staticoutput=ApiHelper.getFullName(input);
		System.out.println(staticoutput.getFullName());
		
		Mother mother=Mother.builder().motherName("Jyoti").build();
		Father father=Father.builder().fatherName("Praful").build();
		Child child=ApiHelper.getChild.apply(mother,father);
		System.out.println(child.getChildDetail());
	}

}
