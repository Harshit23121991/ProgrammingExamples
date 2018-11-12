package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Distinct {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Naveenkumar.P@itcinfotech.com");
		l.add("Noor.Hasan@itcinfotech.com");
		l.add("Ashutosh.Razdan@itcinfotech.com");
		l.add("HETAL.DESAI@itcinfotech.com");
		l.add("Balaji.Desigan@itcinfotech.com");
		l.add("naveenkumar.P@itcinfotech.com");
		l.replaceAll(String::toLowerCase);

		
		System.out.println(l);
		List<String> distinctElements = l.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctElements);
	}

}
