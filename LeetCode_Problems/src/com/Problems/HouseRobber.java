package com.Problems;

public class HouseRobber {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 9, 3, 1 };
		System.out.println(rob(nums)); // Output: 12

	}

	// Using dp
	
	private static int rob(int[] nums) {
		int n=nums.length;
		
		int[] dp=new int[n];
		dp[0]=nums[0];
		dp[1]=Math.max(nums[0], nums[1]);
		
		for(int i=1;i<n;i++)
		{
			dp[i]=Math.max(dp[i-1], dp[i-2]+nums[i]);
		}
		return dp[n-1];
	}

	// Normal approach
	
//	private static int rob(int[] nums) {
//		int prev = 0;
//		int curr = 0;
//
//		for (int n : nums) {
//			int temp = Math.max(curr, prev + n);
//			prev = curr;
//			curr = temp;
//		}
//		return curr;
//	}

}
