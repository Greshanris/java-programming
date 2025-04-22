package week7;

// 1. Introduction to Java Streams
// Week 7, Day-2: Wednesday, April 16, 2025

import java.util.ArrayList;

public class StreamApiExample {
    public static void main(String[] args) {
        // Creating an fruits object of an ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        // Adding Fruits out there
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Pear");
        fruits.add("Peach");
        // Now, comes Stream:
        /*
        Java Streams: Introduced in Java 8, allows us to process collections(like ArrayList)
                        - in a functional style using Lambda Expressions
                        - Think of it as a pipeline where we filter, transform, or iterate over data

        "fruits.stream(): converts the ArrayList into a Stream
                        - This lets us process elements using lambda expressions"
         */

        System.out.println("\nUsing .stream().forEach(): ");
        fruits.stream().forEach(f-> System.out.println(f));
        /*
        First Operation: "fruits.stream().forEach(f -> System.out.println(f))"
            - iterates over all fruits and prints each one
            - The lambda "f -> System.out.println(f)" is like a loop that says, "For each fruit f, print it."
         */

        System.out.println("\nUsing .stream().filter(f -> f.startWith(\"P\")).forEach() : ");
        fruits.stream().filter(f->f.startsWith("P")).forEach(f-> System.out.println(f));

        /*
        Second Operation: "fruits.stream().filter(f -> f.startsWith("P")).forEach(f -> System.out.println(f))"
            - It does two things:
                - "filter(f -> f.startsWith("P"))" : Keeps only fruits whose names start with "P" (uses a lambda to check each fruit).
                - "forEach(f -> System.out.println(f))" : Prints the filtered fruits.
         */

        // filter "fruits that ends with "e""
        System.out.println("\nUsing .stream().filter(f -> f.endsWith(\"e\")).forEach() : ");
        fruits.stream().filter(f -> f.endsWith("e")).forEach(f -> System.out.println(f));

        // filter "fruits whose length is greater than 5"
        System.out.println("\nUsing .stream().filter(f -> f.length() > 5).forEach() : ");
        fruits.stream().filter(f -> f.length() > 5).forEach(f -> System.out.println(f));
    }
}
