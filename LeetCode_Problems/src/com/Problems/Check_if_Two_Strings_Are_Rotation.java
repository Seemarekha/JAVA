package com.Problems;

public class Check_if_Two_Strings_Are_Rotation {

	public static void main(String[] args) {
		String s1 = "ABCD";
		String s2 = "CDAB";
		System.out.println("Is Rotation: " + isRotation(s1, s2)); // true

	}

	private static boolean isRotation(String s1, String s2) {
		return (s1.length() == s2.length() && (s1 + s2).contains(s2));
	}

}
