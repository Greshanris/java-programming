package week7;

// Week-6, Day-3, Wednesday, HashMapExampleR

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>(); // 16 buckets
        map.put(101, "Rishav Chaudhary");
        map.put(102, "Bibesh Pokhrel");
        map.put(103, "Nishant Pokhrel");
        map.put(104, "Sushant Regmi");
        System.out.println("\nAfter adding the key:value pairs using put(key, value) method: ");
        System.out.println(map);
        // To get value of a particular key
        System.out.println("\nGetting value for map.get(101): ");
        System.out.println(map.get(101));

        // If we want to remove
        map.remove(103);
        System.out.println("\nAfter removing key 103 using map.remove(103)\n" + map);

        // Using for(int key: map.keySet()){} to iterate
        System.out.println("\nUsing for(int key: map.keySet()){System.out.println(map.get(key));} to iterate: ");
        for (int key: map.keySet()) {
            System.out.println(map.get(key));
        }

        // Using for(String value: map.values()){System.out.println("Value: " + value);} to iterate
        System.out.println("\nUsing for(String value: map.values()){System.out.println(\"Value: \" + value);} to iterate: ");
        for (String value: map.values()) {
            System.out.println("Value: " + value);
        }

        // using for(Map.Entry<Integer, String, String> entry: map.entrySet()){}
        System.out.println("\nNow, we used for (Map.Entry<Integer, String> entry: map.entrySet()){}, here: ");
        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println("entry: " + entry);
            System.out.println("entry.getkey(): " + entry.getKey());
            System.out.println("entry.getValue(): " + entry.getValue() + "\n");

        }
    }
}
