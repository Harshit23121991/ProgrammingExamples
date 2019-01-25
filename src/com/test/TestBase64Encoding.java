package com.test;

import java.util.Base64;

public class TestBase64Encoding {

	public static void main(String[] args) {
		byte[] encodedBytes = Base64.getEncoder().encode("Test".getBytes());
		System.out.println("encodedBytes " + new String(encodedBytes));
		byte[] decodedBytes = Base64.getDecoder().decode(encodedBytes);
		System.out.println("decodedBytes " + new String(decodedBytes));

		
		//String encodeBytes = Base64.getEncoder().encodeToString((userName + password).getBytes());
		String encodeBytes = Base64.getEncoder().encodeToString(("Georgeclient:test").getBytes());
		
		System.out.println(encodeBytes);
		
	}

}
