package com.Synchronization.Deadlock;

public class B {

	public synchronized void m2(A a) {
		System.out.println("m2-B");
		System.out.println("B-class calling A-class Tag-1 mathod");

		a.tag1();
	}

	public synchronized void tag2() {
		System.out.println("Tag-2 method of B-class");
	}

}
