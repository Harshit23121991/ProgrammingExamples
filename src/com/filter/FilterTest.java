package com.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FilterTest {

	public static void main(String[] args) {
		
		Department department = new Department();
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("ABC", "abc@gmail.com", 1));
		students.add(new Student("XYZ", "abc1@gmail.com", 2));
		students.add(new Student("ABC1", "abc2@gmail.com", 3));
		students.add(new Student("ABC", "abc3@gmail.com", 4));
		students.add(new Student("ABC", "abc3@gmail.com", 4));
		students.add(new Student("ABC", "abc3@gmail.com", 4));
		students.add(new Student("ABC", "abc3@gmail.com", 4));
		department.setStudents(students );
		
		List l = department.getStudents().stream().filter(Objects::nonNull)
								.filter(student -> student.getName().equalsIgnoreCase("ABC"))
								.map(c ->c.getEmail())
								.distinct()
								.collect(Collectors.toList());

		System.out.println(l);
	}

}
