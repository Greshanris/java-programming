public class TypeCasting {
    public static void main(String[] args) {
        int tax = 13;
        double penPrice = 24.70; // use of double instead of float
        double finalPrice = penPrice * tax; // automatically widening casting applies to tax which is in int.

        System.out.println("Final price: " + finalPrice);

        double newTax = 25.56;
        int foodPrice = 200;
        int newFinalPrice = foodPrice + (int) newTax; // narrowing casting
        System.out.println("New price will be " + newFinalPrice);
    }
}