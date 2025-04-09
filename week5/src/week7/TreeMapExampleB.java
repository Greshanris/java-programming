package week7;

/*
TreeMap:
---------

 - Keys are sorted in natural order or by a comparator
 - The underlying Data structure is "Red-Black Tree (a type of balanced binary tree)
 - When keys needs to be sorted, we use TreeMap instead of HashMap
 - It does not allow null keys (throws NullPointerException), but do allows null values
 - Performance wise, it gives 0(log n) for get() and put() method
 - It is not synchronized for Thread Safety
 */

import java.util.TreeMap;

public class TreeMapExampleB {
    public static void main(String[] args) {
        TreeMap<String, Integer> names = new TreeMap<>();

        names.put("Rishav", 23);
        names.put("Bibesh", 23);
        names.put("Eliana", 23);

        for (String key : names.keySet()){
            System.out.println("Name: " + key + ", Age: " + names.get(key));
        }
    }
}
