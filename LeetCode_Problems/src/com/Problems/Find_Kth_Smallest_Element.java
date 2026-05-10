package com.Problems;

import java.util.Collections;
import java.util.PriorityQueue;

public class Find_Kth_Smallest_Element {

	public static void main(String[] args) {
		int[] arr = { 44, 71, 25, 80, 92, 63, 19, 57 };
		int k = 3;
		System.out.println("Kth largest element : " + findKthSmallestEle(arr, k)); // 44

	}

	private static int findKthSmallestEle(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (int n : arr) {
			pq.add(n);
			if (pq.size() > k)
				pq.poll();
		}
		return pq.peek();
	}

}
