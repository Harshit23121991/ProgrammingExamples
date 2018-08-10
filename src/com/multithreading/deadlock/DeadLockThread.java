package com.multithreading.deadlock;

public class DeadLockThread {

	public static void main(String[] args) {
		Thread1 T1 = new Thread1();
		Thread2 T2 = new Thread2();
		T1.start();
		T2.start();
	}

}
