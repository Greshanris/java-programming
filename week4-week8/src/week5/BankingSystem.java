package week5;

// Abstraction

/*
You are developing a banking application where different types of accounts (SavingsAccount, CurrentAccount)
have different implementations of the interest calculations.

 */

abstract class Account{
    double balance;

    // constructor
    Account(double balance) {
        this.balance=balance;
    }

    // abstract type method
    abstract double interestCalculation();

}

class SavingAccount extends Account{
    SavingAccount(double balance) {
        super(balance);
    }

    @Override
    double interestCalculation() {
        double interest=balance*0.05;
        balance +=interest;
        return interest;
    }
}

class CurrentAccount extends Account {
    CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    double interestCalculation() {
        return 0;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        /*
        We can also do:
            Account account;
            account = new SavingAccount(5000);

        Instead of
        Account account = new SavingAccount(5000);
         */
        Account account;
        account = new SavingAccount(5000);
        double interest = account.interestCalculation();
        System.out.println("Interest: " + interest);
        System.out.println("Balance: " + account.balance);

        System.out.println(" ");

        account = new CurrentAccount(5000);
        double currentAccountInterest = account.interestCalculation();
        System.out.println("Current Account Interest: " + currentAccountInterest);
        System.out.println("Balance: " + account.balance);
    }
}
