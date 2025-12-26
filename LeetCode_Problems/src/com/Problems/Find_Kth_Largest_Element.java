package com.Problems;

import java.util.PriorityQueue;

public class Find_Kth_Largest_Element {

	public static void main(String[] args) {
		int[] arr = { 44, 71, 25, 80, 92, 63, 19, 57 };
		int k = 3;
		System.out.println("Kth largest element : " + findKthLargestEle(arr, k)); // 71

	}

	private static int findKthLargestEle(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		for (int n : arr) {
			pq.add(n);
			if (pq.size() > k)
				pq.poll();
		}
		return pq.peek();
	}

}
