package com.stream_api_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatten_List_Of_Lists {
	public static void main(String[] args) {
		List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));

		List<Integer> flat = numbers.stream().flatMap(List::stream).collect(Collectors.toList());

		System.out.println(flat);  // [1, 2, 3, 4, 5, 6]
	}
}
