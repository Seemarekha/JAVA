package com.PLS;

public class Vehicle {
	String licenseNumber;
	VehicleType vType;

	public Vehicle(String licenseNumber, VehicleType vType) {
		this.licenseNumber = licenseNumber;
		this.vType = vType;
	}

}

class Bike extends Vehicle {

	Bike(String number) {

		super(number, VehicleType.BIKE);
	}
}

class Car extends Vehicle {

	Car(String number) {

		super(number, VehicleType.CAR);
	}
}

class Truck extends Vehicle {

	Truck(String number) {

		super(number, VehicleType.TRUCK);
	}
}
