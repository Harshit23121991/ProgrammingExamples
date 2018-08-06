package com.grouping;

public class Employee implements Comparable<Employee>{
	
	private int id;
	private String name;
	private int marks;
	
	public Employee(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public int compareTo(Employee st){  
		if(marks == st.getMarks())  
			return 0;  
		else if(marks > st.getMarks())  
			return 1;  
		else  
			return -1;  
		}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
