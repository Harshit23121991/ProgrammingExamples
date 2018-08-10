package com.multithreading.consumer.producer.problem;

import java.util.Vector;
/**
 * Java program to solve Producer Consumer problem using wait and notify
 * method in Java. Producer Consumer is also a popular concurrency design pattern.
 *
 * @author Javin Paul
 */
public class ProducerConsumerSolution {

	public static void main(String args[]) {
        Vector sharedQueue = new Vector();
        int size = 4;
        Thread prodThread = new Thread(new ProducerRunnable(sharedQueue, size), "Producer");
        Thread consThread = new Thread(new ConsumerRunnable(sharedQueue, size), "Consumer");
        prodThread.start();
        consThread.start();
    }

}
