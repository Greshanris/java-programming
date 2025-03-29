package week5;
/*
- Define a product class with attributes productid, name, price, and stockQuantity
- Implement a method updateStock(int quantity) to reduce stock when an item is sold.
- Create an object, perform a stock update, and print the updated details.
 */
class EcommerceProductSystem {
    // Encapsulation is privatization and controlled access to the properties, and attributes
    private int productId;
    private String name;
    private double price;
    private int stockQuantity;

    EcommerceProductSystem (int productId, String name, double price, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public void updateStock( int quantity) {
        if (quantity <= stockQuantity) {
            stockQuantity -= quantity;
            System.out.println("stockQuantity got reduced by: " + quantity + " so, stockQuantity: " + stockQuantity);
        }
    }
}
