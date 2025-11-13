package com.Problems;

public class AddBinary {

	public static void main(String[] args) {
		String a = "11";
		String b = "1";
		String res = addBinary(a, b);
		System.out.println(res); // 100

	}

	private static String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder();
		int i = a.length() - 1;
		int j = b.length() - 1;
		int carry = 0;

		while (i >= 0 || j >= 0 || carry > 0) {

			int d1 = (i >= 0) ? a.charAt(i) - '0' : 0;
			int d2 = (j >= 0) ? b.charAt(j) - '0' : 0;

			int sum = d1 + d2 + carry;

			sb.append(sum % 2);
			carry = sum / 2;

			i--;
			j--;

		}
		return sb.reverse().toString();
	}

}
