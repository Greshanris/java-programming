package week6;

class Addition {
    public void add (int a, int b) {
        System.out.println("Sum: " + (a+b));
    }

    // here, int did not worked out due to same name, so double is being used:
    // The main point here is that using polymorphism we are using same method to either print, return something as well.
    public double add (double a, double b) {
        return a+b;
    }

    public void add (int a, double b) {
        System.out.println("Sum: " + (a+b));
    }

    // polymorphism means: we can define same name method multiple times with some subtle changes like parameters
    // But if the same thing is done in same class, it is method overloading
    // And, if in different class, it is method overriding
    public void add (int a, int b, int c) {
        System.out.println("Sum: " + (a+b+c));
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Addition a1 = new Addition();
        a1.add(2, 3, 4);
        a1.add(5, 3);

        Fruit f = new Fruit();
        f.information();
    }
}

class Fruit {
    public void information() {
        System.out.println("Info");
    }
}

class Apple extends Fruit {

    // parents class methods is being override in the child class here
    // method overriding
    @Override
    public void information() {
        System.out.println("apple fruit");
    }
}