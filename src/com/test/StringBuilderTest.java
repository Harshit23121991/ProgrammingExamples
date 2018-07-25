package com.test;

public class StringBuilderTest {

	public static void main(String[] args) {
		/*Integer s1 = 1;
		String s2 = "_";
		String s3 = "Doc";
		String s = new StringBuilder(s1).append(s2).append(s3).toString();
		System.out.println(s);*/
		
		Integer s1 = 1;
		String s2 = "_";
		String s3 = "Doc";
		String s = s1 +s2 + s3;
		System.out.println(s);
	}
	

}
