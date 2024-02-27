package com.knorex;

public class Vehicle {
    private String registrationNumber;
    private String color;
    private VehicleType vehicleType;
    private int hoursParked;

    public Vehicle(String registrationNumber, String color, VehicleType vehicleType) {
        this.registrationNumber = registrationNumber;
        this.color = color;
        this.vehicleType = vehicleType;
    }

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getHoursParked() {
		return hoursParked;
	}

	public void setHoursParked(int hoursParked) {
		this.hoursParked = hoursParked;
	}

    

    
}

