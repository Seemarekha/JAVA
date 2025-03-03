package com.Use_Of_join_Method;

public class T1 extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("T1 thread : " + i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
