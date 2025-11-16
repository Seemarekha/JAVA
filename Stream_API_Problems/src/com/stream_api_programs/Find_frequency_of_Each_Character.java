package com.stream_api_programs;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find_frequency_of_Each_Character {

	public static void main(String[] args) {
		String str = "banana";
		Map<Character, Long> freq = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(freq); // {a=3, b=1, n=2}

	}

}
