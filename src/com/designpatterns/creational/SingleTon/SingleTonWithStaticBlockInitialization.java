package com.designpatterns.creational.SingleTon;

public class SingleTonWithStaticBlockInitialization {
	
	private static SingleTonWithStaticBlockInitialization instance;
	
	private SingleTonWithStaticBlockInitialization() {}
	
	static {
		try {
			instance = new SingleTonWithStaticBlockInitialization();
		}catch(Exception e) {
			throw new RuntimeException("Exception occured in creating singleton");
		}
	}
	public static SingleTonWithStaticBlockInitialization getInstance() {
		return instance;
	}
}
