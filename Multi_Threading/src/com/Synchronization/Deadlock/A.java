package com.Synchronization.Deadlock;

public class A {

	public synchronized void m1(B b) {
		
		System.out.println("m1-A");
		System.out.println("A-class calling B-class Tag-2 method");
		
		b.tag2();
	}

	public synchronized void tag1() {
		System.out.println("Tag-1 mathod of A-class");
	}
}
