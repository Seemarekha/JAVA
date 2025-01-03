package com.OtherNumberPrograms;

public class RemoveAdjacentDuplicates {

	public static void main(String[] args) {
		String s = "abbacad";
		System.out.println("After removing adjacent duplicates : "+removeDuplicates(s));
	}

	private static String removeDuplicates(String s) {
		StringBuilder sb = new StringBuilder();
		int i = 0;

		while (i < s.length()) {
			if (sb.length() > 0 && sb.charAt(sb.length() - 1) == s.charAt(i))
				sb.deleteCharAt(sb.length() - 1);
			else
				sb.append(s.charAt(i));
			i++;

		}
		return sb.toString();
	}

}
