package com.jav8.training.designStandard.designPattern.abstractFactory;

public class FactoryProducer {
	   public static AbstractFactory getFactory(String choice){
	   
	      if(choice.equalsIgnoreCase("SHAPE")){
	         return new ShapeFactory();
	      }
	      
	      return null;
	   }
	}