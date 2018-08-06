package com.grouping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
//This is in Java 7
public class CalculateHighestMarks {

	public static void main(String[] args) {
		List<Data> dataList = new ArrayList<>();
		dataList.add(new Data(1, "harshit", "maths", 55));
		dataList.add(new Data(1, "harshit", "science", 77));
		dataList.add(new Data(1, "Raj", "maths", 66));
		dataList.add(new Data(1, "Raj", "science", 79));
		dataList.add(new Data(1, "Anil", "maths", 44));
		dataList.add(new Data(1, "Anil", "science", 66));
		
		Map<String, List<Data> > map = new HashMap<>();
		
		for (Data data : dataList) {
			String key  = data.getName();
			if(map.containsKey(key)){
		        List<Data> list = map.get(key);
		        list.add(data);

		    }else{
		    	List<Data> list = new ArrayList<>();
		        list.add(data);
		        map.put(key, list);
		    }

		}
		System.out.println(map);
		
		List<Employee> empList = new ArrayList<>();
		for (Map.Entry<String, List<Data>> entry : map.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
			List<Data> l = entry.getValue();
			int totalMarks = 0;
			for (Data data : l) {
				totalMarks = totalMarks + data.getMarks();
			}
			Employee e = new Employee(0, entry.getKey(), totalMarks);
			empList.add(e);
		}
		System.out.println(empList);
		
		Collections.sort(empList);
		
		System.out.println(empList);
	}

}
