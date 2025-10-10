package com.CodesForRecursion;

import java.util.Scanner;

public class PrintN_bitBinaryNumberHavingMore1sthan0s {

	public static void main(String[] args) {
		System.out.print("Enter a number:");
		int n = new Scanner(System.in).nextInt();
		System.out.println("Print N-bit binary numbers having more 1's than 0's :");
		printNums(n);

	}

	static void printNums(int n) {
		String str = "";
		printRec(str, 0, n);
	}

	static void printRec(String number, int extraOnes, int remainingPlaces) {
		if (remainingPlaces == 0) {
			System.out.print(number + " ");
			return;
		}

		printRec(number + "1", extraOnes + 1, remainingPlaces - 1);

		if (extraOnes > 0)
			printRec(number + "0", extraOnes - 1, remainingPlaces - 1);
	}

}

/************** Output ********************/

/*
 * 
 * 
 * 
 * Enter a number:4 Print N-bit binary numbers having more 1's than 0's : 1111
 * 1110 1101 1100 1011 1010
 * 
 * 
 * 
 */
