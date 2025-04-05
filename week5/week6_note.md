# Week 6 Assignment Note
## Java Data Structures
### Java ArrayList
- The ``ArrayList`` class is a resizable array, which can be found in the ``java.util`` package
- The difference between a built-in array and an ``ArrayList`` in Java:
  - is that size of an array cannot be modified 
    - For instance, if we want to add or remove elements to/from an array, we have to create a new one.
  - While elements can be added and removed from an ``ArrayList`` whenever we want.

```java
// Creating an ArrayList object called cars that will store strings:
import java.util.ArrayList; // import the ArrayList class

ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
```

### Add Items
The ``ArrayList`` class has many useful methods. For example, to add elements to the list, use the add() method:
```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
    }
}
```
- We can also add an item at a specified position by referring to the index number:
```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        
        cars.add(0, "Mazda"); // Insert element at the beginning of the list (0)

        System.out.println(cars);
    }
}
```

**Remember:**
- Array indexes start with 0: [0] is the first element. [1] is the second element, etc.

