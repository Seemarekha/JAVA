package com.Synchronization.Object_level_lock;

public class Th1 extends Thread {

	A a;
	String s;

	public Th1(A a, String s) {
		this.a = a;
		this.s = s;
	}

	@Override
	public void run() {
		a.m1(s);
	}

}
