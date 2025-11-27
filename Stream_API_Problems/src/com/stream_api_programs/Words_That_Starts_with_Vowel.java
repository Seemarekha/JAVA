package com.stream_api_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Words_That_Starts_with_Vowel {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "orange", "grape", "banana", "umbrella");

		List<String> vowels = words.stream().filter(w -> w.matches("^[aeiouAEIOU].*")).collect(Collectors.toList());

		System.out.println(vowels); // [apple, orange, umbrella]

	}

}
