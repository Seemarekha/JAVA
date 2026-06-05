package com.PLS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {
	List<ParkingSpot> spots = new ArrayList<>();

	Map<Integer, Ticket> activeTickets = new HashMap<>();

	int ticketCounter = 1;

	ParkingLot() {
		spots.add(new ParkingSpot(1, VehicleType.BIKE));
		spots.add(new ParkingSpot(2, VehicleType.CAR));
		spots.add(new ParkingSpot(3, VehicleType.TRUCK));
	}

	// PARK VEHICLE
	Ticket parkVehicle(Vehicle vehicle) {
		for (ParkingSpot spot : spots) {
			if (spot.canFitVehicle(vehicle)) {
				spot.parkVehicle(vehicle);

				Ticket ticket = new Ticket(ticketCounter++, vehicle, spot);
				activeTickets.put(ticket.ticketId, ticket);

				return ticket;
			}
		}
		return null;
	}

	// EXIT VEHICLE
	void exitVehicle(int ticketId) {
		Ticket ticket = activeTickets.get(ticketId);

		if (ticket == null) {
			System.out.println("Invalid Ticket");
			return;
		}
		ticket.spot.removeVehicle();
		activeTickets.remove(ticketId);
		long duration = (System.currentTimeMillis() - ticket.entryTime) / 1000;

		System.out.println("Parking fee: " + duration * 10);
	}

}
