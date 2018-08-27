package com.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class AgeCalculator {

	public static void main(String[] args) {
		//LocalDate birthdate = new LocalDate (1970, 1, 20);
		//LocalDate birthdate = LocalDate.of(1991, 12, 23);
		LocalDate birthdate = new java.sql.Date(new java.util.Date().getTime() ).toLocalDate();
		LocalDate localDate = LocalDate.now();
		System.out.println(calculateAge(birthdate,localDate));
		
		
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, -1);
		Date result = cal.getTime();
		System.out.println("date="+result);
		
		
		Date date = Date.from(ZonedDateTime.now().minusMonths(1).toInstant());
		System.out.println(date);
		
		Date date1 = Date.from(ZonedDateTime.now().minusYears(2).toInstant());
		System.out.println(date1);

	}
	public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }
}
