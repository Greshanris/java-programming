package week7;

/*
Question 2: Sort a list of products by price using lambda
- You have a List<Product> where each product has a name and price.
- Print total price.
 */

import java.util.ArrayList;

class Product {
    private String productName;
    private double price;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

public class SortProductList {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 56044));
        products.add(new Product("Charger", 57044));
        products.add(new Product("Jacket", 4044));
        products.add(new Product("Bag", 2044));

        // Sorting using lambda
        // Double.compare(price1, price2)
        // products.sort(takes in function, so here goes lambda function)
        products.sort((product1, product2) -> {
            return Double.compare(product1.getPrice(), product2.getPrice());
        });

        System.out.println("\nSorted product list (by price): ");
        System.out.println("----------------------------------");
        // using for each loop
        products.forEach(product -> {
            System.out.println(product.getProductName() + " : " + product.getPrice());
        });

        // Now, calculating total price
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        System.out.println("------------------------------");
        System.out.println("Total Price: " + totalPrice);
    }
}
