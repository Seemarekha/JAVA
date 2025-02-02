package com.string_programs;

import java.util.Scanner;

public class PasswordDecription {

	public static void main(String[] args) {
		System.out.println("Enter a string :");
		String s = new Scanner(System.in).next();
		char[] arr = s.toCharArray();
		String curr = "";
		String res = "";

		for (int i = s.length() - 1; i >= 0; i -= 2) {

			curr = "" + arr[i] + arr[i-1];

			int n = Integer.parseInt(curr);

			if (n == 32) {
				res += " ";
			} else if ((n >= 65 && n <= 90) || (n >= 97 && n <= 122)) {
				res += (char) n;
			} else {
				if (i - 2 < 0)
					break;
				curr += arr[i - 2];
				n = Integer.parseInt(curr);
				res += (char) n;
				i--;

			}
		}
		System.out.println("Decrypted String: " + res);

	}

}


/*
output :
Enter a string :
798117947
Decrypted String: Java

*/
