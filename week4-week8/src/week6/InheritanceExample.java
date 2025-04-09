package week6;

// Understanding Inheritance Classwork

class Shape {
    // defining properties or attributes
    private int length;
    private int breadth;

    // constructor
    Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // defining method
    public void area() {
        System.out.println("Area: " + (length*breadth));
    }
}

class Rectangle extends Shape{
    // inheriting parent shape class to children Rectangle Class

    // Now defining Constructor
    Rectangle(int length, int breadth) {
        super(length, breadth); // super can help us to call Shape(int length, int breadth) parent class constructor and help us use the properties of parent class
    }

    public void displayArea() {
        area(); // Now, we can use the parent class methods inside Rectangle child class
    }

    // if we want to use area() method instead of displayArea(), which we defined earlier:
    // for instance: public void area(){} instead of public void displayArea(){}
    // but we need to use super.area() instead of the area() only. super helps to inherit the parent class properties, or methods.

    public void area(){
        super.area();
    }

}

// upto here, Shape class is being inherited by only Rectangle class: This is single-level Inheritance

public class InheritanceExample {
    public static void main(String[] args) {
        Rectangle shape1 = new Rectangle(5, 3);
        shape1.displayArea();
    }
}