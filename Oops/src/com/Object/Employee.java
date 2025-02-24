package com.Object;

public class Employee {

	String name;
	int age;
	int id;

	public void add(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public void display() {
		System.out.println("Employee name : " + name);
		System.out.println("Employee age : " + age);
		System.out.println("Employee id : " + id);
	}

	public static void main(String[] args) {

		Employee e;
		e = new Employee();
		e.add("Virat", 40, 101);
		e.display();

	}

}
