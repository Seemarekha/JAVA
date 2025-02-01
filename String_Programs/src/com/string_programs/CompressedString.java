package com.string_programs;

import java.util.Scanner;

public class CompressedString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = scn.next();
		System.out.println("Before compression : " + str);
		int arr[] = new int[255];

		for (int i = 0; i < str.length(); i += 2) {
			arr[str.charAt(i)] += str.charAt(i + 1) - '0';
		}

		String ans = "";
		char ch=32;

		for (int i = 0; i < 255; i++) {
			if (arr[i] != 0) {
				ch=(char)i;
				ans=ans+ch+arr[i];
			}
		}
		System.out.println("After compression : " + ans);

	}

}
