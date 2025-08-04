package com.OtherNumberPrograms;

import java.util.Scanner;

public class DecimalToHexaDecimal {

	public static void main(String[] args) {

		System.out.println("Enter a decimal number : ");
		int dec = new Scanner(System.in).nextInt();
		System.out.print("Decimal To HexaDecimal Conversion : Ox");
		convert(dec);

	}

	private static void convert(int dec) {

		char[] hexa = new char[100];

		int i = 0;
		while (dec > 0) {
			int rem = dec % 16;

			if (rem < 10)
				hexa[i++] = (char) (rem + 48);
			else
				hexa[i++] = (char) (rem + 55);

			dec /= 16;
		}

		for (int j = i - 1; j >= 0; j--)
			System.out.print(hexa[j]);

	}

}
