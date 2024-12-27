package com.OtherNumberPrograms;

import java.util.Scanner;

public class OctalToBinary {

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
		int bin = 0;
		int j = 1;
		while (dec > 0) {
			int bit = dec % 2;
			bin = bit * j + bin;
			j *= 10;
			dec /= 2;
		}
		System.out.println("Octal to Binary conversion : " + bin);
	}

}
