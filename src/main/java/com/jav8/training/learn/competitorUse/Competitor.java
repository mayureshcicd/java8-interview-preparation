package com.jav8.training.learn.competitorUse;

public class Competitor {
	  private final int type;
	  private final String name;
	  private final int power;

	  public Competitor(int type, String name, int power) {
	    this.type = type;
	    this.name = name;
	    this.power = power;
	  }

	  public int getType() {
	    return type;
	  }

	  public String getName() {
	    return name;
	  }

	  public int getPower() {
	    return power;
	  }

	  @Override
	  public String toString() {
	    return "Competitor{" + "type=" + type + ", name=" + name + ", power=" + power + "} ";
	  }

	}