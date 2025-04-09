package week5;

public class MainRun {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("58393829", "Rishav Chaudhary", 5673);
        System.out.println("Account Number: " + b1.getAccountNumber());
        System.out.println("Account Holder Name: " + b1.getAccountHolderName());
        System.out.println("Initial Balance: " + b1.getBalance() + "\n");

        // Depositing
        b1.deposit(500);
        System.out.println("Bank balance: " + b1.getBalance() + "\n");

        // Withdrawing
        b1.withdraw(200);
        System.out.println("Bank balance: " + b1.getBalance());
    }
}
