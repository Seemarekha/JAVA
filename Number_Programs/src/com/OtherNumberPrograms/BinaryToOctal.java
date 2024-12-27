package com.OtherNumberPrograms;

import java.util.Scanner;

public class BinaryToOctal {

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

		int oct = 0;
		int j = 1;

		while (dec > 0) {
			int bit = dec % 8;
			oct = bit * j + oct;
			j *= 10;
			dec /= 8;
		}

		System.out.println("Binary to Octal conversion : " + oct);

	}

}
