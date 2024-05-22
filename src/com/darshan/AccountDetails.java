package com.darshan;

public class AccountDetails implements Runnable {
	Account account = new Account();

	@Override
	public void run() {

		for (int x = 0; x < 10; x++) {
			makeWithdrawl(500);
		}

	}

	private synchronized void makeWithdrawl(int amt) {

		if (account.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName() + " is going to withdraw => ");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			int balance = account.withdraw(amt);
			System.out.println(
					Thread.currentThread().getName() + " Has completed the transaction and balance is :: " + balance);
		} else {
			System.out.println("Account does not have sufficent balance");
		}
	}

	

}
