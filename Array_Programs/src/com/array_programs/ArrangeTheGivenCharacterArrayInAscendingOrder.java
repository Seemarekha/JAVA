package com.array_programs;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ArrangeTheGivenCharacterArrayInAscendingOrder {

	public static void main(String[] args) {
		char[] charArray = { 'R', 'A', 'C', 'D', 'B' };
		System.out.println("Before sorting : " + Arrays.toString(charArray));

		Set<Character> set = new TreeSet<Character>();

		for (char c : charArray)
			set.add(c);

		System.out.println("After sorting : " + set);

	}

}
