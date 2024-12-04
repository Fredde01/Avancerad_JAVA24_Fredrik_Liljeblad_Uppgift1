import Subklasser.Car;
import Subklasser.Convertible;
import Subklasser.SUV;
import Subklasser.Truck;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

            Car car = new Car("BMW M3", "GET420", 1000, "Petrol");
            SUV suv = new SUV("PORSCHE CAYENNE", "AGT007", 750, "Yes");
            Truck truck = new Truck("VOLVO FH", "VOL691", 1275, 17.5);
            Convertible convertible = new Convertible("PORSCHE 911", "LOL123", 1100, "Yes");

            Scanner scanner = new Scanner(System.in);

                int choice;
                int returnChoice;
                String rentChoice;
                String returnMore;

                System.out.println("Welcome to Freddes Car-rental, what would you like to rent?");

                do {
                    System.out.println("1. Rent a car");
                    System.out.println("2. Rent a suv");
                    System.out.println("3. Rent a truck");
                    System.out.println("4. Rent a convertible");
                    System.out.println("5. I want to return a vehicle");
                    System.out.println("6. Exit");

                    choice = scanner.nextInt();

                    switch (choice) {

                        case 1:
                            car.vehicleDetails();
                            System.out.println("Fuel type: " + car.getFuelType());
                            System.out.println("Do you want to rent this vehicle? yes/no");

                            rentChoice = scanner.next();

                            if(rentChoice.equalsIgnoreCase("yes")){
                                car.rent();
                            } else {
                                continue;
                            }
                            break;

                        case 2:
                            suv.vehicleDetails();
                            System.out.println("Hybrid: " + suv.getHybrid());
                            System.out.println("Do you want to rent this vehicle? yes/no");
                            rentChoice = scanner.next();

                            if(rentChoice.equalsIgnoreCase("yes")){
                                suv.rent();
                            } else {
                                continue;
                            }
                            break;

                        case 3:
                            truck.vehicleDetails();
                            System.out.println("Maxweight: " + truck.getMaxWeight() + " TON");
                            System.out.println("Do you want to rent this vehicle? yes/no");
                            rentChoice = scanner.next();

                            if(rentChoice.equalsIgnoreCase("yes")){
                                truck.rent();
                            } else {
                                continue;
                            }
                            break;

                        case 4:
                            convertible.vehicleDetails();
                            System.out.println("Winddeflector: " + convertible.getWindDeflector());
                            System.out.println("Do you want to rent this vehicle? yes/no");
                            rentChoice = scanner.next();

                            if(rentChoice.equalsIgnoreCase("yes")){
                                convertible.rent();
                            } else {
                                continue;
                            }
                            break;

                        case 5:
                            System.out.println("What vehicle would you like to return?");

                            do {
                                System.out.println("1. Return a car");
                                System.out.println("2. Return a suv");
                                System.out.println("3. Return a truck");
                                System.out.println("4. Return a convertible");
                                System.out.println("5. Go back to the main menu");

                                returnChoice = scanner.nextInt();

                                switch (returnChoice) {

                                    case 1:
                                        car.returnVehicle();
                                        break;

                                    case 2:
                                        suv.returnVehicle();
                                        break;

                                    case 3:
                                        truck.returnVehicle();
                                        break;

                                    case 4:
                                        convertible.returnVehicle();
                                        break;

                                    case 5:
                                        System.out.println("Main menu");
                                        break;

                                    default:
                                        System.out.println("Invalid choice, choose again!");
                                        continue;
                                }

                                System.out.println("Would you like to return another vehicle? yes/no");
                                returnMore = scanner.next();

                                if(returnMore.equalsIgnoreCase("no")){
                                    System.out.println("Main menu");
                                    break;
                                }

                            } while (returnChoice != 5);
                                    break;

                        case 6:

                            int totalRent = car.price();
                            System.out.println("Thank you for using Freddes Car-rental, your total rent per day is " + totalRent + "Kr");
                            break;

                        default:
                            System.out.println("Invalid choice, choose again!");
                            break;
                    }
                }
                while (choice != 6); {
              }
                scanner.close();
            }

        }
