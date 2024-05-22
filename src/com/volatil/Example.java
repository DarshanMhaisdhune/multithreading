package com.volatil;

import java.util.concurrent.atomic.AtomicInteger;

public class Example {
	
	private static AtomicInteger counter = new AtomicInteger(0);

	public static void main(String[] args) throws InterruptedException {
		// Increment the counter atomically
		for (int i = 0; i < 10; i++) {
			new Thread(() -> {
				int value = counter.incrementAndGet();
//				try {
//					Thread.sleep(20050);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				System.out.println("Incremented value: " + value);
			}).start();
		}
		Thread.sleep(20000);
		// Decrement the counter atomically
		for (int i = 0; i < 10; i++) {
			new Thread(() -> {
				int value = counter.decrementAndGet();
				System.out.println("Decremented value: " + value);
			}).start();
		}
	}

}
