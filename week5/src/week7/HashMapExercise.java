package week7;

// Week-6, Day-3, Wednesday, HashMapExercise

import java.util.HashMap;

public class HashMapExercise {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(100, "A");
        students.put(101, "B");
        students.put(102, "A+");
        students.put(103, "B+");
        students.put(104, "C");
        students.put(99, "C+");

        System.out.println(students);
    }
}
