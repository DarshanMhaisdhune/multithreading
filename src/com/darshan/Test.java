package com.darshan;

public class Test {
	

	public static void main(String[] args) {
		AccountDetails accountDetails = new AccountDetails();
		Thread t1 = new Thread(accountDetails);
		Thread t2 = new Thread(accountDetails);
		t1.setName("Praveen");
		t2.setName("Vishal");
		t1.start();
		t2.start();

	}

}
