package com.InterThread_Communication;

public class InterThread {

	public static void main(String[] args) throws InterruptedException {

		Account acc = new Account(2000);

		new Thread() {
			public void run() {
				acc.withdraw(5000);
			}
		}.start();

		new Thread() {
			public void run() {
				acc.deposit(4000);
			}
		}.start();

		Thread.sleep(1000);

		System.out.println(acc);
	}

}
