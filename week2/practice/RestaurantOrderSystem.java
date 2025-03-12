/*
A restaurant has an ordering system where customers can keep ordering food
items until they type 'exit'. Each time they order, the system asks for the item price
and adds it to the total bill. When they type "exit", the system should display the total bill amount.
 */

/*
Write a java program using a while loop that continuously asks the user for item prices until they type
"exit", then prints the total bill.
 */
import java.util.Scanner;


public class RestaurantOrderSystem {
    public static void main(String[] args) {
        double amount = 0;
        boolean exitBool = false;

        while (!exitBool) {
            System.out.println("Enter the item price(Rs) (or type \"exit\" to finish): ");
            Scanner sc = new Scanner(System.in);

            String input = sc.nextLine();


            if (input.equalsIgnoreCase("exit")) {
                exitBool = true;
                System.out.println("Total price: " + amount);
            } else {
                amount += Double.parseDouble(input);
            }
        }
    }
}