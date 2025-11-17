package com.stream_api_programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employees {
	String name;
	String dept;

	public Employees(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
}

public class Group_Employees_By_Dept_And_List_Their_Names {

	public static void main(String[] args) {
		List<Employees> list = Arrays.asList(
				new Employees("Amit", "IT"),
				new Employees("Priya", "HR"),
				new Employees("Rohit", "IT"),
				new Employees("Sneha", "Finance")
				);

		Map<String, List<String>> grouped = list.stream()
				.collect(Collectors.groupingBy(e -> e.dept, Collectors.mapping(e -> e.name, Collectors.toList())));

		grouped.forEach((dept, names) -> System.out.println(dept + " -> " + names));

	}

}


/**********************************/

/*


Finance -> [Sneha]
HR -> [Priya]
IT -> [Amit, Rohit]




*/
