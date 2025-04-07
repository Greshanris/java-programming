package week5;
/*
Encapsulation:
- getter, setter function
 */
public class BankAccount {
    // Defining properties using private due to encapsulation usage
    private String accountNumber;
    private String accountHolderName;
    private int balance;

    // Constructor
    BankAccount(String accountNumber, String accountHolderName, int balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Defining methods

    // To get the account Number
    public String getAccountNumber() {
        return accountNumber;
    }

    // To set the account Number
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // To get AccountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }

    //
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Amount: " + amount);
//            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(int amount){
        balance -= amount;
        System.out.println("Withdraw amount: " + amount);
//        System.out.println("Balance: " + balance);
    }
}
