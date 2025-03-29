// Defining the class car
class Car {
    // Defining the attributes
    String brand;
    String model;
    double price;

    // defining methods
    public void carDetails() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Price: " + this.price + "\n");
    }
}

public class CarObjectOrientedProgramming {
    public static void main(String[] args) {
        // creating first car instance
        Car car1 = new Car();

        car1.brand = "BMW";
        car1.model = "Mercedes 2025";
        car1.price = 100000;

        // creating second car instance
        Car car2 = new Car();

        car2.brand = "Ford";
        car2.model = "Mustang 345";
        car2.price = 159900;

        // printing out the details
        car1.carDetails();
        car2.carDetails();
    }
}
