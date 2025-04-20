package com.Problems;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();

	public static void main(String[] args) {
		StackUsingQueue s = new StackUsingQueue();

		s.push(10);
		s.push(20);
		s.push(30);

		System.out.println(s.top());  //30
		System.out.println(s.pop());  //30
		
		System.out.println(s.top());  //20
		System.out.println(s.pop());  //20

	}

	private void push(int n) {
		q2.add(n);
		while (!q1.isEmpty()) {
			q2.add(q1.remove());
		}

		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;

	}

	private int top() {
		if (q1.isEmpty())
			throw new EmptyStackException();
		return q1.peek();
	}

	private int pop() {
		if (q1.isEmpty())
			throw new EmptyStackException();
		return q1.remove();
	}

}
