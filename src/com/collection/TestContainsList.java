package com.collection;

import java.util.ArrayList;
import java.util.List;

public class TestContainsList {

	public static void main(String[] args) {
		List<Employee> l = new ArrayList();
		l.add(new Employee(1,"ABC1",1111));
		l.add(new Employee(2,"ABC2",2222));
		l.add(new Employee(3,"ABC3",3333));
		l.add(new Employee(4,"ABC4",4444));
		l.add(new Employee(5,"ABC5",5555));
		l.add(new Employee(6,"ABC6",6666));
		
		Employee e = new Employee(6,"AB11C6",6661116);
		
		if(l.contains(e)) {
			System.out.println("isExists");
		}else {
			System.out.println("Not Exists");
		}
		

	}

}
