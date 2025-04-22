package week7;

import java.util.HashSet;
// HashSet is used for unique set of numbers

public class HashSetExample {
    public static void main(String[] args) {
        // creating numbers object using HashSet class
        HashSet<Integer> numbers = new HashSet<>();
        // inserting elements in the HashSet
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("\nAfter using .add() method: " + numbers); // Output: [20, 10, 30]

        // For removing the 30 number
        numbers.remove(30);
        System.out.println("After using .remove(30) method: "+ numbers); // Output: [20, 10]

        // Using for:each loop in  HashSet example
        System.out.println("\nLooping using for-each loop: ");
        for(int number: numbers){
            System.out.println(number);
        }

        System.out.println("\nChecking if numbers is empty? " + numbers.isEmpty());

        // to clear out all numbers
        numbers.clear();
        System.out.println("Cleared numbers: " + numbers);
    }
}
