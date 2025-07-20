package com.jav8.training.designStandard.designPattern.factory.animalFactory;

public class AnimalDistributor {

	public static AnimalFactory getAnimals()
	{
		return new AnimalDeveloper();
	}
}
