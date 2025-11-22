package com.Problems;

public class HouseRobber {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 9, 3, 1 };
		System.out.println(rob(nums)); // Output: 12

	}

	private static int rob(int[] nums) {
		int prev = 0;
		int curr = 0;

		for (int n : nums) {
			int temp = Math.max(curr, prev + n);
			prev = curr;
			curr = temp;
		}
		return curr;
	}

}
