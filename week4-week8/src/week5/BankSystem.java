package week5;

// week 5 : Day 3: Wednesday

abstract class Accounts {
    double balance;

    Accounts(double balance) {
        this.balance = balance;
    }

    abstract double interestCalculation();
}
class savingAccount extends Accounts {
    savingAccount(double balance) {
        super(balance);
    }
    @Override
    double interestCalculation() {
        double interest = balance * 0.05;
        balance += interest;
        return interest;
    }
}
class currentAccount extends Accounts {
    currentAccount(double balance) {
        super(balance);
    }
    @Override
    double interestCalculation() {
        return 0;
    }
}
public class BankSystem {
    public static void main(String[] args) {
        Accounts account;
        account= new savingAccount(1000);
        double interest = account.interestCalculation();
        System.out.println("interest: " + interest);
        System.out.println("balance: " + account.balance);

        account = new currentAccount(1000);
        double currentAccountInterest = account.interestCalculation();
        System.out.println("Current Account interest: " + currentAccountInterest);
        System.out.println("Current Account balance: " + account.balance);
    }
}