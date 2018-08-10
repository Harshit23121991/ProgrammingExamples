package com.multithreading.consumer.producer.problem;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsumerRunnable implements Runnable {
	private final Vector sharedQueue;
	private final int SIZE;

	public ConsumerRunnable(Vector sharedQueue, int size) {
		this.sharedQueue = sharedQueue;
		this.SIZE = size;
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("Consumed: " + consume());
				Thread.sleep(50);
			} catch (InterruptedException ex) {
				Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
			}

		}
	}

	private int consume() throws InterruptedException {
		// wait if queue is empty
		while (sharedQueue.isEmpty()) {
			synchronized (sharedQueue) {
				System.out.println("Queue is empty " + Thread.currentThread().getName() + " is waiting , size: "
						+ sharedQueue.size());

				sharedQueue.wait();
			}
		}

		// Otherwise consume element and notify waiting producer
		synchronized (sharedQueue) {
			sharedQueue.notifyAll();
			return (Integer) sharedQueue.remove(0);
		}
	}
}
