package week7;

// HashMapB

import java.util.HashMap;
import java.util.Map;

public class TeacherHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> studentGrades = new HashMap<>();

        studentGrades.put(101, "A");
        studentGrades.put(102, "A-");
        studentGrades.put(103, "A+");
        studentGrades.put(104, "A-");
        studentGrades.put(105, "B");

        // using for each loop to display the
        for (Map.Entry<Integer, String> entry : studentGrades.entrySet()){
            System.out.println("Student ID: " + entry.getKey() + " | Grade: " + entry.getValue());
        }

        // searching students grade through their IDs
        int searchId = 104;
        if (studentGrades.containsKey(searchId)) {
            System.out.println("\nGrade for student ID " + searchId + " : " + studentGrades.get(searchId));
        } else {
            System.out.println("\nStudent ID " + searchId + " not found.");
        }
    }
}
