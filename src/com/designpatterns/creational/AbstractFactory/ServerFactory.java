package com.designpatterns.creational.AbstractFactory;

import com.designpatterns.creational.Factory.Computer;
import com.designpatterns.creational.Factory.PC;
import com.designpatterns.creational.Factory.Server;

public class ServerFactory implements ComputerAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;
	
	public ServerFactory(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		return new Server(ram, hdd, cpu);
	}

}
