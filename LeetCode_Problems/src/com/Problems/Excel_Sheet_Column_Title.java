package com.Problems;

public class Excel_Sheet_Column_Title {

	public static void main(String[] args) {
		System.out.println(convertToTitle(1));   // Output: A
        System.out.println(convertToTitle(26));  // Output: Z
        System.out.println(convertToTitle(27));  // Output: AA
        System.out.println(convertToTitle(28));  // Output: AB
        System.out.println(convertToTitle(701)); // Output: ZY
        System.out.println(convertToTitle(702)); // Output: ZZ
        System.out.println(convertToTitle(703)); // Output: AAA

	}

	private static String convertToTitle(int num) {
		StringBuilder res=new StringBuilder();
		
		while(num>0) {
			num--;
			int rem=num%26;
			char ch=(char)('A'+rem);
			res.insert(0, ch);
			num/=26;
		}
		return res.toString();
	}

}
