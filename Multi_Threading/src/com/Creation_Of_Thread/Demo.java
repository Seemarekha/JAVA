package com.Creation_Of_Thread;

public class Demo {

	public static void main(String[] args) {
		MyThread t1 = new MyThread(); // New thread is created
		t1.start(); // New thread is started

		for (int i = 1; i <= 5; i++) {
			System.out.println("Main thread : " + i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}

	}

}
