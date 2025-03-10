// WAP which ask user input in USD and convert it to NPR
import java.util.Scanner;

public class JavaOperator {
    public static void main(String[] args) {
        System.out.println("Enter the currency in USD: ");
        Scanner scan = new Scanner(System.in);

        double currency = scan.nextDouble();
        double convertedCurrency = currency * 140;
        System.out.println("The currency in rupees is NPR " + convertedCurrency);

        scan.close();
    }
}