package com.Thread_Daemon_Nature;

public class Th1 extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Th1 thread : " + i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

}
