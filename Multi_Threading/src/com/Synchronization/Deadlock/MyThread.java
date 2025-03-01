package com.Synchronization.Deadlock;

public class MyThread extends Thread {

	A a = new A();
	B b = new B();

	public void run() {
		a.m1(b);
	}

	public void help() {
		b.m2(a);
	}
}
