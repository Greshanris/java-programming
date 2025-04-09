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

    /*
     Default Access modifier:
        we put "public" or "private" or "protected",
        to define from where do we have access to it(methods, class, or attributes)?

     public class: accessible by all class
     default class: only accessible in the same package

     public (attributes, methods and constructors): accessible for all classes
     private (attributes, methods and constructors): only accessible within the declared class
     default (attributes, methods, and constructors): only accessible in the same package.
     protected (attributes, methods and constructors): accessible in the same package and subclasses(inheritance).
     */
    private void printName() {
        System.out.println("Name: " + this.name);
    }
}
