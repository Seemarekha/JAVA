package com.PLS;

public class Main {

	public static void main(String[] args) {
		 ParkingLot lot = new ParkingLot();

	        Vehicle car =
	                new Car("KA01AB1234");

	        Ticket ticket =
	                lot.parkVehicle(car);

	        if (ticket != null) {

	            System.out.println(
	                    "Vehicle Parked. Ticket ID: "
	                            + ticket.ticketId
	            );
	        }

	        lot.exitVehicle(ticket.ticketId);

	}

}
