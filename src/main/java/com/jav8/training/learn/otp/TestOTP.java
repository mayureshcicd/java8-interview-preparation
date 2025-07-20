package com.jav8.training.learn.otp;
import java.util.concurrent.ThreadLocalRandom;

public class TestOTP {

	public static void main(String[] args) {
		for (int i=0;i<9999;i++)
		{
			String number = String.valueOf(ThreadLocalRandom.current().nextInt(1, 9999)*1234).substring(0, 4);
			System.out.println(number );
			 
				
		}
	

	}

}
