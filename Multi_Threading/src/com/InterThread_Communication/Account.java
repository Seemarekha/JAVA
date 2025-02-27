package com.InterThread_Communication;

public class Account {

	int bal;

	public Account(int bal) {
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "Account [bal=" + bal + "]";
	}

	public synchronized void withdraw(int amount) {
		if (amount > bal) {
			System.out.println("Less balance..");

			try {
				wait();
			} catch (InterruptedException e) {
			}
		}

		bal -= amount;
		System.out.println(amount + " withdraw done");

	}

	public synchronized void deposit(int amount) {
		System.out.println("Going to deposit..");
		bal += amount;
		System.out.println("Deposit done");

		notify();

	}

}
