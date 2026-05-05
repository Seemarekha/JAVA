/*
You are given an integer n. 
A 0-indexed integer array nums of length n+1 is generated following the rules: 

1. nums[0]=0 
2. nums[1]=1 
3. nums[2*i]=nums[i], when 2<=2*i<=n 
4. nums[(2*i)+1]=nums[i]+nums[i+1], when 2<=2*i+1<=n 

Return the maximum integer in the array nums.
 */

package com.Infosys_PYQ;

import java.util.Arrays;

public class GetMaximumGenerated {

	public static void main(String[] args) {
		int n = 7;
		System.out.println(getMaximumGenerated(n)); 
		
		// [0, 1, 1, 2, 1, 3, 2, 3]
		// 3

	}

	private static int getMaximumGenerated(int n) {
		if (n == 0)
			return 0;

		int[] arr = new int[n + 1];
		arr[0] = 0;
		arr[1] = 1;

		int max = 1;

		for (int i = 2; i <= n; i++) {
			if (i % 2 == 0)
				arr[i] = arr[i / 2];
			else
				arr[i] = arr[i / 2] + arr[(i / 2 + 1)];
		}
		System.out.println(Arrays.toString(arr));
		for (int num : arr) {
			if (num > max)
				max = num;
		}

		return max;
	}

}
