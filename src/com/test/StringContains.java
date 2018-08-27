package com.test;

public class StringContains {

	public static void main(String[] args) {
		String s = "1";
		if("A1 A2 B1 B2 C1".contains(s)) {
			System.out.println("Inside If");
		}else {
			System.out.println("Inside else");
		}
	}

}
