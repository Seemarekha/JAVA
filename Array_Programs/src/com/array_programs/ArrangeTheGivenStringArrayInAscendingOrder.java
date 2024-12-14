package com.array_programs;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ArrangeTheGivenStringArrayInAscendingOrder {

	public static void main(String[] args) {
		String[] str = { "Zack", "Alin", "Ben", "Riya", "Domini" };
		System.out.println("Before sorting : " + Arrays.toString(str));

		Set<String> s = new TreeSet<String>();

		for (String st : str)
			s.add(st);

		System.out.println("After sorting : " + s);

	}

}
