package com.comparable.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Harshit",1));
		list.add(new Employee("Manasa",2));
		list.add(new Employee("Nirmala",3));
		list.add(new Employee("Haridas",4));
		list.add(new Employee("Test",5));
		list.add(new Employee("Demo",6));
		
		System.out.println("Before Sorting" + list);
		Collections.sort(list);
		System.out.println("After Sort" + list);
	}

}
