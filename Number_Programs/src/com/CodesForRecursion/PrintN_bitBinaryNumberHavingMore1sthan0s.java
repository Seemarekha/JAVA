package com.CodesForRecursion;

import java.util.Scanner;

public class PrintN_bitBinaryNumberHavingMore1sthan0s {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		int n = new Scanner(System.in).nextInt();
		printNums(n);

	}

	static void printNums(int n) {
		String str = "";
		printRec(str, 0, n);
	}

	static void printRec(String number, int extraOnes, int remainingPlaces) {
		if (0 == remainingPlaces) {
			System.out.print(number + " ");
			return;
		}

		printRec(number + "1", extraOnes + 1, remainingPlaces - 1);

		if (0 < extraOnes)
			printRec(number + "0", extraOnes - 1, remainingPlaces - 1);
	}

}
