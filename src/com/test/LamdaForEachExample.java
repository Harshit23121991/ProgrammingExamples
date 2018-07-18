package com.test;

import java.util.ArrayList;
import java.util.List;

public class LamdaForEachExample {

	public static void main(String[] args) {
		List<Employee> items = new ArrayList<>();
		items.add(new Employee(1,"ABC",1000));
		items.add(new Employee(2,"ABC1",2000));
		items.add(new Employee(3,"ABC2",3000));
		items.add(new Employee(4,"ABC3",4000));
		items.add(new Employee(5,"ABC4",5000));
		items.add(new Employee(6,"ABC5",6000));
		
		
		items.forEach(emp->{
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
			System.out.println(emp.getSalary());
			/*if("C".equals(item)){
				System.out.println(item);
			}*/
		});
		
	//////////////////////////////////////////////////////////////////////
		
		//lambda
		//Output : A,B,C,D,E
		/*items.forEach(item->System.out.println(item));

		//Output : C
		items.forEach(item->{
			if("C".equals(item)){
				System.out.println(item);
			}
		});

		//method reference
		//Output : A,B,C,D,E
		items.forEach(System.out::println);

		//Stream and filter
		//Output : B
		items.stream()
			.filter(s->s.contains("B"))
			.forEach(System.out::println);
		
*/		///////////////////////////////////////////////////////////////////////
		
		
		
		
		
	}

}
