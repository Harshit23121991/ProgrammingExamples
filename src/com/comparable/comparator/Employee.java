package com.comparable.comparator;

public class Employee implements Comparable<Employee> {
	
	private String empName;
	private int empId;
	public Employee(String empName, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Override
	public int compareTo(Employee o) {
		//compare based on String  ascending order
		//return this.empName.compareTo(o.empName);
		
		//compare based on String  descending order
//		return o.empName.compareTo(this.empName);
		
		
		/*//COmpare based on Id ascending order
		if(this.empId ==o.empId) {
			return 0;
		}else if(this.empId  > o.empId) {
			return 1;
		}else {
			return -1;
		}*/
		
		//COmpare based on Id descending  order
		if(this.empId ==o.empId) {
			return 0;
		}else if(this.empId  > o.empId) {
			return -1;
		}else {
			return 1;
		}
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + "]";
	}
}
