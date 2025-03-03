package com.Use_Of_join_Method;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		T2.t1 = new T1();
		T2 t2 = new T2();

		T2.t1.start();
		t2.start();

		t2.join();

		for (int i = 1; i <= 5; i++) {
			System.out.println("Main thread : " + i);

			Thread.sleep(1000);
		}
	}

}
