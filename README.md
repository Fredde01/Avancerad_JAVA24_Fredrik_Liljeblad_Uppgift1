# Car-rental system

## A car-rental system written in JAVA!

### Functions
#### This car-rental system was created for a school assignment and may not represent a completed production-ready system. It's basically a Car-rental that you navigate through a console. The project allows you to do a couple of things, for example:

* Rent a Car, SUV, Truck or Convertible.
* Return the Car, Suv, Truck or Convertible back to the car-rental.
* You can rent more than one vehicle.
* You can't rent the same vehicle twice.
* You will receive a summarized cost of the rent per day when you are finished.
* You have a console based menu where you can navigate around.
---

### Methods
* rent() - This method handles the rental of the vehicle and checks if it's already rented.
* vehicleDetails() - This method retrieves the vehicle's details such as model.
* returnVehicle() - This method handles the return of a rented vehicle.
* price() - This method calculates the total cost each day for the rented vehicles.
* (get methods for each subclass) - returns specific value for that class.

### Classes
* Rentable - an interface class that is responsible for the three methods that all vehicles need to have. 
* Vehicle - an abstract class that implements the methods from Rentable, this class got everything that the vehicles have in common, for example model.
#### Subclasses
These classes are subclasses that extends the Vehicle class, each one of these classes can create private attributes for example if you would only like the SUV to be hybrid you can create an attribute in that specific class SUV that is called hybrid. 
* Car 
* SUV 
* Truck 
* Convertible 
  
  



----

### Conditions before downloading

* JDK23 (JAVA)
* Operating system Windows, MacOS or Linux
* Gitbash
* Some kind of IDE
-----
### Download the project

1. Open Gitbash.
2. Choose the directory where you want to store the project.
3. Git clone the link: (https://github.com/Fredde01/Avancerad_JAVA24_Fredrik_Liljeblad_Uppgift1.git)
4. Open the project in the ide you prefer.
5. Now the project should run!

 
