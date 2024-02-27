package com.knorex;

public class FlatCostStrategy implements CostStrategy {

	private final double bikeHourlyRate = 10;
    private final double carHourlyRate = 20;
    private final double busHourlyRate = 30;

    @Override
    public double calculateCost(int hours) {        
        return carHourlyRate * hours;
    }

}
