package week8_assignment;

/*
Attendance Management System:
    - Classes and Methods
    - if...else logic
    - Student name, date, presentAmount
    - Attendance counting method
    - For loop usage
    - ArrayList
 */

import java.util.ArrayList;

class StudentAttendance{
    String name;
    String date;
    boolean isPresent;

    StudentAttendance(String name, String date, boolean isPresent) {
        this.name = name;
        this.date = date;
        this.isPresent = isPresent;
    }

    public void display() {
        System.out.println(name + " | " + date + " | " + (isPresent ? "Present" : "Absent"));
    }
}

public class AttendanceManagementSystem {
    // method to count how many times a student was present
    public static int countAttendance (ArrayList<StudentAttendance> records, String studentName) {
        int count = 0;
        for (StudentAttendance record : records) {
            if (record.name.equalsIgnoreCase(studentName) && record.isPresent) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<StudentAttendance> records = new ArrayList<>();

        // Adding records
        records.add(new StudentAttendance("Rishav", "2025-04-24", true));
        records.add(new StudentAttendance("Samaya", "2024-04-24", true));
        records.add(new StudentAttendance("Bibesh", "2025-04-24", false));
        records.add(new StudentAttendance("Rishav", "2025-04-25", true));
        records.add(new StudentAttendance("Samaya", "2025-04-25", false));
        records.add(new StudentAttendance("Bibesh", "2025-04-25", true));

        // Display all records
        System.out.println("Attendance Records: ");
        for (StudentAttendance record : records) {
            record.display();
        }

        // Counting Attendance
        String studentToCheck = "Samaya";
        int totalPresent = countAttendance(records, studentToCheck);
        System.out.println("\nTotal days " + studentToCheck + " was present: " + totalPresent);
    }
}