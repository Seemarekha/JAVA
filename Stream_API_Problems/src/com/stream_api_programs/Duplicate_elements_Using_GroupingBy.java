package com.stream_api_programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicate_elements_Using_GroupingBy {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 5);

		List<Integer> duplicates = nums.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());

		System.out.println("Duplicates: " + duplicates); // Duplicates: [1, 2, 5]

	}

}
