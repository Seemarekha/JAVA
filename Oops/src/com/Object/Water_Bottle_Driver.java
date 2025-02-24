package com.Object;

public class Water_Bottle_Driver {

	public static void main(String[] args) {
		Water_Bottle w = new Water_Bottle();

		w.name = "Milton";
		w.color = "Silver";
		w.type = "Steel";
		w.capacity = 1;

		w.display();
		w.drinkWater();
		w.filledWater();
	    w.display();
		w.drinkWater();

	}

}
