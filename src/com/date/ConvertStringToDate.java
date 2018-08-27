package com.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertStringToDate {

	public static void main(String[] args) {
		String myDateTime = "2013-03-17 12:45:56";
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date convertedDateTime = df.parse(myDateTime);
			System.out.println("DATE : " + df.format(convertedDateTime));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
