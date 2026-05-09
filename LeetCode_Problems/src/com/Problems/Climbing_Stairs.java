package com.Problems;

import java.util.Scanner;

public class Climbing_Stairs {

	public static void main(String[] args) {
		System.out.print("Enter number of steps : ");
		int n = new Scanner(System.in).nextInt();
		System.out.println("Number of ways to climbs " + n + " steps :" + climbStairs(n));

	}

	// using dp

	private static int climbStairs(int n) {
		int[] dp = new int[n + 1];

		dp[0] = 1;
		dp[1] = 1;

		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}

	// Normal approach
//	private static int climbStairs(int n) {
//		if(n<=1) return 1;
//		
//		int first=1;
//		int second=1;
//		int total=0;
//		
//		for(int i=2;i<=n;i++)
//		{
//			total=first+second;
//			first=second;
//			second=total;
//		}
//		return second;
//	}

}

/***************** Output *******************/

/*
 * 
 * 
 * Enter number of steps : 2 
 * Number of ways to climbs 2 steps :2
 * 
 * 
 * Enter number of steps : 3 
 * Number of ways to climbs 3 steps :3
 * 
 * 
 * 
 * Enter number of steps : 5 
 * Number of ways to climbs 5 steps :8
 * 
 * 
 * 
 * 
 */
