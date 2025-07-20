package com.jav8.training.logical.datetimeParser;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.List;
import java.util.Locale;
public class FinaLDateTime {

	public static void main(String[] args) {
/*
 "23 Oct 2020 02:44:58 +1000",
			"23 Oct 2020 02:44:58 AEST",
 * */
		/*
	 

1630692030000
		 * */
		List<String> dateTimes = List.of(
			
			
			"03 Sep 2021 14:00:30 EST"
		);

		DateTimeFormatter formatter = new DateTimeFormatterBuilder()
	            .parseCaseInsensitive() // Accept AM or am
	            .appendPattern("d MMM yyyy HH:mm[:ss] [Z][z][ZZ][zz]")
	            //.appendPattern("d MMM yyyy HH:mm[:ss] [Z][z]")
	            .toFormatter(Locale.ENGLISH);

		dateTimes.forEach(dateTime -> {
			ZonedDateTime zonedDateTime = ZonedDateTime.parse(dateTime, formatter);
			System.out.println(zonedDateTime);
			System.out.println(zonedDateTime.toInstant().toEpochMilli());
		});
	}

}
