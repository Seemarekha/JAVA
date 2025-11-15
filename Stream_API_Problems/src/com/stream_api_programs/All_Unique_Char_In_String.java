package com.stream_api_programs;

import java.util.List;
import java.util.stream.Collectors;

public class All_Unique_Char_In_String {

	public static void main(String[] args) {
		String str = "programming";
		List<Character> unique = str.chars().mapToObj(c -> (char) c).distinct().collect(Collectors.toList());

		System.out.println(unique); // [p, r, o, g, a, m, i, n]
	}

}
