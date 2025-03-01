package com.Synchronization.Deadlock;

public class Deadlock {

	public static void main(String[] args) {

		MyThread t1 = new MyThread();

		t1.start(); // New thread is started
		t1.help(); // Executed by main thread

	}

}
