/*
Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.

Example 1:

Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]


Example 2:

Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]


Example 3:

Input: temperatures = [30,60,90]
Output: [1,1,0]
 */

package com.Problems;

import java.util.Arrays;
import java.util.Stack;

public class Daily_Temperatures {

	public static void main(String[] args) {

		int[] res1 = dailyTemperatures(new int[] { 73, 74, 75, 71, 69, 72, 76, 73 });
		System.out.println(Arrays.toString(res1)); // [1,1,4,2,1,1,0,0]

		int[] res2 = dailyTemperatures(new int[] { 30, 40, 50, 60 });
		System.out.println(Arrays.toString(res2)); // [1,1,1,0]

		int[] res3 = dailyTemperatures(new int[] { 30, 60, 90 });
		System.out.println(Arrays.toString(res3)); // [1,1,0]

	}

	private static int[] dailyTemperatures(int[] temps) {
		int n = temps.length;
		int[] ans = new int[n];
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < n; i++) {
			while (!stack.isEmpty() && temps[i] > temps[stack.peek()]) {
				int prevIndex = stack.pop();
				ans[prevIndex] = i - prevIndex;
			}
			stack.push(i);
		}

		return ans;
	}

}
