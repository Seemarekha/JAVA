package com.string_programs;

import java.util.Scanner;

public class Monster_Group {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string here : ");
		String str = scn.nextLine();
		int minLength = solution(str);
		System.out.println("Minimum length of the group that will be killed : " + minLength);

	}

	private static int solution(String str) {
		int a = 0, minLength = Integer.MAX_VALUE;
		for (int i = 0; i < str.length(); i++) {
			a++;
			if (str.charAt(i) == '@' || str.charAt(i) == '$') {
				minLength = Math.min(a, minLength);
				a = 0;
			}
		}
		minLength = Math.min(a, minLength);
		return minLength;
	}

}
