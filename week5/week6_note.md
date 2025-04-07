# Week 6 Assignment Note
## Java Data Structures
### Java ArrayList
- The ``ArrayList`` class is a resizable array, which can be found in the ``java.util`` package
- The difference between a built-in array and an ``ArrayList`` in Java is that size of an array cannot be modified 
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

**Note:**
- Array indexes start with 0: [0] is the first element. [1] is the second element, etc.

### Access an Item
To access an element in the ``ArrayList``, use the ``get()`` method and refer to the index number:
```java
cars.get(0); // accesses the 0th indexed element
```

### Change an Item
To modify an element, use the ``set()`` method and refer to the index number:
```java
cars.set(0, "Rishav");
```

### Remove an Item
To remove an element, use the ``remove()`` method and refer to the index number:
```java
cars.remove(0);
```
- Now, if we want to remove all the elements in the ``ArrayList``, we use the ``clear()`` method:
```java
cars.clear();
```

### ArrayList Size
To find out how many elements an ArrayList have, use the ``size`` method:
```java
cars.size();
```

### Loop through an ArrayList
Loop through the elements of an ``ArrayList`` with a ``for`` loop, and use the ``size()`` method to specify how many times the loop should run:

```java
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    
    // using the for loop
    for (int i = 0; i < cars.size(); i++) {
      System.out.println(cars.get(i));
    }
  }
}
```
- We can also loop through an ``ArrayList`` with the **for-each** loop:

```java
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    
    for (String i : cars) {
      System.out.println(i);
    }
  }
}
```

### Other Types
- Elements in an ArrayList are actually **objects**.
- In the examples above, we created elements (objects) of type "String".
- Remember that a String in Java is an object (not a primitive type).
- To use other types, such as int, we must specify an equivalent **wrapper class:** ``Integer``.
- For other primitive types, use: ``Boolean`` for boolean, ``Character`` for char, ``Double`` for double, etc:

```java
// Create an ArrayList to store numbers (add elements of type Integer):
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(10);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(25);
    
    for (int i : myNumbers) {
      System.out.println(i);
    }
  }
}
```
### Sort an ArrayList
Another useful class in the ``java.util`` package is the ``Collections`` class, which include the ``sort()`` method for sorting lists alphabetically or numerically:

```java
// sort an ArrayList of Strings

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections; // Import the collections class that has sort() method

public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    Collections.sort(cars); // sort class
    for (String i : cars) {
      System.out.println(i);
    }
  }
}
```
- Another Example of sorting an ``ArrayList``  of ``Integers``.
```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(33);
    myNumbers.add(5);
    myNumbers.add(23);
    myNumbers.add(14);
    myNumbers.add(4);
    myNumbers.add(3);
    myNumbers.add(10);
    
    Collections.sort(myNumbers); // Sort myNumbers
    
    for (int i : myNumbers) {
      System.out.println(i);
    }
  }
}
```

### Java ArrayList Exercise
#### Question 1
![q1.png](w3schools/week_6/java_arraylist/q1.png)
![q1_correct.png](w3schools/week_6/java_arraylist/q1_correct.png)
#### Question 2
![q2.png](w3schools/week_6/java_arraylist/q2.png)
![q2_correct.png](w3schools/week_6/java_arraylist/q2_correct.png)
#### Question 3
![q3.png](w3schools/week_6/java_arraylist/q3.png)
![q3_correct.png](w3schools/week_6/java_arraylist/q3_correct.png)
#### Question 4
![q4.png](w3schools/week_6/java_arraylist/q4.png)
![q4_correct.png](w3schools/week_6/java_arraylist/q4_correct.png)
#### Question 5
![q5.png](w3schools/week_6/java_arraylist/q5.png)
![q5_correct.png](w3schools/week_6/java_arraylist/q5_correct.png)
#### Question 6
![q6.png](w3schools/week_6/java_arraylist/q6.png)
#### Exercise Completed
![exercise_completed.png](w3schools/week_6/java_arraylist/exercise_completed.png)

### Java LinkedList
- In the previous chapter, we learned about the ``ArrayList`` class. 
- The ``LinkedList`` class is almost identical to the ``ArrayList``:

```java
// Import the LinkedList class
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  }
}
```

