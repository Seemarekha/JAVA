/*
You are given an array ARR which has N integers. 

You want to construct a new array RES using ARR by following the below algorithm: 
1. Initially, RES is empty 
2. Start at any index of ARR 
3. Choose a direction ( left or right) and iterate over the elements of ARR starting from the chosen index in the chosen 
   direction 
4. Add each iteration element to the end of the RES. 
   Additionally, it is given that the array ARR is cyclic. 
   This means that after the last element you will iterate to the first one and vice versa. 
   The value of RES is the sum of the bitwise XOR value of all prefixes of it. 
   That means that the value of RES can be defined as follows: 
   value(RES)=RES[0]+(RES[0]^RES[1])+....+(RES[0]^RES[1]^RES[2]^...^RES[N-1]) 
   Find the maximum possible value of RES. 
   
   Example: 
   
   I/P:N=10, ARR=[7,8,5,5,9,2,2,0,1,6] 
   O/P:99 
   
   considering RES=[5,8,7,6,1,0,2,2,9,5] 
   value(RES)=5+(5^8)+(5^8^7)+.... 
   value(RES)=5+13+10+12+13+13+15+13+4+1
 */

package com.Infosys_PYQ;

public class MaxXorPrefixSum {

	public static void main(String[] args) {
		int[] arr = { 7, 8, 5, 5, 9, 2, 2, 0, 1, 6 };
		System.out.println(maxValue(arr)); // Output: 99

	}

	private static int maxValue(int[] arr) {
		int n = arr.length;
		int maxResult = 0;

		for (int start = 0; start < n; start++) {
			maxResult = Math.max(maxResult, calculate(arr, start, true));

			maxResult = Math.max(maxResult, calculate(arr, start, false));
		}

		return maxResult;
	}

	private static int calculate(int[] arr, int start, boolean right) {
		int n = arr.length;
		int xor = 0;
		int sum = 0;

		int index = start;

		for (int i = 0; i < n; i++) {
			xor ^= arr[index];
			sum += xor;

			if (right)
				index = (index + 1) % n;
			else
				index = (index - 1 + n) % n;
		}
		return sum;
	}

}
