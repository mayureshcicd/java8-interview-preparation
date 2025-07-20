package com.jav8.training.designStandard.genericFactory;


//This is a generic interface that you can use to create any
//Factory Chain.
public interface FactoryElement  {
  
  //This method will always return a sub class
  //of the generic definition
  public Class getNextElement();
  
}