package Subklasser;
import Abstract.Vehicle;

public class Truck extends Vehicle {
    private final double maxWeight;

    public Truck(String vehicleModel, String registrationNumber, int rentalPricePerDay, double maxWeight) {
        super(vehicleModel, registrationNumber, rentalPricePerDay);
        this.maxWeight = maxWeight;

    }

    public double getMaxWeight() {
        return maxWeight;
    }
}
