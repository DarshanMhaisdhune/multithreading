
public class MySecondThread extends Thread {

	@Override
	public void run() {
		System.out.println("Inside run method ...");
		go();
	}

	private void go() {
		System.out.println("Inside Go method ...");
		more();
	}

	private void more() {
		System.out.println("Inside More method...");

	}

	public static void main(String[] args) {

		MySecondThread mySecondThread = new MySecondThread();
		mySecondThread.start();

	}

}
