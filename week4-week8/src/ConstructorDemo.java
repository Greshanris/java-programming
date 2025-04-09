//

class Pen {
    // Constructor defines the Object's properties
    // Creating an instance of an object: Constructor
    String color;
    String type;

    /*
    1. Constructor name and class name should be same
    2. Even if we do not define constructor, the code will still run because java internally makes an constructor
    3. We can use parameter in constructor (custom defined)
    4. There is another type of constructor called copy constructor.
     */

    Pen(String color, String type){
        System.out.println("Constructor Called: ");
        this.color = color;
        this.type = type;
    }

    Pen(Pen pen) {
        this.color = pen.color;
        this.type = pen.type;
    }

    public void penInfo() {
        System.out.println("color: " + this.color);
        System.out.println("type: " + this.type);
    }
 }

public class ConstructorDemo {
    public static void main(String[] args) {
        Pen p1 = new Pen("green", "gel");
//        Pen p1 = new Pen(); // this is 1st way of defining a new object
//        p1.color = "blue";
//        p1.type = "ball";

        p1.penInfo();
    }
}