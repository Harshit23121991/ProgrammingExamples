package com.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertDateToString {

	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date convertedDateTime = new Date();
		String dateInString = df.format(convertedDateTime);
		System.out.println("DATE : " + dateInString);
	}
}
