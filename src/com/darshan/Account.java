package com.darshan;

public class Account {
	
	private int balance = 5000;

	public int getBalance() {
		return this.balance;
	}
	
	public int withdraw(int amount) {
		balance = balance-amount;
		return balance;
	}


}
