package com.OtherNumberPrograms;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {

		System.out.println("Enter a binary number :");

		int bin = new Scanner(System.in).nextInt();
		int dec = 0;
		int i = 1;
		while (bin > 0) {
			dec += (bin % 10) * i;
			i *= 2;
			bin /= 10;
		}
		System.out.println("Binary to Decimal conversion : " + dec);

	}

}
