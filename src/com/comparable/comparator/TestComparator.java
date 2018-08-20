package com.comparable.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {
		List<Department> list = new ArrayList<>();
		list.add(new Department("physics",1));
		list.add(new Department("chemistry",2));
		list.add(new Department("biology",3));
		list.add(new Department("maths",4));
		list.add(new Department("Electrical",5));
		list.add(new Department("mechanical",6));
		
		System.out.println("Before Sorting" + list);
		Collections.sort(list, new DepartmentNameComparator());
		
		System.out.println("After Sorting" + list);
		
		Collections.sort(list, new DepartmentIdComparator());
		
		System.out.println("After Sorting by Id" + list);
	}

}
