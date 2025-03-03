package com.thread_Priorities;

public class Test {

	public static void main(String[] args) {

		Thread.currentThread().setPriority(7);
		MyTh t1 = new MyTh();
		t1.start();
		System.out.println("Main Thread priority : "+Thread.currentThread().getPriority());   //7

	}

}
