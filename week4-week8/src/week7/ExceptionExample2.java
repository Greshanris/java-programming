package week7;

import java.util.Scanner;

public class ExceptionExample2 {

    public static void ageValidation(int age) throws RuntimeException {
        if(age < 21) {
            throw new RuntimeException("You are not eligible to rent a car");
        } else {
            System.out.println("You are eligible to rent a car");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age");
        int age = scanner.nextInt();

        try {
            ageValidation(age);
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception:" + e.getMessage());
        }
    }
}
