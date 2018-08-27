package com.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class ConvertDateToGMT {

	public static void main(String[] args) {
		Date date = new Date();
		DateFormat gmtFor = new SimpleDateFormat();
		TimeZone gmtTime = TimeZone.getTimeZone("GMT");

		gmtFor.setTimeZone(gmtTime);
		System.out.println("Current Date & Time : " + date.toString());
		System.out.println("GMT Time & Date     : " + gmtFor.format(date));

	}

}
