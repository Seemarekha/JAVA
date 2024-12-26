package com.OtherNumberPrograms;

import java.util.Scanner;

public class OctalToDecimal {

	public static void main(String[] args) {
		System.out.println("Enter a octal number :");

		int oct = new Scanner(System.in).nextInt();
		int dec = 0;
		int i = 1;
		while (oct > 0) {
			dec += (oct % 10) * i;
			i *= 8;
			oct /= 10;
		}
		System.out.println("Octal to Decimal conversion : " + dec);

	}

}
