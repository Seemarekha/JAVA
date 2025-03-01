package com.Thread_Daemon_Nature;

public class Test {

	public static void main(String[] args) {

		Th1 t1 = new Th1();

		t1.setDaemon(true);

		System.out.println(t1.isDaemon()); //true
		System.out.println(Thread.currentThread().isDaemon());   //false

		t1.start();

		for (int i = 1; i <= 5; i++) {

			System.out.println("Main thread : " + i);

			if (i == 3)
				System.out.println(5 / 0);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}

	}

}
