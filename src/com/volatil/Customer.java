package com.volatil;

public class Customer {
	
	private volatile int count;

	public int getValue() {
		return this.count;
	}

	public synchronized int increment() {
		return count++;
	}

}
