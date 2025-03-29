/*
4. Book Inventory System
    - Create a Book class with title, author, price, and ISBN.
    - Instantiate two books and display their details.
 */

// Defining Book Class
class Book {
    String title;
    String author;
    double price;
    long ISBN;

    // Using Constructor
    Book(String title, String author, double price, long ISBN) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.ISBN = ISBN;
    }

    // details
    public void bookDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
        System.out.println("ISBN: " + this.ISBN + "\n");
    }
}

public class BookstoreInventorySystem {
    public static void main(String[] args) {
        // Defining First instance of the Object
        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", "JK Rowlin", 3456, 1338878921613L);
        // printing book1 details
        book1.bookDetails();

        // Defining Second instance of the Object
        Book book2 = new Book("The Atomic Habits", "James Clear", 4039, 13388789215163L);
        // printing book2 details
        book2.bookDetails();
    }
}
