// Find longest word in a list.

package com.stream_api_programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Longest_Word_In_List {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("Java", "SpringBoot", "React", "MicroServices");
		String longest = words.stream().max(Comparator.comparingInt(String::length)).orElse("");

		System.out.println("Longest : " + longest); // Longest : MicroServices

	}

}
