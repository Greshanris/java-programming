package week5;


public class ProductTest {
    public static void main(String[] args) {
        EcommerceProductSystem product1 = new EcommerceProductSystem(339, "football", 456, 4);
        EcommerceProductSystem product2 = new EcommerceProductSystem(336, "basketball", 445, 9);

        product1.updateStock(3);
        product2.updateStock(3);
    }
}
