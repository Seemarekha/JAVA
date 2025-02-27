package com.Creation_Of_Thread;

public class Test {

	public static void main(String[] args) {

		Th1 t1 = new Th1();
		Thread t = new Thread(t1);
		t.start();
		for (int i = 1; i <= 5; i++) {
			System.out.println("Main thread : " + i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}

	}

}
