package com.jav8.training.designStandard.designPattern.factory.animalFactory;

public class AnimalDeveloper extends AnimalFactory {

	@Override
	public Animal getAnimal(String animalType) {
		if (animalType.equalsIgnoreCase("horse"))
			return new Horse();
		else if (animalType.equalsIgnoreCase("cat"))
			return new Cat();
		else if (animalType.equalsIgnoreCase("dog"))
			return new Dog();
		return null;
	}

}
