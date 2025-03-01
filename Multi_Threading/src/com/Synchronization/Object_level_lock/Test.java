package com.Synchronization.Object_level_lock;

public class Test {

	public static void main(String[] args) {

		A a2 = new A();
		A a1 = new A();

		Th1 t1 = new Th1(a1, "T1");
		Th1 t2 = new Th1(a2, "T2");

		t1.start();
		t2.start();

	}

}
