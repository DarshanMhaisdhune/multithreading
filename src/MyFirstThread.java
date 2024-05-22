
public class MyFirstThread {

	public static void main(String[] args) {
		// Create a task or work
		Runnable task = new Task();

		// Worker
		Thread thread = new Thread(task);

		// Start the work
		thread.start();

		System.out.println("In side main method....");

	}

}

