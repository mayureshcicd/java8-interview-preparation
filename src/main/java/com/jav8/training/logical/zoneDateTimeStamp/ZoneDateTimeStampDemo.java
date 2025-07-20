package com.jav8.training.logical.zoneDateTimeStamp;

import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
//https://www.onlineconverter.com/gmt-to-est
public class ZoneDateTimeStampDemo {

	public static void main(String[] args) {
		String format = "dd/MM/yyyy HH:mm:ss";
		/*  
		 "23/09/2021 13:04:00 EST", "04/09/2022 11:00:30 ADT",
				"05/09/2022 12:00:30 IST", "06/09/2022 13:00:30 MSK", "07/09/2022 14:00:30 FWCT",
				"08/09/2022 15:00:30 JST", "09/09/2022 16:00:30 YKST" ,
		 * */
		/**
		 * 
		 * 2021-09-03T13:04-04:00[America/New_York]
1630688640000

		 * */
		List<String> dates = Arrays.asList("03/09/2021 13:04:00 EST");
		dates.forEach(dateTimeValue -> {

			String formatedDate = epochTime(dateTimeValue, format);
			System.out.println("Formated Date"+formatedDate);
			BigInteger dt= epochTimeConvertor(formatedDate, format);
			System.out.println("epoch Time "+dt);
			System.out.println("epoch Time to Date "+epochToDate(Long.valueOf(String.valueOf(dt))));
			 
		});

	}

	static String epochTime(String dateTimeValue, String format) {
		if (dateTimeValue.isEmpty())
			return null;
		List<String> zoneWiseDate = List.of(dateTimeValue.split(" "));
		String dateValue = zoneWiseDate.get(0).concat(" ").concat(zoneWiseDate.get(1));
		String timeZone = zoneWiseDate.get(2);
		SimpleDateFormat dateFormat = new SimpleDateFormat(format.concat(" a z"));
		Date date = convertDate(dateValue, format);
		try {
			if (date == null)
				return null;
			if (timeZone == null || "".equalsIgnoreCase(timeZone.trim())) {
				timeZone = Calendar.getInstance().getTimeZone().getID();
			}
			dateFormat.setTimeZone(TimeZone.getTimeZone(timeZone));
		} catch (Exception e) {
			return null;
		}
		return dateFormat.format(date);
		
	}

	static Date convertDate(String dateValue, String format) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		try {
			return dateFormat.parse(dateValue);

		} catch (Exception e) {
			return null;
		}
	}

	static BigInteger epochTimeConvertor(String dateTimeValue, String format) {
		if (dateTimeValue.isEmpty())
			return null;
		BigInteger epoch = null;
		try {
			SimpleDateFormat df = new SimpleDateFormat(format.concat(" a zzz"));

			Date date = df.parse(dateTimeValue);
			epoch = BigInteger.valueOf(date.getTime());
		} catch (Exception e) {
			e.printStackTrace();
			epoch = null;
		}
		return epoch;
	}
	public static String epochToDate(Long epochTime)   {
        Date date = new Date(epochTime);
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        format.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        return format.format(date);
    }
}
