package com.filter;

public class Student {
	
	private String name;
	private String email;
	private int id;
	
	public Student(String name, String email, int id) {
		super();
		this.name = name;
		this.email = email;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setId(int id) {
		this.id = id;
	}

}
