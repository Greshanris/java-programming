package week7;

/*
Question:

You are developing a grocery shopping app where users can add items to their shopping list.
Implement a java program that allows the user to :
    - Add items to the list.
    - Remove an item from the list.
    - Display all items in the list.
 */

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

enum Action {
    ADD, REMOVE, DISPLAY, EXIT, INVALID;

    // method to convert the action "ADD, REMOVE, DISPLAY, EXIT, INVALID" input string to uppercase, trim it, and compare it to relative constants, and return that constants.
    public static Action fromString(String input) {
        try {
            return Action.valueOf(input.toUpperCase().trim());
        } catch (IllegalArgumentException e) {
            return INVALID;
        }
    }
}

class GroceryManager {
    private List<String> shoppingList; // here, we usually put "List<String> shoppingList = new ArrayList<>();"

    GroceryManager() {
        this.shoppingList = new ArrayList<>(); // but, i put "new ArrayList<>();" here, instead of shoppingList, as we did previously
    }

    public void addItem(String item) {
        shoppingList.add(item);
        System.out.println(item + " added to the list.");
    }

    public void removeItem(String item) {
        if (shoppingList.remove(item)) {
            System.out.println(item + " removed from the list.");
        } else {
            System.out.println(item + " not found in the list.");
        }
    }

    public void displayList() {
        if (shoppingList.isEmpty()) {
            System.out.println("The shopping list is empty.");
        } else {
            System.out.println("Shopping List: " + shoppingList);
        }
    }
}

public class GroceryList {
    public static void main(String[] args) {
        // creating scanner object
       Scanner scanner = new Scanner(System.in);
       GroceryManager manager = new GroceryManager();

       while (true) {
           System.out.println("\nChoose an action: add, remove, display, exit");
           // pass the user feed to input variable as string
           String input = scanner.nextLine();
           // pass input reference variable to fromString method we created, and store enumerator constant in action object we created.
           Action action = Action.fromString(input);

           switch (action) {
               case ADD :
                   System.out.println("Enter the item to add: ");
                   String addItem = scanner.nextLine();
                   manager.addItem(addItem);
                   break;

               case REMOVE :
                   System.out.println("Enter the item to remove: ");
                   String removeItem = scanner.nextLine();
                   manager.removeItem(removeItem);
                   break;

               case DISPLAY :
                   manager.displayList();
                   break;

               case EXIT :
                   manager.displayList();
                   System.out.println("Exiting the program...");
                   scanner.close();
                   return;

               case INVALID :
               default:
                   System.out.println("Invalid option. Try again.");
           }
       }
    }
}
