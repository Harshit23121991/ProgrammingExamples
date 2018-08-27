package com.clone.deep;

public class Student implements Cloneable {
	// Contained object
	private Subject subj;

	private String name;

	public Subject getSubj() {
		return subj;
	}

	public String getName() {
		return name;
	}

	public void setName(String s) {
		name = s;
	}

	public Student(String s, String sub) {
		name = s;
		subj = new Subject(sub);
	}

	public Object clone() {
		// Deep copy
		Student s = new Student(name, subj.getName());
		return s;
	}
}
