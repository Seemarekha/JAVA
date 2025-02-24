package com.Object;

public class Water_Bottle {

	String name;
	String color;
	String type;
	int capacity;
	boolean flag = false;

	public void drinkWater() {
		if (flag)
			System.out.println("Drink water");
		else {
			System.out.println("Bottle id empty. Fill water");
		}
		flag = false;
	}

	public void filledWater() {
		flag = true;
		System.out.println("Now u can dring water");
	}

	public void display() {
		if (flag) {
			System.out.println("Bottle is full of water");
			System.out.println("Bottle name : " + name);
			System.out.println("Bottle color : " + color);
			System.out.println("Bottle type : " + type);
			System.out.println("Bottle capacity : " + capacity);
		} else {
			System.out.println("Bottle is empty");
		}
	}

}
