package com.Creation_Of_Thread;

public class Th1 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Child thread : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}

	}

}
