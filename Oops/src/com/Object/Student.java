package com.Object;

import java.util.Scanner;

public class Student {

	String name;
	int age;
	int id;

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.add();
		s1.display();
		
		Student s2=new Student();
		s2.display();
	}

	public void add() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter ur name : ");
		name = scn.next();
		System.out.print("Enter ur age : ");
		age = scn.nextInt();
		System.out.print("Enter ur id : ");
		id = scn.nextInt();
	}

	public void display() {
		System.out.println("Student name : " + name);
		System.out.println("Student age : " + age);
		System.out.println("Student id : " + id);

	}
}
