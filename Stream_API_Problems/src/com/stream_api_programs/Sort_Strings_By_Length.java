package com.stream_api_programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sort_Strings_By_Length {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("React", "Java", "SpringBoot", "API");

		list.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);

	}

}

/******************************/

/*


API
Java
React
SpringBoot


*/