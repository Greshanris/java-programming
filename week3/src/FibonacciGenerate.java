// Generate a fibonacci series using for loop upto user given n times
// 0 1 1 2 3 5 8 13 21 34

import java.util.Scanner;

public class FibonacciGenerate {
    public static void main(String[] args) {
        // so, fibonacci sequence is means if there is 0 1 then another sequence will be + of the two numbers so, again 1
        // generating fibonacci number
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number upto which you want to generate fibonacci series: ");
        int number = input.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3;

        if (number <= 0) {
            System.out.println("Number is negative");
        }

        System.out.println(n1);
        System.out.println(n2);

        for (int i = 2; i < number; i++) {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
