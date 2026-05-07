/*
 Given an array of T length each index contains array of two binary strings, 
 your task is to return their maximum sum(Also a binary string). 
 
 First Line contains T array length, next n lines contain two string which shows binary space separated m, n. 
 Find the sum of m and n in binary and print the maximum binary sum from the array elements. 
 
 Input 
 3 
 101 100 
 110 10 
 1000 11 
 
 output: 1011
 */

package com.Infosys_PYQ;

import java.util.Scanner;

public class MaxBinarySum {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int T = scn.nextInt();
		int maxSum = 0;

		for (int i = 0; i < T; i++) {
			String a = scn.next();
			String b = scn.next();

			int num1 = Integer.parseInt(a, 2);
			int num2 = Integer.parseInt(b, 2);

			int sum = num1 + num2;

			maxSum = Math.max(maxSum, sum);

		}

		System.out.print(Integer.toBinaryString(maxSum));

	}

}
