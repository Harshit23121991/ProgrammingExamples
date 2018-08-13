package com.designpatterns.creational.AbstractFactory;

import com.designpatterns.creational.Factory.Computer;

public class ComputerFactory {
	
	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}

}
