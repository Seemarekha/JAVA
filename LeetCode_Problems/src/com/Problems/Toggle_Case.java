package com.Problems;

import java.util.Scanner;

public class Toggle_Case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = sc.next();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (Character.isUpperCase(ch)) {
				sb.append(Character.toLowerCase(ch));
			} else if (Character.isLowerCase(ch)) {
				sb.append(Character.toUpperCase(ch));
			} else {
				sb.append(ch);
			}
		}
		System.out.println("Toggled string : " + sb);

	}

}
