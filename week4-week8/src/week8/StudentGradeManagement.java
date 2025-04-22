package week8;

/*
Question 1: 21 April, 2025

A university needs to manage students grades dynamically.
Create a certificate of student with subject.
Math, Science, Programming. And write to the file

Name: John Subject: Math Practical Marks:12 Theory marks:20
 */

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

class SubjectGrade {
    private String subject;
    private int practicalMarks;
    private int theoryMarks;

    SubjectGrade (String subject, int practicalMarks, int theoryMarks) {
        this.subject = subject;
        this.practicalMarks = practicalMarks;
        this.theoryMarks = theoryMarks;
    }

    public String getSubject() {
        return subject;
    }

    public int getPracticalMarks() {
        return practicalMarks;
    }

    public int getTheoryMarks() {
        return theoryMarks;
    }

    public int getTotal() {
        return practicalMarks + theoryMarks;
    }
}

class Student {
    private String name;
    private ArrayList<SubjectGrade> subjects;

    Student (String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(SubjectGrade subjectGrade) {
        subjects.add(subjectGrade);
    }

    public String getName() {
        return name;
    }

    public ArrayList<SubjectGrade> getSubjects() {
        return subjects;
    }

    public int getTotalMarks() {
        int total = 0;
        for (SubjectGrade subject : subjects) {
            total += subject.getTotal();
        }
        return total;
    }
}

public class StudentGradeManagement {
    public static void generateCertificate(Student student, String pathFileName) {
        try {
            // creating new file
            File file = new File(pathFileName);
            if (file.createNewFile()) {
                System.out.println("Created file: " + file.getName());
            } else {
                System.out.println("File already exists, it will be overwritten.");
            }

            // Writing certification content
            FileWriter writer = new FileWriter(pathFileName);

            writer.write("\n----------------------- CERTIFICATE ------------------------\n\n");
            writer.write("This certificate is presented to certify Mrs/Mr. " + student.getName().toUpperCase() + " for graduating in the following subjects:\n\n");

            for (SubjectGrade subject : student.getSubjects()) {
                writer.write(subject.getSubject() + " - Practical: " + subject.getPracticalMarks()
                        + ", Theory: " + subject.getTheoryMarks() + "\n");
            }

            writer.write("\nTotal Marks: " + student.getTotalMarks());
            writer.close();

            System.out.println("Certificate written to file: " + pathFileName);

            // Reading the file created
            File readFile = new File(pathFileName);
            Scanner scanner = new Scanner(readFile);

            while (scanner.hasNextLine()) {
                String text = scanner.nextLine();
                System.out.println(text);
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error writing certificate: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // taking user input
        Scanner input = new Scanner(System.in);
        // name
        System.out.println("Enter student's name: ");
        String name = input.nextLine();

        // Creating a student with user input
        Student student = new Student(name);

        while (true) {
            System.out.println("\nEnter subject name: ");
            String subject = input.nextLine();

            System.out.println("Enter practical marks for " + subject + ": ");
            int practical = input.nextInt();

            System.out.println("Enter theory marks for " + subject + ": ");
            int theory = input.nextInt();
            input.nextLine();

            student.addSubject(new SubjectGrade(subject, practical, theory));
            System.out.println("Do you want to add another subject? (yes/no): ");
            String choice = input.nextLine();
            if(!choice.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Enter filename with path (e.g: C:\\filename.txt) : ");
        String pathFileName = input.nextLine();

       // Generate certificate
        generateCertificate(student, pathFileName);

        input.close();
    }
}