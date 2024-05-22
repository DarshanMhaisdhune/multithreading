package com.volatil;

public class Example1 {
	public static void main(String[] args) {
		final Processor processor = new Processor();

		// Thread 1 - Producer
		Thread producerThread = new Thread(() -> {
			try {
				processor.produce();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		// Thread 2 - Consumer
		Thread consumerThread = new Thread(() -> {
			try {
				processor.consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		producerThread.start();
		consumerThread.start();
	}
}

class Processor {
	public void produce() throws InterruptedException {
		synchronized (this) {
			System.out.println("Producer thread running...");
			wait(); // Release the lock and wait for notification
			System.out.println("Resumed.Producer thread");
		}
	}

	public void consume() throws InterruptedException {
		System.out.println("Consumer thread called...");
		Thread.sleep(2000); // Simulate some work
		synchronized (this) {
			System.out.println("Consumer thread running...");
			notify(); // Notify the waiting thread
			Thread.sleep(5000); // Simulate some work
			System.out.println("Consumer thread completed...");
		}
	}
}