package com.jav8.training.learn.dataProcessor.data;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;
import java.util.Locale;  
public class DateChecker {

	public static void main(String[] args) throws ParseException {

		String dt="2022-05-03";
		Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(dt); 
		SimpleDateFormat month_date = new SimpleDateFormat("MM-yyyy");
	    System.out.println(dt+"\t"+month_date.format(date1));
	    System.out.println(dt+"\t"+date1);
	}

}
