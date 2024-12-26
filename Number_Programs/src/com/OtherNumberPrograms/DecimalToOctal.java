package com.OtherNumberPrograms;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {

		System.out.println("Enter a decimal number");
		int dec = new Scanner(System.in).nextInt();

		int oct = 0;
		int i = 1;
		while (dec > 0) {
			int bit = dec % 8;
			oct = bit * i + oct;
			i *= 10;
			dec /= 8;
		}
		System.out.println("Decimal to Octal conversion : " + oct);

	}

}
