package com.Concept_Based_Problems;

import java.util.LinkedList;
import java.util.Queue;

class Buffer {
	private final Queue<Integer> q = new LinkedList<Integer>();
	private final int capacity = 5;

	public synchronized void produce(int value) throws InterruptedException {
		while (q.size() == capacity) {
			wait();
		}
		q.add(value);
		System.out.println("Produced: " + value);
		notifyAll();
	}

	public synchronized int consume() throws InterruptedException {
		while (q.isEmpty()) {
			wait();
		}
		int val = q.poll();
		System.out.println("Consumed: " + val);
		notifyAll();
		return val;
	}
}

public class ProducerConsumer {

	public static void main(String[] args) {
		Buffer bf = new Buffer();

		Thread producer = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				try {
					bf.produce(i);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		});

		Thread consumer = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				try {
					bf.consume();
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		});

		producer.start();
		consumer.start();
	}

}


/************** Output ********************/

/*

Produced: 1
Produced: 2
Produced: 3
Produced: 4
Produced: 5
Consumed: 1
Consumed: 2
Consumed: 3
Consumed: 4
Consumed: 5
Produced: 6
Produced: 7
Produced: 8
Produced: 9
Produced: 10
Consumed: 6
Consumed: 7
Consumed: 8
Consumed: 9
Consumed: 10




 */
