package com.knorex;

public class VehicleSpace {
	
	private int spaceNumber;
    private boolean availability;
    private VehicleType vehicleType;

    public VehicleSpace(int spaceNumber, VehicleType vehicleType) {
        this.spaceNumber = spaceNumber;
        this.availability = true;
        this.vehicleType = vehicleType;
    }

	public int getSpaceNumber() {
		return spaceNumber;
	}

	public void setSpaceNumber(int spaceNumber) {
		this.spaceNumber = spaceNumber;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	public boolean isAvailable() {
        return availability;
    }
}
