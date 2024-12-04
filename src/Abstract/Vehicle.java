package Abstract;
import Interface.Rentable;

public abstract class Vehicle implements Rentable {

    protected String vehicleModel;
    protected String registrationNumber;
    protected int rentalPricePerDay;
    private static final Vehicle[] rentedVehicles = new Vehicle[4];
    private static int rentedCount = 0;

    public Vehicle(String vehicleModel, String registrationNumber, int rentalPricePerDay) {
        this.vehicleModel = vehicleModel;
        this.registrationNumber = registrationNumber;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    @Override
    public void vehicleDetails() {
        System.out.println("Model: " + vehicleModel);
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Rental price per day: " + rentalPricePerDay + "Kr");

    }

    @Override
    public void rent() {
        for (int i = 0; i < rentedCount; i++) {
            if (rentedVehicles[i] == this) {
                System.out.println(vehicleModel + " already rented");
                return;
            }

        }

        if (rentedCount < rentedVehicles.length) {
            rentedVehicles[rentedCount] = this;
            rentedCount++;
            System.out.println("You rented " + vehicleModel);
        }
    }


    @Override
    public void returnVehicle() {
        for (int i = 0; i < rentedCount; i++) {
            if (rentedVehicles[i] == this) {
                for (int z = i; z < rentedCount - 1; z++) {
                    rentedVehicles[z] = rentedVehicles[z + 1];
                }
                rentedVehicles[rentedCount - 1] = null;
                rentedCount--;
                System.out.println("You returned " + vehicleModel);
                return;
            }
        }

    }

    @Override
    public int price () {
        int totalRent = 0;
        for (int i = 0; i < rentedCount; i++) {
            totalRent += rentedVehicles[i].rentalPricePerDay;
        }
        return totalRent;

    }

    }
