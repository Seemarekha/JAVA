package com.Creation_Of_Thread;

class Printer {
	private int num = 1;

	public synchronized void printOdd() throws InterruptedException {
		while (num <= 10) {
			if (num % 2 == 0) {
				wait();
			}
			System.out.println("Odd : " + num++);
			notify();
		}
	}

	public synchronized void printEven() throws InterruptedException {
		while (num <= 10) {
			if (num % 2 != 0) {
				wait();
			}
			System.out.println("Even : " + num++);
			notify();
		}
	}
}

public class EvenOrOdd {

	public static void main(String[] args) {

		Printer printer = new Printer();

		Thread oddThread = new Thread(() -> {
			try {
				printer.printOdd();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Thread evenThread = new Thread(() -> {
			try {
				printer.printEven();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		oddThread.start();
		evenThread.start();

	}

}
