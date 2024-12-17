package com.PalindromeNumber;

import java.util.Scanner;

public class PalindromeNumberInGivenRange {

	public static void main(String[] args) {

		System.out.println("Enter a range : ");
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Palindrome Numbers present in given range : ");
		for (int i = a; i <= b; i++) {
			int temp = i;
			int sum = 0;
			while (temp > 0) {
				int rem = temp % 10;
				sum = sum * 10 + rem;
				temp /= 10;
			}
			if (sum == i)
				System.out.print(i + " ");
		}

	}

}
