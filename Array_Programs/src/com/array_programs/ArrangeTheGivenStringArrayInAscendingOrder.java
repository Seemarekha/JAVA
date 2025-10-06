package com.array_programs;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ArrangeTheGivenStringArrayInAscendingOrder {

	public static void main(String[] args) {
		String[] strs = { "Zack", "Alin", "Ben", "Riya", "Domini" };
		System.out.println("Before sorting : " + Arrays.toString(strs)); // Before sorting : [Zack, Alin, Ben, Riya, Domini]

		Set<String> set = new TreeSet<String>();

		for (String s : strs)
			set.add(s);

		System.out.println("After sorting : " + set); // After sorting : [Alin, Ben, Domini, Riya, Zack]

	}

}
