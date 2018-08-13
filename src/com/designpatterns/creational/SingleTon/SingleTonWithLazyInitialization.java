package com.designpatterns.creational.SingleTon;

public class SingleTonWithLazyInitialization {
	private static SingleTonWithLazyInitialization instance;
	
	private SingleTonWithLazyInitialization() {
		
	}
	public static SingleTonWithLazyInitialization getInstance() {
		if(instance == null) {
			instance = new SingleTonWithLazyInitialization();
		}
		return instance;
	}
}
