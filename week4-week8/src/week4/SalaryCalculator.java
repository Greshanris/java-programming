package week4;

import java.util.Scanner;

public class SalaryCalculator {
    // defining attributes
    static double hourlySalary = 2000;
    static int standardHour = 230;

    public static double calculateSalary(int hoursWorked) {
        return hoursWorked * hourlySalary;
    }

    public static double calculateBonus (int hoursWorked) {
        int bonusHour = hoursWorked - standardHour;

        if (bonusHour < 1) {
            return 0;
        }

        return bonusHour * hourlySalary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of hours worked: ");

        int hoursWorked = scanner.nextInt();
        double totalSalary = calculateSalary(hoursWorked);
        double totalBonus = calculateBonus(hoursWorked);
        System.out.println("Total Salary: " + totalSalary);
        System.out.println("Bonus Salary: " + totalBonus);
        scanner.close();
    }
}
