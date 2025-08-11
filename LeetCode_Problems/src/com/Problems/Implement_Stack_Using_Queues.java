/*
Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).

Implement the MyStack class:

void push(int x) Pushes element x to the top of the stack.
int pop() Removes the element on the top of the stack and returns it.
int top() Returns the element on the top of the stack.
boolean empty() Returns true if the stack is empty, false otherwise.
Notes:

You must use only standard operations of a queue, which means that only push to back, peek/pop from front, size and is empty operations are valid.
Depending on your language, the queue may not be supported natively. You may simulate a queue using a list or deque (double-ended queue) as long as you use only a queue's standard operations.
 

Example 1:

Input
["MyStack", "push", "push", "top", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 2, 2, false]

Explanation
MyStack myStack = new MyStack();
myStack.push(1);
myStack.push(2);
myStack.top(); // return 2
myStack.pop(); // return 2
myStack.empty(); // return False

 */

package com.Problems;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
	private Queue<Integer> q1;
	private Queue<Integer> q2;

	public MyStack() {
		q1 = new LinkedList<Integer>();
		q2 = new LinkedList<Integer>();
	}

	public void push(int x) {
		q2.offer(x);
		while (!q1.isEmpty())
			q2.offer(q1.poll());

		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;

	}

	public Integer pop() {
		if (q1.isEmpty())
			throw new RuntimeException("Stack is empty");
		return q1.poll();
	}

	public Integer top() {
		if (q1.isEmpty())
			throw new RuntimeException("Stack is empty");
		return q1.peek();
	}

	public boolean empty() {

		return q1.isEmpty();
	}

	@Override
	public String toString() {
		return q1.toString();
	}

}

public class Implement_Stack_Using_Queues {

	public static void main(String[] args) {
		MyStack myStack = new MyStack();

		myStack.push(1);
		myStack.push(2);

		System.out.println("Top element: " + myStack.top()); // 2
		System.out.println("Popped element: " + myStack.pop()); // 2
		System.out.println("Is stack empty? " + myStack.empty()); // false

		myStack.push(3);
		System.out.println("Top element: " + myStack.top()); // 3
		System.out.println("Stack contents: " + myStack); // [3, 1]

	}

}
