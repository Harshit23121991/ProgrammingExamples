package com.test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class GermanNumberFormat {

	public static void main(String[] args) {
		BigDecimal bigDecimal = new BigDecimal(1.2);
		
		/*DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.GERMAN);
		otherSymbols.setDecimalSeparator(',');
		otherSymbols.setGroupingSeparator('.'); 
		DecimalFormat df = new DecimalFormat("1.2", otherSymbols);
		System.out.println(df.FRACTION_FIELD);*/
		
		
		
		/*  NumberFormat nf = NumberFormat.getNumberInstance(Locale.GERMAN);
		  long bigDecimalString = (long) 1.2;//String.valueOf(bigDecimal.doubleValue());
		  
		  String val = nf.format(bigDecimalString);
		  System.out.println(val);*/
	//	String s = formatBigDecimal(BigDecimal);
		//System.out.println(s);
		
		
		String numberString = "2,105.88";
        //using casting
       /* try {
            DecimalFormat df = (DecimalFormat) NumberFormat.getInstance(Locale.GERMAN);
            df.setParseBigDecimal(true);
            BigDecimal bd = (BigDecimal) df.parseObject(numberString);
            System.out.println(bd.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //your way short version
        NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
        try {
            BigDecimal bd1 = new BigDecimal(nf.parse(numberString).toString());
            System.out.println(bd1.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String numberStringFixed = "2105.88";
        //direct string formated
        System.out.println(new BigDecimal(numberStringFixed));;     
        //direct but erroneous way if the string is not formated
        System.out.println(new BigDecimal(numberString));;*/
		
		  /*Locale locale = Locale.GERMAN;
		    //String string = NumberFormat.getInstance(locale).format(numberString); 
		    Number number;
			try {
				number = NumberFormat.getNumberInstance(Locale.GERMAN).parse("-1.234.56");
				 System.out.println(number);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		Locale currentLocale = Locale.GERMAN;
		
		 Integer quantity = new Integer(123456);
		    Double amount = new Double(345987.246);
		    NumberFormat numberFormatter;
		    String quantityOut;
		    String amountOut;

		    numberFormatter = NumberFormat.getNumberInstance(currentLocale);
		    quantityOut = numberFormatter.format(quantity);
		    amountOut = numberFormatter.format(amount);
		    System.out.println(quantityOut + "   " + currentLocale.toString());
		    System.out.println(amountOut + "   " + currentLocale.toString());
		   

	}
	
	private static String formatBigDecimal(BigDecimal bd){
	    DecimalFormat df = new DecimalFormat();
	    df.setMinimumFractionDigits(3);
	    df.setMaximumFractionDigits(3);
	    df.setMinimumIntegerDigits(1);
	    df.setMaximumIntegerDigits(3);
	    df.setGroupingSize(20);
	    return df.format(bd);
	}

}
