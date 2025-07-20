package com.jav8.training.learn.filters;

public class TryDemo {

	public static void main(String[] args) {

		System.out.println(getResult());
	}

	public static int getResult() {
		int result = 0;
		try {
			return 20 / result;

		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			result = 300;
			return result;
		} finally {
			return result + 200;
		}

		// return result+10; //It will never work ( un reachable code)
	}
}
