package com.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DateConversion {

	public static void main(String[] args) throws ParseException {
		/*SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
	    System.out.println(f.format(new Date()));*/
	    
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:SsZ");
	    Date dateobj = new Date();
	    System.out.println(df.format(dateobj));
	   System.out.println(df.parse(df.format(dateobj)));
		
	//	System.out.println(new Date());
		
		/*LocalDate  l = LocalDate.now();
		System.out.println(java.util.Date.from(l.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));*/

	}

}
