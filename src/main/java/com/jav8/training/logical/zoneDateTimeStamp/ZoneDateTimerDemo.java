package com.jav8.training.logical.zoneDateTimeStamp;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ZoneDateTimerDemo {

	public static void main(String[] args) {

		List<String> dates = Arrays.asList("03 Sep 2021 13:04:00 EST", "03 09 2021 13:04:00 EST",
				"2021 Sep 03 13:04:00 EST",
				"03/Sep/2021 13:04:00 EST", "03/09/2021 13:04:00 EST", "2021/03/09 13:04:00 EST",
				"03-Sep-2021 13:04:00 EST", "03-09-2021 13:04:00 EST", "2021-03-09 13:04:00 EST",
				"03 Sep 2021 13:04:00 AEST", "03 09 2021 13:04:00 AEST", "2021 Sep 03 13:04:00 AEST",
				"03/Sep/2021 13:04:00 AEST", "03/09/2021 13:04:00 AEST", "2021/03/09 13:04:00 AEST",
				"03-Sep-2021 13:04:00 AEST", "03-09-2021 13:04:00 AEST", "2021-03-09 13:04:00 AEST",
				"03/09/2021 13:04:00 EST",
				"04/09/2022 11:00:30 ADT",
				"05/09/2022 12:00:30 IST",
				"06/09/2022 13:00:30 MSK",
				"07/09/2022 14:00:30 FWCT",
				"08/09/2022 15:00:30 JST",
				"09/09/2022 16:00:30 YKST"
		);

		dates.forEach(dateTimeValue -> {
			System.out.println(getEpochTime(dateTimeValue));
		});
	}

	static Long getEpochTime(String dateTime)
	{
		Long time = null;
		List<String> datepatern = Arrays.asList(
				"d MMM yyyy HH:mm[:ss] [Z][z][ZZ][zz]",
				"d MM yyyy HH:mm[:ss] [Z][z][ZZ][zz]",
				"yyyy MMM d HH:mm[:ss] [Z][z][ZZ][zz]",
				"d/MMM/yyyy HH:mm[:ss] [Z][z][ZZ][zz]",
				"d/MM/yyyy HH:mm[:ss] [Z][z][ZZ][zz]",
				"yyyy/MM/d HH:mm[:ss] [Z][z][ZZ][zz]",
				"d-MMM-yyyy HH:mm[:ss] [Z][z][ZZ][zz]",
				"d-MM-yyyy HH:mm[:ss] [Z][z][ZZ][zz]",
				"yyyy-MM-d HH:mm[:ss] [Z][z][ZZ][zz]");
		
		for (String pattern: datepatern)
		{
			try {
				time = ZonedDateTime
						.parse(dateTime,
								new DateTimeFormatterBuilder().parseCaseInsensitive()
										.appendPattern(pattern).toFormatter(Locale.ROOT))
						.toInstant().toEpochMilli();
				break;
			} catch (Exception e) {
				time=null;
			}
		}
		
		return time;
	}
	 
}
