package com.volatil;

import java.util.concurrent.atomic.AtomicInteger;

public class Customer2 {
	
	private AtomicInteger count = new AtomicInteger(0);

	public int getValue() {
		return count.get();
	}

	public int increment() {
		return count.getAndIncrement();
	}

}
