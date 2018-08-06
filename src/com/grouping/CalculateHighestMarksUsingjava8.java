package com.grouping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CalculateHighestMarksUsingjava8 {

	public static void main(String[] args) {
		List<Data> dataList = new ArrayList<>();
		dataList.add(new Data(1, "harshit", "maths", 55));
		dataList.add(new Data(1, "harshit", "science", 77));
		dataList.add(new Data(1, "Raj", "maths", 66));
		dataList.add(new Data(1, "Raj", "science", 79));
		dataList.add(new Data(1, "Anil", "maths", 44));
		dataList.add(new Data(1, "Anil", "science", 66));
		
		Map<String, List<Data>> groupedData = dataList.stream().collect(Collectors.groupingBy(w -> w.getName()));
		System.out.println(groupedData);
		
		///***********1st approach *********************
		
		/*List<Employee> empList = new ArrayList<>();
		//Map iteration in java 8
		groupedData.forEach((k,v)->{
			System.out.println("Item : " + k + " Count : " + v);
			List<Data> l = v;
			int totalMarks = 0;
			for (Data data : l) {
				totalMarks = totalMarks + data.getMarks();
			}
			Employee e = new Employee(0, k, totalMarks);
			empList.add(e);
		});
		
		System.out.println(empList);
		
		Collections.sort(empList);
		
		System.out.println(empList);*/
		
		//***********2ND approach *********************
		List<Employee> empList = new ArrayList<>();
		groupedData.entrySet().stream().forEach(e ->{
			System.out.println(e.getKey() + ":" + e.getValue());
			
			List<Data> l = e.getValue();
			int totalMarks = 0;
			for (Data data : l) {
				totalMarks = totalMarks + data.getMarks();
			}
			Employee emp = new Employee(0, null , totalMarks);
			empList.add(emp);
		}); 
		
		System.out.println(empList);
		
		Collections.sort(empList);
		
		System.out.println(empList);
	}
}