### ArrayList vs. LinkedList
- The ``LinkedList`` class is a collection which can contain many objects of the same type, just like the ``ArrayList``.
- The ``LinkedList`` class has all of the same methods as the ``ArrayList`` class because they both implement the ``List`` interface. This means that we can add items, change items, remove items, and clear the list in the same way.
- However, while the ``ArrayList`` class and the ``LinkedList`` class can be used in the same way, they are build very differently.

#### How the ArrayList Works?
- The ``ArrayList`` class has a regular array inside it. 
- When an element is added, it is placed into the array.
- If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.

#### How the LinkedList works?
- The ``LinkedList`` stores its items in "containers."
- The list has a link to the first container and each container has a link to the next container in the list.
- To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.

**When To Use**
- Use an ``ArrayList`` for storing and accessing data.
- Use an ``LinkedList`` to manipulate data.

### LinkedList Methods
- For many cases, the ``ArrayList`` is more efficient as it is common to need access to random items in the list,
- but the ``LinkedList`` provides several methods to do certain operations more efficiently:

#### Method - Description
- ``addFirst()`` :  Adds an item to the beginning of the list
- ``addLast()`` : Add an item to the end of the list
- ``removeFirst()`` : Remove an item from the beginning of the list
- ``removeLast()`` : Remove an item from the end of the list
- ``getFirst()`` : Get the item at the beginning of the list
- ``getLast()`` : Get the item at the end of the list

### Java LinkedList Exercises
#### Question 1
![q1.png](w3schools/week_6/java_linkedlist/q1.png)
![q1_correct.png](w3schools/week_6/java_linkedlist/q1_correct.png)
#### Question 2
![q2.png](w3schools/week_6/java_linkedlist/q2.png)
![q2_correct.png](w3schools/week_6/java_linkedlist/q2_correct.png)
#### Question 3
![q3.png](w3schools/week_6/java_linkedlist/q3.png)
![q3_correct.png](w3schools/week_6/java_linkedlist/q3_correct.png)
#### Question 4
![q4.png](w3schools/week_6/java_linkedlist/q4.png)
#### Exercise Completed
![exercise_completed.png](w3schools/week_6/java_linkedlist/exercise_completed.png)

### Java List Sorting
**Java Sort a List**
- In the previous chapters, we learned how to use two popular lists in java:
  - ``ArrayList`` and ``LinkedList``, which are found in the ``java.util`` package
- Another useful class in the ``java.util`` package is the ``Collections`` class, which include the ``sort()`` method for sorting lists alphabetically or numerically.

### Sort an ArrayList
- Sort an ArrayList of Strings alphabetically in ascending order:
```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    
    Collections.sort(cars);
    
    for (String i : cars) {
      System.out.println(i);
    }
  }
}
```
- Sort an ArrayList of Integers numerically in ascending order:
```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(33);
    myNumbers.add(5);
    myNumbers.add(23);
    myNumbers.add(14);
    myNumbers.add(3);
    myNumbers.add(4);
    
    Collections.sort(myNumbers); // Sort myNumbers
    
    for (int i : myNumbers) {
      System.out.println(i);
    }
    
  }
}
```
### Reverse the Order
- We can also sort a list in reverse order, by using the ``reverseOrder()`` method.
- So, in the example below, we will sort the ArrayList of Strings alphabetically in reverse/descending order:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    
    Collections.sort(cars, Collections.reverseOrder()); // sort cars in reverseOrder or descending order
    
    for (String i : cars) {
      System.out.println(i);
    }
  }
}
```
- Sort an ArrayList of Integers numerically in reverse/descending order:
```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(33);
    myNumbers.add(5);
    myNumbers.add(14);
    myNumbers.add(23);
    myNumbers.add(3);
    myNumbers.add(4);
    
    Collections.sort(myNumbers, Collections.reverseOrder()); // Sort myNumbers
    
    for (int i : myNumbers) {
      System.out.println(i);
    }
  }
}
```

### Java List Sorting Exercise
#### Question 1
![q1.png](w3schools/week_6/java_sort_a_list/q1.png)
![q1_correct.png](w3schools/week_6/java_sort_a_list/q1_correct.png)
#### Question 2
![q2.png](w3schools/week_6/java_sort_a_list/q2.png)
![q2_correct.png](w3schools/week_6/java_sort_a_list/q2_correct.png)
#### Question 3
![q3.png](w3schools/week_6/java_sort_a_list/q3.png)
#### Exercise Completed
![exercise_completed.png](w3schools/week_6/java_sort_a_list/exercise_completed.png)

### Java HashMap
