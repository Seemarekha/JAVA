package com.stream_api_programs;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Remove_Null_Values_From_List {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", null, "Spring", "React", null);

		List<String> res = list.stream().filter(Objects::nonNull).collect(Collectors.toList());
		System.out.println(res); // [Java, Spring, React]

	}

}
