/*
This problem asks:

Given an unsorted array, find the minimum number of swaps required to sort the array.

Intuition

If an element is not in its correct position, we swap it.

But instead of swapping randomly, we use cycle decomposition.

A cycle means:

element A should go to B’s position
B should go to C’s position
C should go to A’s position

For a cycle of size k:

Minimum swaps needed = k - 1
Example
Array = [4, 3, 2, 1]

Sorted = [1, 2, 3, 4]

Indexes:

4 should go to index 3
1 should go to index 0

Cycle:

0 → 3 → 0

Another cycle:

1 → 2 → 1

Each cycle size = 2

So swaps:

(2-1) + (2-1) = 2

Answer = 2

 */

package com.Infosys_PYQ;

import java.util.Arrays;

public class Minimum_Number_Of_Swaps_To_Sort_An_Array {

	static class Pair {
		int val;
		int index;

		public Pair(int val, int index) {
			this.val = val;
			this.index = index;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 1 };
		int minSwaps = sortArrayInMinSwaps(arr);
		System.out.println("Minimum number of swap required to sort this array : " + minSwaps);

	}

	private static int sortArrayInMinSwaps(int[] arr) {
		int n = arr.length;

		Pair[] pairs = new Pair[n];

		for (int i = 0; i < n; i++) {
			pairs[i] = new Pair(arr[i], i);
		}

		Arrays.sort(pairs, (a, b) -> a.val - b.val);

		int swaps = 0;
		boolean[] vis = new boolean[n];

		for (int i = 0; i < n; i++) {
			if (vis[i] || pairs[i].index == i)
				continue;

			int cycles = 0;

			int j = i;

			while (!vis[j]) {
				vis[j] = true;
				j = pairs[j].index;
				cycles++;
			}

			if (cycles > 1)
				swaps += cycles - 1;
		}
		return swaps;
	}

}
