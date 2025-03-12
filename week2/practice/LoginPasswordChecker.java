/* Write a Java program that asks the user to enter a password. If they enter the correct password
print "Access Granted" and exit the loop. Otherwise, allow up to 3 attempts before displaying
"Account locked"
 */
import java.util.Scanner;

public class LoginPasswordChecker {
    public static void main(String[] args) {
        int maxAttempt = 3;
        String actualPassword = "Rishav";
        boolean entry = false;

        while (maxAttempt > 0 && entry == false) {
            System.out.println("Maximum Attempt: " + maxAttempt);
            System.out.println("Enter the password: ");
            Scanner sc = new Scanner(System.in);

            String enteredPassword = sc.nextLine();

            if (actualPassword.equals(enteredPassword)) {
                entry = true;
                System.out.println("Access Granted");
            } else if (maxAttempt > 0){
                System.out.println("Access Denied");
                maxAttempt--;
            }
        }

        if (maxAttempt == 0 && entry == false) {
            System.out.println("Account locked");
        }
    }
}