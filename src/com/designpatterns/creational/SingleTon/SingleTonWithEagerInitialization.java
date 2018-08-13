package com.designpatterns.creational.SingleTon;

public class SingleTonWithEagerInitialization {
	
	private static final SingleTonWithEagerInitialization instance = new SingleTonWithEagerInitialization();

	private SingleTonWithEagerInitialization() {}
	
	public static SingleTonWithEagerInitialization getInstance() {
		return instance;
	}
}
