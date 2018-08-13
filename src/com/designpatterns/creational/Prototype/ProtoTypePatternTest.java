package com.designpatterns.creational.Prototype;

import java.util.List;

public class ProtoTypePatternTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employees emps = new Employees();
		emps.loadData();
		
		//Use the clone method to get the Employee Object
		Employees empsNew =(Employees) emps.clone();
		Employees empsNew1 =(Employees) emps.clone();
		List list = empsNew.getEmpList();
		list.add("John");
		List list1 = empsNew1.getEmpList();
		list1.remove("Pankaj");
		
		System.out.println("emps List  :"+emps.getEmpList());
		System.out.println("empsNew List  :"+list);
		System.out.println("empsNew1 List  :"+list1);
	}
}
