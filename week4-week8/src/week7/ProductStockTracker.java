package week7;

/*
HashMapB:
--------

- No guaranteed order
- Underlying Data Structure is Hash Table
- it allows one null key and multiple values
- performance wise, it's time-space complexity is 0(1) for get() and put()
- And, it is best for quick lookups
- It is not synchronized and if, we do need sunchronized for thread safety, then we can use "ConcurrentHashMap"
 */
import java.util.HashMap;
import java.util.Map;

public class ProductStockTracker {
    public static void main(String[] args) {
        // creating productStock collections object to store value in key and value pair
        HashMap<String, Integer> productStock = new HashMap<>();

        // Add products and their stock counts
        productStock.put("Willow", 23);
        productStock.put("Nintendo", 14);
        productStock.put("English Book", 3);
        productStock.put("Welding Machine", 5);

        // Display the stock for all products
        System.out.println("Current Stock: ");
        for (Map.Entry<String, Integer> entry : productStock.entrySet()) {
            System.out.println("Product: " + entry.getKey() + " | Quantity: " + entry.getValue());
        }

        // Update stock for a product
        String productToUpdate = "Welding Machine";
        int newStock = 4;
        productStock.put(productToUpdate, newStock); // it overwrites old value

        System.out.println("\nUpdated Stock for " + productToUpdate + ": " + productStock.get(productToUpdate));

        // Check if a product exists
        String searchProduct = "English Book";
        if (productStock.containsKey(searchProduct)) {
            System.out.println("\n" + searchProduct + " are in stock: " + productStock.get(searchProduct));
        } else {
            System.out.println("\n" + searchProduct + " are not available.");
        }
    }
}
