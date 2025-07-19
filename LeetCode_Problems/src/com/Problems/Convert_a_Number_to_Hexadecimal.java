package com.Problems;

public class Convert_a_Number_to_Hexadecimal {

	public static void main(String[] args) {
		System.out.println(toHex(26)); // Output: "1a"
		System.out.println(toHex(-1)); // Output: "ffffffff"
		System.out.println(toHex(0)); // Output: "0"
		System.out.println(toHex(305441741)); // Output: "1234abcd"

	}

	private static String toHex(int num) {
		if (num == 0)
			return "0";

		char[] hexChars = "0123456789abcdef".toCharArray();
		StringBuilder sb = new StringBuilder();

		while (num != 0 && sb.length() < 8) {
			int last4Bits = num & 0xF;
			sb.append(hexChars[last4Bits]);
			num >>>= 4;
		}
		return sb.reverse().toString();
	}

}
