package com.multithreading.deadlock;

public class Thread2 extends Thread {
	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();

	public void run() {
		synchronized (Lock2) {
			System.out.println("Thread 2: Holding lock 2...");

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
			System.out.println("Thread 2: Waiting for lock 1...");

			synchronized (Lock1) {
				System.out.println("Thread 2: Holding lock 1 & 2...");
			}
		}
	}
}
