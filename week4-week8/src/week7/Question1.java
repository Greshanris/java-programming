package week7;

// Week 6: Day1: Monday: 7th April, 2025
// Linked List: Question 1
import java.util.ArrayList;

// Defining a Contact class
class Contact {
    // Defining class attributes: name, and phoneNumber
    String name;
    String phoneNumber;

    // Defining Constructor
    Contact (String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}

// Now comes part of the linkedlist
class Contacts {
    // Defined an ArrayList which stores "Contact" object
    // The reason being: we do not want to add individual element each time
    ArrayList<Contact> contactList = new ArrayList<>();

    // so, to add
    public void addContact(String name, String phoneNumber) {
        contactList.add(new Contact(name, phoneNumber)); // Here, we defined new object using "new Contact(name, phoneNumber)" while adding it in object
    }

    // defining a method to display the contact by looping through each value in contactList Object
    public void displayAll() {
        for (Contact contactData:contactList) {
            System.out.println("name: " + contactData.name);
            System.out.println("phone number: " + contactData.phoneNumber);
        }
    }

    // defining searchValue(String name) method
    public void searchValue(String name) {
        boolean isFound=false;
        // Loops through each element inside contactList object
        for (Contact contactVal:contactList) {
            String contactValName=contactVal.name;
            if(contactValName.equals(name)) {
                System.out.println("Searched value= " + contactValName);
                isFound=true;
            }
        }

        if (isFound==false) {
            System.out.println("Data not found");
        }
    }
}

public class Question1 {
    public static void main(String[] args) {
        Contacts contacts = new Contacts();
        contacts.addContact("Rishav Chaudhary", "9818811713");
        contacts.addContact("Nishant Pokhrel", "9866740810");

        contacts.displayAll();

        contacts.searchValue("Rishav Chaudhary");
    }
}
