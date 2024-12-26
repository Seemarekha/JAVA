package com.OtherNumberPrograms;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {

		System.out.println("Enter two number:");

		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int hcf = 0;
		for (int i = 1; i <= n1 || i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0)
				hcf = i;
		}

		System.out.println("hcf (" + n1 + "," + n2 + ") = " + hcf);
	}

}
