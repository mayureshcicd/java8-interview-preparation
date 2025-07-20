package com.jav8.training.learn.filters;

public class RelationDemo {

	public static void main(String[] args) {
		Parent p=new Child();
		Child c=new Child();
		p.getFruit();
		c.getMango();
		c.getFruit();

	}

}
