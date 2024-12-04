package Subklasser;
import Abstract.Vehicle;

public class Car extends Vehicle {
    private final String fuelType;

    public Car(String vehicleModel, String registrationNumber, int rentalPricePerDay, String fuelType) {
        super(vehicleModel, registrationNumber, rentalPricePerDay);
        this.fuelType = fuelType;

    }

    public String getFuelType() {
        return fuelType;
    }
}
