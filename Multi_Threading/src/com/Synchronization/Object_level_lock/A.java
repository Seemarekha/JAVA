package com.Synchronization.Object_level_lock;

public class A {

	public synchronized void m1(String s) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Executed by : " + s);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
	}

}
