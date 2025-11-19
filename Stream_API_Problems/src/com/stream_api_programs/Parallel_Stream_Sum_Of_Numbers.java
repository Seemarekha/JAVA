package com.stream_api_programs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Parallel_Stream_Sum_Of_Numbers {

	public static void main(String[] args) {
		List<Integer> nums = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());

		int sum = nums.parallelStream().mapToInt(Integer::intValue).sum();

		System.out.println("Sum = " + sum); // Sum = 5050

	}

}
