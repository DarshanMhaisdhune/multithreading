package com.volatil;

/*join() Method:
 *The join() method is used to wait for a thread to finish its execution
 * before proceeding with the execution of the calling thread. 
 * When a thread calls join() on another thread, it waits until the target 
 * thread completes its execution.
 */
public class JoinExample {

	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(() -> {
			System.out.println("Thread 1 started.");
			for (int i = 0; i < 5; i++) {
				System.out.println("Thread 1: " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Thread 1 finished.");
		});

		Thread thread2 = new Thread(() -> {
			System.out.println("Thread 2 started.");
			for (int i = 0; i < 5; i++) {
				System.out.println("Thread 2: " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Thread 2 finished.");
		});

		Thread thread3 = new Thread(() -> {
			try {
				System.out.println("Waiting for Thread 1 and Thread 2 to finish.");
				thread1.join(); // Wait for thread1 to finish
				thread2.join(); // Wait for thread2 to finish
				System.out.println("Both Thread 1 and Thread 2 have finished. Thread 3 started.");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		thread1.start();
		thread2.start();
		thread3.start();
	}

}

/*
 * In this example: thread1 and thread2 perform some tasks and then print a
 * message indicating that they have finished their tasks. thread3 waits for
 * both thread1 and thread2 to finish their tasks using the join() method before
 * starting its own execution. This ensures that thread3 starts only after both
 * thread1 and thread2 have completed their tasks. The output of this program
 * will demonstrate that thread3 starts its execution only after both thread1
 * and thread2 have finished their tasks.
 * 
 */
