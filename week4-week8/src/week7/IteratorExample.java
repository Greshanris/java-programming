package week7;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Rishav");
        names.add("Nishant");
        names.add("Arati");
        names.add("Prinsha");
        names.add("Jyoti");
        names.add("Preeti");
        names.add("Neha");
        names.add("Divya");
        names.add("Ansuya");
        names.add("Siru");
        names.add("Samaya");
        names.add("Roshan");
        names.add("Bibesh");
        names.add("Sushant");
        names.add("Muktinath");
        names.add("Dikshya");
        names.add("Smriti");
        names.add("Somika");
        names.add("Grishma");
        names.add("Swechcha");
        names.add("Elish");

        Iterator<String> nameArr = names.iterator();

        System.out.println("SUMMER 6 (2022) BATCH: ");
        while (nameArr.hasNext()) {
            String name = nameArr.next();
            System.out.println("name: " + name);

            // to remove the "Elish" name from batch mate
            if (name.equals("Elish")) {
                nameArr.remove();
                System.out.println("Elish is removed from batchmate");
            }
        }
        System.out.println(names);
    }
}
