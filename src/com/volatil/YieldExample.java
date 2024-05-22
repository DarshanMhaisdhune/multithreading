package com.volatil;

/*yield() Method:
The yield() method is used to hint to the scheduler that the current
 thread is willing to yield its current use of the processor.
  It's a way to voluntarily give up the CPU by the currently running thread,
   allowing other threads of the same priority to run.
 * 
 */
public class YieldExample {
	public static void main(String[] args) {
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 5; i++)
			{
				System.out.println("Thread 1: " + i);
				Thread.yield(); // Yield the CPU
			}
		});

		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Thread 2: " + i);
				Thread.yield(); // Yield the CPU
			}
		});

		thread1.setPriority(5);
		thread2.setPriority(5);
		thread1.start();
		thread2.start();
	}
}
