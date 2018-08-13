package com.designpatterns.creational.AbstractFactory;

import com.designpatterns.creational.Factory.Computer;

public class TestDesignPatterns {
	public static void main(String[] args) {
		testAbstractFactory();
	}
	
	public static void testAbstractFactory() {
		Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 Ghz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 Ghz"));
		System.out.println("AbstractFactory PC config ::"+ pc);
		System.out.println("AbstractFactory Server config ::"+ server);
	}
	
}
