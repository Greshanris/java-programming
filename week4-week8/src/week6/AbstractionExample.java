package week6;

// to create an abstract class, we need to use abstract keyword
abstract class MahindraCar {

    // creating constructor
    MahindraCar() {
        System.out.println("Constructor");
    }

    // we are not including the implementation details
    public abstract void engine();

    public abstract void gear();
    // it is like a concept making, a rule, but physically it does not exist. It is just a rule that should be followed.
    // a kind of outline to an essay, an essay should include topic, introduction, body, and conclusion; but it is just a rule
    // we put our own introduction in , body in, conclusion in, in different topics.

    // implementation detail is being hid out, only function detail is present in abstraction

    public void musicPlay() {
        System.out.println("play music");
    }
}

// Now, the concept should be used by every car
class Thar extends MahindraCar{
    @Override
    public void engine() {
        System.out.println("Thar Engine");
    }

    @Override
    public void gear() {
        System.out.println("Thar Gear");
    }
}

// Now, for interface
interface Book {
    // interface is abstract class
    // but here all methods are abstract

    // by default all methods are abstract, we need not to include abstract while defining each method.
    void bookInfo();
}

interface EngineeringBook{
    void engBookInfo();
    default void bookAuthor(){
        // we can add implementation detail, using "default" or "static" in special cases where we need functionality instead of default abstraction
        System.out.println("Engineering Book Author");
    }
}

// multiple inheritance in same class using implements keyword and interface
class ITBook  implements Book,EngineeringBook {
    @Override
    public void bookInfo() {
        System.out.println("IT Book");
    }

    @Override
    public void engBookInfo() {
        System.out.println("Engineering Book");
    }
}

class Bolero extends MahindraCar {
    @Override
    public void engine() {
        System.out.println("Bolero Engine");
    }

    @Override
    public void gear() {
        System.out.println("Bolero Gear");
    }

}

public class AbstractionExample {
    public static void main(String[] args) {
        // creating a Thar jeep
        Thar t1 = new Thar();
        t1.engine();
        t1.gear();
        t1.musicPlay();

        // creating a bolero jeep
        Bolero b1 = new Bolero();
        b1.engine();
        b1.gear();
        b1.musicPlay();

        // Creating object of ITBook and checking the multi level inheritance using "implements" and "interface" keywords while defining parent and child class.
        ITBook ITBook = new ITBook();
        ITBook.bookInfo();
        ITBook.engBookInfo();
    }
}
