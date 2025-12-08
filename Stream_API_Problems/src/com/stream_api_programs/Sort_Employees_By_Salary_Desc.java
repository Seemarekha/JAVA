package com.stream_api_programs;

import java.util.Arrays;
import java.util.List;

class Employee4 {
	String name;
	double salary;

	public Employee4(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
}

public class Sort_Employees_By_Salary_Desc {

	public static void main(String[] args) {
		List<Employee4> list = Arrays.asList(new Employee4("Amit", 70000), new Employee4("Priya", 90000),
				new Employee4("Rohit", 60000));

		list.stream().sorted((a, b) -> Double.compare(b.salary, a.salary))
				.forEach(e -> System.out.println(e.name + " -> " + e.salary));

	}

}


/******************************************/

/*

Priya -> 90000.0
Amit -> 70000.0
Rohit -> 60000.0


*/