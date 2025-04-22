package week7;
import java.util.ArrayList;

/*
 2. Stream with Custom Objects
    - Builds on Streams by applying them to a custom class (NewProduct)
    - And, calculate the total price of products.
    - Also, introduces "mapToDouble" for numerical operations.
 */
// Week 7, Day-2: Wednesday, April 16, 2025

class NewProduct {
    // Defining class attributes
    private String name;
    private double price;

    // Constructor
    NewProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // getter functions, since attributes are "private"
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class ProductQuestionAnswer {
    public static void main(String[] args) {
        // created "products" instance of ArrayList object, with NewProduct as an Class to store items
        ArrayList<NewProduct> products = new ArrayList<>();
        // Added products
        products.add(new NewProduct("Noodle", 23));
        products.add(new NewProduct("Ear Phones", 140));
        products.add(new NewProduct("Nail Cutter", 50.593));
        products.add(new NewProduct("Wardrobe", 230.55));

        /*
        "products.stream().mapToDouble(p -> p.getPrice()).sum();"
            - "stream()" : converts the "ArrayList" to a Stream
            - "mapToDouble(p -> p.getPrice())" : Transforms each "NewProduct" object into it's "price" (a "double")
                - The lambda "p -> p.getPrice()" extracts the price.
            - "sum()" : Adds all prices together.
         */
        double sum = products.stream().mapToDouble(p->p.getPrice()).sum();
        // sum will store: 23 + 140 + 50.593 + 230.55 which will be 444.14300000000003
        System.out.println("\nTotal Price: " + sum);

        /*
        Why?
            - This shows how streams handle custom objects, not just simple types like "String".
            - But even, NewProduct which was a custom Object we created.
            - mapToDouble is useful for numerical computation to convert object to double
         */

        // sum of product prices above 50
        double sumOfPricesAbove50 = products.stream().filter(p -> p.getPrice() > 50).mapToDouble(p -> p.getPrice()).sum();
        System.out.println("\nSum of product prices above 50: " + sumOfPricesAbove50);

        // printing names of products costing less than 30
        System.out.println("\nPrinting names of products costing less than 30: ");
        products.stream().filter(p -> p.getPrice() < 30).forEach(p -> System.out.println(p.getName() + " - " + p.getPrice()));
    }
}
