package com.jav8.training.designStandard.designPattern.factory.animalFactory;

public class TestAnimalFactory {

	public static void main(String[] args) {
		AnimalFactory factory=AnimalDistributor.getAnimals();
		Animal animal=factory.getAnimal("Horse");
		animal.getAnimal();

	}

}
