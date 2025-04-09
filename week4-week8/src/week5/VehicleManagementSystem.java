package week5;
/*
Abstraction:
RENTAL CALCULATION
 */

abstract class Vehicles{
    String model;
    String manufacturer;
    int days;

    // constructor
    Vehicles(String model, String manufacturer, int days) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.days = days;
    }

    abstract void rentCalculation();
}

class Cars extends Vehicles{
    Cars(String model, String manufacturer, int days) {
        super(model, manufacturer, days);
    }

    @Override
    void rentCalculation() {
        double rent = days*500;
        System.out.println("Car Rent for " + days + " days = " + rent);
    }
}

class Bikes extends Vehicles{
    Bikes(String model, String manufacturer, int days) {
        super(model, manufacturer, days);
    }

    @Override
    void rentCalculation() {
        double rent = days*100;
        System.out.println("Bike Rent for " + days + " days = " + rent);
    }
}

class Trucks extends Vehicles{
    Trucks(String model, String manufacturer, int days) {
        super(model, manufacturer, days);
    }

    @Override
    void rentCalculation() {
        double rent = days*1000;
        System.out.println("Truck Rent for " + days + " days = " + rent);
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        // creating an objects
        Vehicles vehicle;
        vehicle = new Cars("Mustang", "Ford", 45);
        System.out.println("Model: " + vehicle.model + " , manufacturer: " + vehicle.manufacturer + " , days: " + vehicle.days);
        vehicle.rentCalculation();

        vehicle = new Bikes("FZ-s", "Yamaha", 45);
        vehicle.rentCalculation();

        vehicle = new Trucks("mercedez-benz", "mercedez", 45);
        vehicle.rentCalculation();
    }
}
