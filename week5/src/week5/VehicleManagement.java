package week5;

/*
Question:
    A company manufactures different types of vehicles such as Cars and Bikes. Every
 */

// Defining Class Vehicle
class Vehicle{
    // Defining attributes or properties
    String brandName;
    int maxSpeed;

    // Constructor
    Vehicle(String brandName, int maxSpeed){
        this.brandName=brandName;
        this.maxSpeed=maxSpeed;
    }

    // method for displaying information
    public void displayInfo(){
        System.out.println("Brand Name: " + brandName);
        System.out.println("Max Speed: " + maxSpeed);
    }
}

// Since, brandName and maxSpeed is something that car and bike both have, so
class Car extends Vehicle{
    int noOfDoors;

    Car(String brandName, int maxSpeed, int noOfDoors){
        super(brandName, maxSpeed);
        this.noOfDoors = noOfDoors;
    }

    @Override
    public void displayInfo(){
        System.out.println("Car Info: ");
        super.displayInfo();
        System.out.println("Number of Doors: " + noOfDoors);
    }
}

class Bike extends Vehicle{
    String handleBarType;

    // constructor
    Bike(String brandName, int maxSpeed, String handleBarType){
        super(brandName, maxSpeed);
        this.handleBarType = handleBarType;
    }

    // overiding displayInfo method
    @Override
    public void displayInfo() {
        System.out.println("Bike Info: ");
        super.displayInfo();
        System.out.println("Handle Bar Type: " + handleBarType);
    }
}

public class VehicleManagement {
    public static void main(String[] args) {
        // Creating new instance of Car
        Car fordMustang = new Car("Ford", 300, 4);
        fordMustang.displayInfo();

        // Creating new instance of Bike
        Bike royalEnfield = new Bike("Royal Enfield", 180, "Titanium");
        royalEnfield.displayInfo();
    }
}
