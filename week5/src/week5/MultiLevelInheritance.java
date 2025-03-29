package week5;

// class Animals
class Animals{
    public void eat() {
        System.out.println("eat");
    }
}

// class Mammal
class Mammal extends Animals{
    public void run() {
        System.out.println("run");
    }
}

// class Dog
class Dog extends Mammal{
    public void bark() {
        System.out.println("bark");
    }
}

/*
Upto here:
- Class Animal is the parent class for the Mammal Class
- Class Mammal is the parent class for the Dog Class

So, Mammal class is inheriting methods and properties of Animal class.
And, Dog class is inheriting methods and properties of Mammal class.

Here, Dog class can now use methods and properties of Animal class.
 */

// Hierarchical Inheritance

// class A
class A{

}

// class B inheriting methods and properties of class A
class B extends A{

}

// class C inheriting methods and properties of class A as well
class C extends A{

}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat(); // eat is method of Animals Class
        d1.run(); // run is method of Mammal Class
        d1.bark(); // bark is method of Dog Class
        // but, d1 is object created from Dog class
        // It inherited all the methods from parent class, and also, parent class of the parent class of Dog class.
    }
}
