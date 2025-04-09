package week7;

// Week 5 : Day-4 : Thursday : 07:10 AM

/*
Collections: collection of objects
JCF: collections of classes and interfaces
Collection > list > ArrayList, LinkedList, Vector,

 */

import java.util.ArrayList;
import java.util.List;

public class JavaArrayListExample {
    public static void main(String[] args) {
        // Old method of defining ArrayList
        ArrayList<Integer> numbers = new ArrayList<>(); // Default Size: 10

        // New way of defining ArrayList
        List<Boolean> list = new ArrayList<>();
        List<String> names = new ArrayList<>();
        names.add("Rishav");
        names.add("Bibesh");
        System.out.println(names); // outputs: [Rishav, Bibesh]

        // Inserting Elements inside ArrayList:  object_defined.add(item);
        numbers.add(1); // index: 0
        numbers.add(2); // index: 1
        numbers.add(3); // index: 2

        System.out.println(numbers); // Outputs: [1, 2, 3]

        // Dynamic resizing
        for(int i = 4; i <= 20; i++){
            numbers.add(i);
        }

        System.out.println(numbers); // outputs: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]

        // For Retrieving data from ArrayList:  object_defined.get(index);
        System.out.println(numbers.get(2)); // outputs: 3
        System.out.println(numbers.get(4)); // outputs: 5

        // To replace the value in ArrayList: object_defined.set(index, value);
        numbers.set(0, 5); // outputs: [5, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
        System.out.println(numbers);
        numbers.set(1, 5); // outputs: [5, 5, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
        System.out.println(numbers);

        // To remove or delete the value in ArrayList: Object_defined.remove(index);
        numbers.remove(0); // outputs: [5, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
        System.out.println(numbers);

        // To know the length of the ArrayList: object_defined.size();
        for(int i = 0; i < numbers.size(); i++){
            System.out.println("Value using for loop: " + numbers.get(i));
        }

        for(Integer num:numbers) {
            System.out.println("Value using For each: " + num);
        }

        // To insert the value in between certain indexes, we can do it using : .add(index, element); instead of .set(index, value)
        numbers.add(1, 120);
        System.out.println(numbers);
    }
}
