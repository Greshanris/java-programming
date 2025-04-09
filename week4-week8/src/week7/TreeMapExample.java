package week7;

// Week-6, Day-3, Wednesday, TreeMapExample

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(100, "red");
        treeMap.put(101, "green");
        treeMap.put(102, "blue");
        treeMap.put(103, "purple");
        treeMap.put(99, "brown");
        System.out.println(treeMap);

        System.out.println(treeMap.containsKey(99));
        System.out.println(treeMap.containsValue("blue"));

    }
}
