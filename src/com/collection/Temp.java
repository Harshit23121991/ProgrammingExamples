/*package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Temp {

	public static void main(String[] args) {
		
		 Stream<Student> studs = 
			        Stream.of(new Student("1726", "John", "New York"),
			                new Student("4321", "Max", "California"),
			                new Student("2234", "Max", "Los Angeles"),
			                new Student("7765", "Sam", "California"));
		 Map<String, Map<Object, List<Student>>> map= studs.collect(Collectors.groupingBy(Student::getStud_name,Collectors.groupingBy(Student::getStud_location)));
			                System.out.println(map);//print by name and then location
			                
			                
			                List l = new ArrayList();
			                Stream<List> studs = Stream.of(l);
			    		 Map<String, Map<Object, List<Student>>> map= studs..collect(Collectors.groupingBy(Student::getStud_name,Collectors.groupingBy(Student::getStud_location)));
			    			                System.out.println(map);//print by name and then location
			    		
		List studlist = new ArrayList();
		studlist.add(new Student("1726", "John", "New York"));
		studlist.add(new Student("4321", "Max", "California"));
		studlist.add(new Student("2234", "Max", "Los Angeles"));
		studlist.add( new Student("7765", "Sam", "California"));
			    			                
			    			                //Map<String, List<Student>> studlistGrouped = (Map<String, List<Student>>) studlist.stream().collect(Collectors.groupingBy(w -> w.stud_location));
		//Map<String, List<Student>> studlistGrouped = (Map<String, List<Student>>) studlist.stream().collect(Collectors.groupingBy(Student::getStud_name,Collectors.groupingBy(Student::getStud_location)));
		//Map<String, List<Student>> studlistGrouped = (Map<String, List<Student>>) studlist.stream().collect(Collectors.groupingBy(Student::getStud_name));
		Map<String, List<Student>> studlistGrouped = (Map<String, List<Student>>) studlist.stream().collect(Collectors.groupingBy(student -> student.stud_location));	
		System.out.println(studlistGrouped);               

	}

}
*/