package Subklasser;
import Abstract.Vehicle;

public class SUV extends Vehicle {
    private final String hybrid;

    public SUV(String vehicleModel, String registrationNumber, int rentalPricePerDay, String hybrid) {
        super(vehicleModel, registrationNumber, rentalPricePerDay);
        this.hybrid = hybrid;

    }

    public String getHybrid() {
        return hybrid;
    }
}
