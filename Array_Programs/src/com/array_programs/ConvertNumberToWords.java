package com.array_programs;

import java.util.Scanner;

public class ConvertNumberToWords {

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		int num = new Scanner(System.in).nextInt();

		word(num / 10000000, " crore ");
		word((num / 100000) % 100, " lakhs ");
		word((num / 1000) % 100, " thousand ");
		word((num / 100) % 10, " hundred ");
		word(num % 100, " ");

	}

	private static void word(int num, String string) {
		String[] one = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String[] two = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty" };

		if (num <= 19)
			System.out.print(one[num]);
		else

			System.out.print(two[num / 10] + " " + one[num % 10]);

		if (num != 0)
			System.out.print(string);

	}

}
