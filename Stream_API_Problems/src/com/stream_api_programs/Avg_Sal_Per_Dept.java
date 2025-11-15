// Find average salary per department.

package com.stream_api_programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee3 {
	String dept;
	double salary;

	public Employee3(String dept, double salary) {
		this.dept = dept;
		this.salary = salary;
	}
}

public class Avg_Sal_Per_Dept {

	public static void main(String[] args) {
		List<Employee3> list = Arrays.asList(
				new Employee3("IT", 60000),
				new Employee3("IT", 70000),
				new Employee3("HR", 40000),
				new Employee3("Finance", 50000));

		Map<String, Double> map = list.stream()
				.collect(Collectors.groupingBy(e -> e.dept, Collectors.averagingDouble(e -> e.salary)));

		map.forEach((d, a) -> System.out.println(d + " -> " + a));

	}

}

/*****************************************/

/*
 
Finance -> 50000.0
HR -> 40000.0
IT -> 65000.0
 
 
 
 
 
 */
