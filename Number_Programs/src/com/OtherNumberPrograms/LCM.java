package com.OtherNumberPrograms;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {

		System.out.println("Enter two number:");

		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int lcm = 0;

		int max = (n1 > n2) ? n1 : n2;

		for (int i = max; i <= n1 * n2; i++) {
			if (i % n1 == 0 && i % n2 == 0) {
				lcm = i;
				break;
			}
		}
		System.out.println("lcm (" + n1 + "," + n2 + ") = " + lcm);

	}

}
