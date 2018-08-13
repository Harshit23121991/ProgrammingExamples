package com.designpatterns.creational.SingleTon;

public class ThreadSafeSingleTon {
	private static ThreadSafeSingleTon instance;
	private ThreadSafeSingleTon() {}
	
	public static synchronized ThreadSafeSingleTon getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleTon();
		}
		return instance;
	}
	
	public static ThreadSafeSingleTon getInstanceUsingDoubleLocking() {
		if(instance == null) {
			synchronized (ThreadSafeSingleTon.class) {
				if(instance == null) {
					instance = new ThreadSafeSingleTon();
				}
			}
		}
		return instance;
	}

}
