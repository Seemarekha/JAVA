// Maximum number of handshakes

package com.OtherNumberPrograms;

import java.util.Scanner;

public class NumberOfHandshakes {

	public static void main(String[] args) {

		System.out.println("Enter number of people :");
		int n = new Scanner(System.in).nextInt();

		int res = n * (n - 1) / 2;

		System.out.println("For " + n + " people there will be " + res + " handshakes");

	}

}
