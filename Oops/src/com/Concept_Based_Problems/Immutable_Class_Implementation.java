package com.Concept_Based_Problems;

final class ImmutableStudent {
	private final int id;
	private final String name;

	public ImmutableStudent(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}

public class Immutable_Class_Implementation {

	public static void main(String[] args) {
		ImmutableStudent s = new ImmutableStudent(1, "Sutun");
		System.out.println(s.getId() + " - " + s.getName());  // 1 - Sutun

	}

}
