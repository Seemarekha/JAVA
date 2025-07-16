package com.Problems;

public class Excel_Sheet_Column_Number {

	public static void main(String[] args) {
		System.out.println(titleToNumber("A"));    // Output: 1
        System.out.println(titleToNumber("Z"));    // Output: 26
        System.out.println(titleToNumber("AA"));   // Output: 27
        System.out.println(titleToNumber("AB"));   // Output: 28
        System.out.println(titleToNumber("ZY"));   // Output: 701
        System.out.println(titleToNumber("ZZ"));   // Output: 702
        System.out.println(titleToNumber("AAA"));  // Output: 703

	}

	private static int titleToNumber(String string) {
		int res=0;
		for(int i=0;i<string.length();i++)
		{
			char ch=string.charAt(i);
			int val=ch-'A'+1;
			res=res*26+val;
		}
		return res;
	}

}
