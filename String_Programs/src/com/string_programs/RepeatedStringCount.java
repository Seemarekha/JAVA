package com.string_programs;

import java.util.Scanner;

public class RepeatedStringCount {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter repeated string :");
		String s = scn.next();
		System.out.println("Enter number of character :");
		long n = scn.nextLong();
		long charCount = repeatedString(s, n);
		System.out.println("Repeated count of a :"+charCount);
		scn.close();

	}

	private static long repeatedString(String s, long n) {
		long strLength = s.length();
		long q = 0, r = 0;
		q = n / strLength;
		r = n % strLength;
		long partialLength = (r == 0) ? 0 : r;
		long charCount = q * getCharCount(s, strLength) + getCharCount(s, partialLength);
		return charCount;
	}

	private static long getCharCount(String s, long strLength) {
		long count = 0;
		for (int i = 0; i < strLength; i++) {
			if (s.charAt(i) == 'a')
				count++;
		}
		return count;
	}

}


/*


Enter repeated string :
aba
Enter number of character :
10
Repeated count of a :7


*/
