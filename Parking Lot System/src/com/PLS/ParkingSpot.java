package com.PLS;

public class ParkingSpot {

	int spotId;
	VehicleType type;
	boolean occupied;
	Vehicle vehicle;

	public ParkingSpot(int spotId, VehicleType type) {

		this.spotId = spotId;
		this.type = type;
		this.occupied = false;
	}

	boolean canFitVehicle(Vehicle vehicle) {
		return !occupied && this.type == vehicle.vType;
	}

	void parkVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
		occupied = true;
	}

	void removeVehicle() {
		this.vehicle = null;
		occupied = false;
	}

}
