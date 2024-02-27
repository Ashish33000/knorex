package com.knorex;

import java.util.ArrayList;
import java.util.List;

public class Floor {
	private int floorNumber;
    private List<VehicleSpace> vehicleSpaces;

    public Floor(int floorNumber, int capacityPerVehicleType) {
        this.floorNumber = floorNumber;
        this.vehicleSpaces = new ArrayList<>();
        initializeVehicleSpaces(capacityPerVehicleType);
    }

    private void initializeVehicleSpaces(int capacityPerVehicleType) {
        for (int i = 1; i <= capacityPerVehicleType; i++) {
            vehicleSpaces.add(new VehicleSpace(i, VehicleType.CAR));
        }
    }

    public boolean checkAvailability(VehicleType vehicleType) {
        for (VehicleSpace space : vehicleSpaces) {
            if (space.getVehicleType() == vehicleType && space.isAvailable()) {
                return true;
            }
        }
        return false;
    }

    public VehicleSpace getAvailableSpace(VehicleType vehicleType) {
        for (VehicleSpace space : vehicleSpaces) {
            if (space.getVehicleType() == vehicleType && space.isAvailable()) {
                return space;
            }
        }
        return null;
    }

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public List<VehicleSpace> getVehicleSpaces() {
		return vehicleSpaces;
	}

	public void setVehicleSpaces(List<VehicleSpace> vehicleSpaces) {
		this.vehicleSpaces = vehicleSpaces;
	}
    

}
