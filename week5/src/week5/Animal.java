package week5;

public class Animal {
    private String name;
    private int weight;
    private String color;

    Animal (String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    // Default Access modifier: Whether we put public or private or protected, and while writing public or private or protected on properties or functions, from where do we have access to it?
    private void printName() {
        System.out.println("Name: " + this.name);
    }
}
