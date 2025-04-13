package com.Problems;

import java.util.Scanner;

public class Stair_Climbing {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter number of steps in stair : ");
		int n = scn.nextInt();
		int res = climbStairs(n);
		System.out.println("Number of ways to reach top of the stair ,if we climb 1 or 2 step at a time : " + res);

	}

	private static int climbStairs(int n) {

		if (n == 1)
			return 1;

		int one = 1;
		int two = 2;

		for (int i = 3; i <= n; i++) {
			int total = one + two;
			one = two;
			two = total;
		}
		return two;
	}

}



/************************* Output ***************************/

/*


Enter number of steps in stair : 4
Number of ways to reach top of the stair ,if we climb 1 or 2 step at a time : 5



*/