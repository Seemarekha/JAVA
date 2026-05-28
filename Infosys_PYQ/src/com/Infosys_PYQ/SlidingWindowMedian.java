/*
Problem

Find median of every window of size k.

Example
nums = [1,3,-1,-3,5,3,6,7]
k = 3

Output:

[1,-1,-1,3,5,6]
 */

package com.Infosys_PYQ;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class SlidingWindowMedian {

	public static void main(String[] args) {
		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };

		System.out.println(Arrays.toString(medianSlidingWindow(nums, 3)));

	}

	private static double[] medianSlidingWindow(int[] nums, int k) {

		PriorityQueue<Integer> small = new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> large = new PriorityQueue<Integer>();

		double[] res = new double[nums.length - k + 1];
		int index = 0;

		for (int i = 0; i < nums.length; i++) {
			if (small.isEmpty() || nums[i] <= small.peek())
				small.offer(nums[i]);
			else
				large.offer(nums[i]);

			balance(small, large);

			if (i >= k) {
				int remove = nums[i - k];
				if (remove <= small.peek())
					small.remove(remove);
				else
					large.remove(remove);

				balance(small, large);
			}

			if (i >= k - 1) {
				if (k % 2 == 1) {
					res[index++] = small.peek();
				} else {
					res[index++] = ((double) small.peek() + large.peek()) / 2.0;
				}
			}
		}
		return res;
	}

	private static void balance(PriorityQueue<Integer> small, PriorityQueue<Integer> large) {

		while (small.size() > large.size() + 1)
			large.offer(small.poll());

		while (large.size() > small.size())
			small.offer(large.poll());

	}

}
