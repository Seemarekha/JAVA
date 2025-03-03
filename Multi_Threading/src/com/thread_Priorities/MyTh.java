package com.thread_Priorities;

public class MyTh extends Thread {

	public void run() {
//		Thread.currentThread().setPriority(9);   //9
		System.out.println("Child thread priority : "+Thread.currentThread().getPriority());   //7
	}
}
