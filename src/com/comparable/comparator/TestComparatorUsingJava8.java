package com.comparable.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestComparatorUsingJava8 {

	public static void main(String[] args) {
		List<Department> list = new ArrayList<>();
		list.add(new Department("physics",1));
		list.add(new Department("chemistry",2));
		list.add(new Department("biology",3));
		list.add(new Department("maths",4));
		list.add(new Department("Electrical",5));
		list.add(new Department("mechanical",6));
		
		//First approach
		/*Comparator<Department> deptComp = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Department d1 = (Department)o1;
				Department d2 = (Department)o2;
				return d1.getDeptName().compareTo(d2.getDeptName());
			}
			
		};
		list.sort(deptComp);*/
		
		// Second approach
		/*Comparator<Department> byName = (Department o1, Department o2)->o1.getDeptName().compareTo(o2.getDeptName());
		list.sort(byName);
		System.out.println(list);*/
		
		//3rd Approach
		
		/*list.sort(new Comparator<Department>() {
			@Override
			public int compare(Department o1, Department o2) {
				return o2.getDeptName().compareTo(o1.getDeptName());
			}
		});	*/
		
		//fourth approach
		/*list.sort((Department o1, Department o2)->o1.getDeptName().compareTo(o2.getDeptName()));
		System.out.println(list);
		list.sort((Department o1, Department o2)->o1.getDeptId() - o2.getDeptId());
		System.out.println(list);
		*/
		//Fifth approach
		
		list.sort((o1, o2)->o1.getDeptId() - o2.getDeptId());
		
	}

}
