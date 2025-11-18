// Find the highest-paid employee using Streams.

package com.stream_api_programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee {
	String name;
	double salary;
	String dept;

	public Employee(String name, double salary, String dept) {
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
}

public class Highest_paid_Employee {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Sutun", 50000, "IT"), new Employee("Butun", 70000, "IAS"),
				new Employee("Samee", 60000, "IPS"));

		Employee maxSalEmp = list.stream().max(Comparator.comparingDouble(e -> e.salary)).orElse(null);

		System.out.println(maxSalEmp.name + " has highest salary: " + maxSalEmp.salary);
		// Butun has highest salary: 70000.0

	}

}
