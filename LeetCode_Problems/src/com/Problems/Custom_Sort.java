package com.Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Custom_Sort {

	public static void main(String[] args) {
		String str = "d3c1bA";
		System.out.println("Given string : " + str);

		String res = sortOnlyLetters(str);
		System.out.println("After sorting : " + res);

	}

	private static String sortOnlyLetters(String str) {

		List<Character> ls = new ArrayList<Character>();
		for (char c : str.toCharArray()) {
			if (Character.isLetter(c))
				ls.add(c);
		}
		Collections.sort(ls);

		StringBuilder res = new StringBuilder();
		int i = 0;
		for (char c : str.toCharArray()) {
			if (Character.isLetter(c))
				res.append(ls.get(i++));
			else
				res.append(c);
		}
		return res.toString();
	}

}


/********************* Output ******************/


/*



Given string : d3c1bA
After sorting : A3b1cd


*/
