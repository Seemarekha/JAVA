/*
You are given a string "number" representing a positive integer and a character digit. 

Return the resulting string after removing exactly one occurrence of digit from number such that the value of the 
resulting string in decimal form is maximized. 
The test cases are generated such that digit occurs at least once in the number. 

i/p : number="1321"
      digit d='1'
      
      
o/p : "321"
 */

package com.Infosys_PYQ;

import java.util.Scanner;

public class RemoveDigitMaximize {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String number = scn.next();
		char digit = scn.next().charAt(0);
		String ans = removeDigit(number, digit);
		System.out.println(ans);

	}

	private static String removeDigit(String number, char digit) {

		for (int i = 0; i < number.length() - 1; i++) {
			if (number.charAt(i) == digit && number.charAt(i + 1) > digit)
				return number.substring(0, i) + number.substring(i + 1);
		}

		int lastIndex = number.lastIndexOf(digit);
		return number.substring(0, lastIndex) + number.substring(lastIndex + 1);
	}

}
