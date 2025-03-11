/* You are developing an ATM Withdrawal system. A user had a bank account with a balance of $5,000.
The user can withdraw money multiple times, but the ATM should keep asking for the withdrawal amount until
the balance becomes less than or equal to zero. If the user tries to withdraw more than available balance,
display an error message and ask again.

Question:
Write a java program that continously allows the user to withdraw money from their account using a while loop.
The program should stop if the balance reaches zero.
 */
import java.util.Scanner;

public class AtmWithdrawalSystem {
    public static void main(String[] args) {
        double balanceUsd = 5000;
        while (balanceUsd == 0);
        {
            System.out.println("Enter the amount you want to withdraw: ");
            Scanner sc = new Scanner(System.in);

            double withdrawAmount = sc.nextDouble();
            double remainingAmount = balanceUsd = withdrawAmount
           if (remainingAmount < 0)
           }

        }
        }
}