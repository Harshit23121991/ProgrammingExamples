package com.test;

public class TestIncrement {

	public static void main(String[] args) {
		Integer k = 1;
		++k;
		m1(k);
		System.out.println(k);
	}
	
	static void m1(Integer i){
		System.out.println(i);
		i= i+1;
	}

}
