package com.volatil;

public class Demo {
	

	public static void main(String[] args) throws InterruptedException {

		Customer2 customer = new Customer2();

		Runnable task1 = new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 5000; i++) {
					customer.increment();
				}
			}
		};

		Runnable task2 = new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 2000; i++) {
					customer.increment();
				}
			}
		};

		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		t1.start();
		t2.start();
		Thread.sleep(1000);
		System.out.println("Final count value of customers is ::" + customer.getValue());
	}


}
