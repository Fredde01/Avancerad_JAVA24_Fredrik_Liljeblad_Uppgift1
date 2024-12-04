package Subklasser;
import Abstract.Vehicle;
public class Convertible extends Vehicle {
    private final String windDeflector;

    public Convertible(String vehicleModel, String registrationNumber, int rentalPricePerDay, String windDeflector) {
        super(vehicleModel, registrationNumber, rentalPricePerDay);
        this.windDeflector = windDeflector;

    }

    public String getWindDeflector() {
        return windDeflector;
    }
}

