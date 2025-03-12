// Write a program to print the multiplication table of a given number upto 10 using a while loop

import  java.util.Scanner;

public class JavaWhileLoopUserInput {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int multiplicationNumber = sc.nextInt();
        int i = 1;

        while (i <= 10) {
            int multiplicationValue = multiplicationNumber * i;
            System.out.println(multiplicationNumber + " * " + i + " = " + multiplicationValue);
            i++;
        }
    }
}