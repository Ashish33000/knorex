package com.knorex;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParkingLot parkingLot = new ParkingLot(2, 2);


        parkingLot.parkVehicle("ABSIHI","Red", VehicleType.CAR);
        parkingLot.parkVehicle("XYZ456", "Blue", VehicleType.CAR);
        parkingLot.parkVehicle("DEF7HHH","Green", VehicleType.CAR);      
        parkingLot.removeVehicle("ABC123", 2);
        boolean availability = parkingLot.checkAvailability(1, VehicleType.CAR);
        System.out.println("Availability on Floor 1 for Cars: " + availability);

	}

}
