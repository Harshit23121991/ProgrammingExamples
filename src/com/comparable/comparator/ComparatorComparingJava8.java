package com.comparable.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorComparingJava8 {

	public static void main(String[] args) {
		List<Department> list = new ArrayList<>();
		list.add(new Department("physics",1));
		list.add(new Department("chemistry",2));
		list.add(new Department("biology",3));
		list.add(new Department("maths",4));
		list.add(new Department("Electrical",5));
		list.add(new Department("mechanical",6));
		
		// 1st approach
		 //Comparator<Department> deptNameComparator = Comparator.comparing(Department::getDeptName);
		 //list.sort(deptNameComparator);
		
		
		// 2nd approach
		// Comparator<Department> deptIdComparator = Comparator.comparing(Department::getDeptId);
		//list.sort(deptIdComparator);
		
		
		// 3rd approach
		/* Comparator<Department> descendingOrderDeptName
	      = Comparator.comparing(
	    		  Department::getDeptName, (s1, s2) -> {
	            return s2.compareTo(s1);
	        });
		 list.sort(descendingOrderDeptName);*/
		 
		// 4th approach
		 /* Comparator<Department> descendingOrderDeptName
		  			= Comparator.comparing(Department::getDeptId);
		  		Comparator<Department> employeeNameComparatorReversed 
		  				= descendingOrderDeptName.reversed();
		  	list.sort(employeeNameComparatorReversed);
		 
		 System.out.println(list);*/
		 
		 Comparator<Department> employeeAgeComparator 
	      = Comparator.comparingInt(Department::getDeptId);
		 
		 Comparator<Department> employeeMobileComparator 
	      = Comparator.comparingLong(Department::getDeptId);
		 
		 Comparator<Department> employeeSalaryComparator
	      = Comparator.comparingDouble(Department::getDeptId);
		 
		 /*Comparator<Department> employeeNameComparator 
	      = Comparator.<Department> naturalOrder();
		 
		 Comparator<Department> employeeNameComparator1 
	      = Comparator.<Department> reverseOrder();
		 */
		 Comparator<Department> employeeNameComparator2
	      = Comparator.comparing(Department::getDeptId);
	    Comparator<Department> employeeNameComparator_nullFirst
	      = Comparator.nullsFirst(employeeNameComparator2);

	}

}
