package com.OtherNumberPrograms;

import java.util.Scanner;

public class HexaDecimalToDecimal {

	public static void main(String[] args) {

		System.out.println("Enter a hexadecimal number :");

		String hex = new Scanner(System.in).next();

		System.out.println("HexaDecimal to Decimal conversion : " + convert(hex));

	}

	private static int convert(String hex) {

		String digits = "0123456789ABCDEF";
		hex = hex.toUpperCase();
		int value = 0;

		for (int i = 0; i < hex.length(); i++) {

			char c = hex.charAt(i);
			int d = digits.indexOf(c);
			value = 16 * value + d;

		}
		return value;
	}

}
