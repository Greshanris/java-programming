package week5;

/*
Abstraction
 */

abstract class Payment{
    abstract void paymentProcess(double amount);
}

class CreditCard extends Payment{
    @Override
    void paymentProcess(double amount) {
        System.out.println("Paid Amount (Credit Card): " + amount);
    }
}

class PayPal extends Payment{
    @Override
    void paymentProcess(double amount) {
        System.out.println("Paid Amount (Paypal): " + amount);
    }
}

class UPI extends Payment{
    @Override
    void paymentProcess(double amount) {
        System.out.println("Paid Amount (UPI): " + amount);
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        // creating an object
        Payment payment;

        // Credit Card
        payment = new CreditCard();
        payment.paymentProcess(4000);

        // PayPal
        payment = new PayPal();
        payment.paymentProcess(5000);

        // UPI
        payment = new UPI();
        payment.paymentProcess(3000);
    }
}
