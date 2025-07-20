package com.jav8.training.designStandard.designPattern.proxyPattern;

public class RealImage implements Image {

	   private String fileName;

	   public RealImage(String fileName){
	      this.fileName = fileName;
	      System.out.println("Loading " + fileName);
	   }

	   @Override
	   public void display() {
	      System.out.println("Displaying " + fileName);
	   }

	   
	}