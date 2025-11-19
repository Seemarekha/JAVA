// Get the 2nd highest salary.

package com.stream_api_programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Second_Highest_Salary {

	public static void main(String[] args) {
		List<Integer> salaries = Arrays.asList(50000, 70000, 80000, 90000, 90000, 65000);

		int secondHighest = salaries.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst()
				.orElse(-1);

		System.out.println("2nd highest salary : " + secondHighest);
		// 2nd highest salary : 80000

	}

}
