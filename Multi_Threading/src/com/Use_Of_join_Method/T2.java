package com.Use_Of_join_Method;

public class T2 extends Thread {

	static T1 t1;

	public void run() {
		try {
			t1.join();
		} catch (InterruptedException e) {
		}

		for (int i = 1; i <= 5; i++) {
			System.out.println("T2 thread : " + i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
