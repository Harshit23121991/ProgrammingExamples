package com.designpatterns.creational.Builder;

public class TestBuilderPattern {

	public static void main(String[] args) {
		//using builder to get the object in a single line of code and 
		//without any inconsistent state or arguments management issues
		Computer comp = new Computer.ComputerBuilder(
				"500 Gb", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();
		System.out.println(comp.toString());
				
	}

}
