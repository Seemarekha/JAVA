package com.PLS;

public class Ticket {
	int ticketId;

	Vehicle vehicle;

	ParkingSpot spot;

	long entryTime;

	public Ticket(int ticketId, Vehicle vehicle, ParkingSpot spot) {

		this.ticketId = ticketId;
		this.vehicle = vehicle;
		this.spot = spot;
		this.entryTime = System.currentTimeMillis();
	}

}
