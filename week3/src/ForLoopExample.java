import java.util.Scanner;

public class ForLoopExample {
    public static void main(String[] args) {
        // 5
        // finding out factorial of 5
        // factorial of 5 is 1 x 2 x 3 x 4 x 5
        int numbers = 5;
        int fact = 1;

        for (int i = 1; i<=numbers; i++) {
            fact*=i;
        }
        System.out.println(fact);

        // prime number are the number which is divisible by 1 or itself
        // take input and check whether the number is prime number or not?

        Scanner input = new Scanner(System.in);
        System.out.println("Check prime number (enter the number): ");
        int number = input.nextInt();
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        }

        for (int i=2; i<number; i++) {
            if (number%i==0) {
                isPrime=false;
            }
        }

        if (isPrime) {
            System.out.println("Given Number is prime number");
        } else {
            System.out.println("Given Number is not prime number");
        }
    }
}
