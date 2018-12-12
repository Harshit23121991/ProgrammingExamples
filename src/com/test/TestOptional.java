package com.test;

import java.util.Optional;

public class TestOptional {

	public static void main(String[] args) {
		m1(Optional.empty());

	}
	
	public static void m1(Optional<String> st) {
		if(st.isPresent()) {
			System.out.println("Inside IF");
		} else {
			System.out.println("Inside ELSE");
		}

	}

}
