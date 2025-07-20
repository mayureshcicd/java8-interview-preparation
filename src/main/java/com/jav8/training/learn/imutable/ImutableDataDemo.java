package com.jav8.training.learn.imutable;

public class ImutableDataDemo {

	public static void main(String[] args) {
		ImutableData iImutableLove=ImutableData.createImutableLove("swami");
		System.out.println(iImutableLove);
		System.out.println(iImutableLove.concat(" om"));

	}

}
