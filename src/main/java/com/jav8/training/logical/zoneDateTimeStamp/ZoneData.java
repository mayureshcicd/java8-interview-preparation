package com.jav8.training.logical.zoneDateTimeStamp;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

public class ZoneData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value="3/9/2021 13:04:00 EST";
		long epoch=ZonedDateTime.parse("3/9/2021 13:04:00 EST",DateTimeFormatter.ofPattern("d/M/yyyy HH:mm:ss z",Locale.ENGLISH))
				.toInstant()
				.toEpochMilli();
		System.out.println(epoch);
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(11);
		al.add(22);
		al.set(1, 33);
		System.out.println(al);

	}

}
