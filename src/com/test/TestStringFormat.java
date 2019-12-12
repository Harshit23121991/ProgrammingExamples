package com.test;

public class TestStringFormat {

	public static void main(String[] args) {
		
		String url ="https://www.sparkasse.at/%04d-entgeltinformation-skomfortkonto ";
		String filePrefix = String.format(url,1300); 
		
		System.out.println(filePrefix);

	}

}
