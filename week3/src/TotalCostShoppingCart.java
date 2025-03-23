public class TotalCostShoppingCart {
    // How would we create a method to calculate the total cost in a shopping cart?
    /*
    Scenario:
        You are developing an e-commerce application. Write a method calculateTotal that takes an array of item prices
        and returns the total cost.
     - How would we modify the method to include a discount percentage?
     - Condition:
        total price > 1000 20% discount, totalPrice > 600 10% discount
     */


    public static double calculateTotal(double... price) {
        double sum = 0;
        for (int i = 0; i < price.length - 1; i++) {
            sum += price[i];
        }
        return sum;
    }

    // method overloading to include discount percentage
    public static double calculateTotal(boolean applyDiscount,double... price) {
        double sum = calculateTotal(price);

        if (applyDiscount) {
            if (sum > 1000) {
                sum *= 0.8;
            } else if (sum > 600) {
                sum *= 0.9;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        double add = calculateTotal(4, 5, 8, 4);
        double discountedPrice = calculateTotal(true, 7, 6, 5, 7);

        System.out.println(add + " " + discountedPrice);
    }
}
