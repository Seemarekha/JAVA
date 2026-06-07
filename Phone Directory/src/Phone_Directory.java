/*
Problem

Design a phone directory system that supports:

get() → provide an available number
check(number) → check if number available
release(number) → recycle/release number
Example
PhoneDirectory directory = new PhoneDirectory(3);

get()     -> 0
get()     -> 1
check(2)  -> true
get()     -> 2
check(2)  -> false
release(2)
check(2)  -> true
Requirements

Operations should be efficient:

ideally O(1)
Optimal Design

We need:

fast allocation
fast release
fast availability check
Data Structures Used
Queue

Stores available numbers.

HashSet

Stores used/allocated numbers.

Why Queue?

Queue gives:

next available number efficiently.
Why HashSet?

Efficient:

O(1)

lookup for availability.

System Design

Initially:

Available:
0,1,2,3...

When allocated:

remove from queue
add to used set

When released:

remove from used set
add back to queue

 */

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Phone_Directory {

	private int maxNumbers;
	private Queue<Integer> available;
	private Set<Integer> used;

	public Phone_Directory(int maxNumbers) {
		this.maxNumbers = maxNumbers;
		this.available = new LinkedList<Integer>();
		this.used = new HashSet<Integer>();

		for (int i = 0; i < maxNumbers; i++) {
			available.offer(i);
		}
	}

	// Provide available number
	public int get() {
		if (available.isEmpty())
			return -1;

		int number = available.poll();
		used.add(number);

		return number;
	}

	// Check availability
	public boolean check(int number) {
		if (number < 0 || number > maxNumbers)
			return false;

		return !used.contains(number);

	}

	// Release number
	public void release(int number) {
		if (used.remove(number))
			available.offer(number);
	}

	public static void main(String[] args) {
		Phone_Directory directory = new Phone_Directory(3);

		System.out.println(directory.get());

		System.out.println(directory.get());

		System.out.println(directory.check(2));

		System.out.println(directory.get());

		System.out.println(directory.check(2));

		directory.release(2);

		System.out.println(directory.check(2));

	}

}
