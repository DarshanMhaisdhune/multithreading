package com.volatil;

public class VolatileDemo {

	volatile boolean isTrue = true;

	public static void main(String[] args) throws InterruptedException {
		VolatileDemo obj = new VolatileDemo();
		obj.startProcessing(); // New Thread will be genrated from here
		Thread.sleep(1000);
		obj.stopProcessing();
	}

	public void startProcessing() {
		// Creating task here
		Runnable task = new Runnable() {

			@Override
			public void run() {
				System.out.println("Calling startProcessing() method ... ");
				System.out.println("isTrue Value ::" + isTrue);
				while (isTrue) {
					// Keep running...
				}
				System.out.println("startProcessing() method stopped running");
			}
		};

		// Creating thread and assigning task
		Thread t1 = new Thread(task);
		// Start the thread
		t1.start();

	}

	public void stopProcessing() {
		System.out.println("Calling stopProcessing() method ... ");
		isTrue = false;
		System.out.println("isTrue Value ::" + isTrue);
	}

}
