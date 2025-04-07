package week7;

// Week 6: Day1: Monday: 7th April, 2025
// Linked List

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        // q1: What kind of data do LinkedList store?
        LinkedList<Integer> list = new LinkedList<>();



        list.add(1);
        list.add(3);
        list.add(5);
        System.out.println("\n" + "After using .add() method: " + list);

        // The difference arises when we can add or remove or get elements in either first or last using:
        list.addFirst(23);
        list.addLast(4);
        System.out.println("\n" + "After using .addFirst() and addLast() method: " + list);

        list.removeLast(); // no index required
        list.remove(0); // index required
        System.out.println("\n" + "After using .removeLast() and .remove(0) method: " + list);

        // to get the element
        System.out.println("\n" + "Using .get(1) method: " + list.get(1));

        // using one list to add in another list:
        List<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        list.addAll(numbers);
        System.out.println("\n" + "Using list.addAll(numbers) to add one list in another list: " + list);
    }
}
