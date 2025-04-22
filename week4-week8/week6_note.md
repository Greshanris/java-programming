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
- In the ``ArrayList`` chapter, we learned that Arrays store items as an ordered collection.
- If we have to access them, we use an index number (``int`` type).
- But, A ``HashMap`` store items in "key/value" pairs, and we can access them by an index of another type (e.g. a ``String``).

One Object is used as a key (index) to another object (value). 
- It can store different types: ``String`` keys and ``Integer`` values
- or, the same type, like: ``String`` keys and ``String`` values.

```java
// Here, we will create a HashMap object called capitalCities and will store "String" keys and "String" values:
import java.util.HashMap; 

HashMap<String, String> capitalCities = new HashMap<String, String>();
```

### Add items in HashMap
The ``HashMap`` class has many useful methods. For example, to add items to it, we use: ``put()`` method:
```java
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    // creating a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    
    // Add keys and values (Country, City)
    capitalCities.put("Nepal", "Kathmandu");
    capitalCities.put("India", "New Delhi");
    capitalCities.put("Bhutan", "Thimpu");
    capitalCities.put("Bangladesh", "Dhaka");
    capitalCities.put("Pakistan", "Islamabad");
    capitalCities.put("Sri Lanka", "Colombo");

    System.out.println(capitalCities);
  }
}
```

### Access an Item in HashMap
To access a value in the ``HashMap``, use the ``get()`` method and refer to its key:
```java
capitalCities.get("Nepal");
```

### Remove an Item in HashMap
To remove an item, use the ``remove()`` and refer to the key:
```java
capitalCities.remove("Pakistan");
```
- and, to remove all items, we use the ``clear()`` method:
```java
capitalCities.clear();
```

### HashMap Size
To find out how many items there are, we use the ``size()`` method:
```java
capitalCities.size();
```

### Loop Through a HashMap
- We can loop through the items of a ``HashMap`` with **for-each** loop.
- **Note:** Use the ``keySet()`` method, if we only want the keys, and use the ``values()`` method if we only want the values:
```java
// To print the keys
for (String i : capitalCities.keySet()) {
    System.out.println(i);
}

// and to print the values
for (String i : capitalCities.values()) {
    System.out.println(i);
}
```
- And, if we want to print both keys and values
```java
// Print keys and values
for (String i : capitalCities.keySet()) {
    System.out.println("key: " + i + " values: " + capitalCities.get(i));
}
```

### Other Types
- Keys and values in a HashMap are actually Objects.
- In the examples above, we used objects of type "String".
- And, Remember that a "String" in a Java is an Object (not a primitive type).
- To use other types, such as ``int``, we must specify a equivalent wrapper class such as ``Integer``.
- For other primitive types:
  - ``Boolean`` for boolean
  - ``Character`` for char
  - ``Double`` for double, etc.

```java
// Creating a HashMap object called people that will store String keys and Integer values:
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    // creating a HashMap object called People
    HashMap<String, Integer> people = new HashMap<String, Integer>();
    
    // Adding keys and values (Name, Age)
    people.put("Rishav", 22);
    people.put("Eliana", 22);
    people.put("Angelina", 24);
    
    for (String i : people.keySet()) {
      System.out.println("key: " + i + " value: " + people.get(i));
    }
  }
}
```

### Java HashMap Exercises
#### Question 1
![q1.png](w3schools/week_6/java_hashmap/q1.png)
![q1_correct.png](w3schools/week_6/java_hashmap/q1_correct.png)
#### Question 2
![q2.png](w3schools/week_6/java_hashmap/q2.png)
![q2_correct.png](w3schools/week_6/java_hashmap/q2_correct.png)
#### Question 3
![q3.png](w3schools/week_6/java_hashmap/q3.png)
![q3_correct.png](w3schools/week_6/java_hashmap/q3_correct.png)
#### Question 4
![q4.png](w3schools/week_6/java_hashmap/q4.png)
#### Exercise Completed
![exercise_completed.png](w3schools/week_6/java_hashmap/exercise_completed.png)

### Java HashSet
- A HashSet is a collection of items where every item is unique,
- And, it is found in the ``java.util`` package
```java
// Create a HashSet object called cars that will store strings
import java.util.HashSet; 

HashSet<String> cars = new HashSet<String>();
```

### Add Items for HashSet
- The ``HashSet`` class has many useful methods.
- For example, to add items to it, we use the ``add()`` method.

```java
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");

    System.out.println(cars);
  }
}
```

**Note:**
- In the example above, even though BMW is added twice, it only appears once in the set.
- Because, every item in a set has to be unique.

### Check if an Item exists for HashSet
To check whether an item exists in a HashSet, we use the ``contains()`` method:
```java
cars.contains("Mazda");
```

### Remove an Item for HashSet
To remove an item, we use the ``remove()`` method:
```java
cars.remove("Volvo");
```
- And, to remove all items, we use the ``clear()`` method:
```java
cars.clear();
```

### HashSet Size
To find out how many items there are, we use the ``size()`` method:
```java
cars.size();
```

### Loop Through a HashSet
Loop through the items of an ``HashSet`` with a **for-each** loop:
```java
for (String i : cars) {
    System.out.println(i);    
}
```

### Other Types in HashSet
- Like in others like ``HashMap``, ``LinkedList`` and ``ArrayList``
- Elements are stored as Objects which is not a primitive type.
- ``String`` is a primitive type, ``int`` is not.
- ``Integer``, ``Boolean``, ``Character`` and ``Double`` is used instead of ``int``, ``boolean``, ``char``, and ``double``.

```java
// use a HashSet that stores Integer objects
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    // Create a HashSet object called numbers
    HashSet<Integer> numbers = new HashSet<Integer>();
    
    // Add the values to the set
    numbers.add(5);
    numbers.add(14);
    numbers.add(23);
    numbers.add(3);
    numbers.add(4);
    
    // Show which numbers between 1 and 10 in the set
    for (int i = 1; i <= 10; 1++) {
        if (numbers.contains(i)) {
          System.out.println(i + " was found in teh set.");
        } else {
          System.out.println(i + " was not found in the set.");
        }
    }
  }
}
```

### Java HashSet Exercise
#### Question 1
![q1.png](w3schools/week_6/java_hashset/q1.png)
![q1_correct.png](w3schools/week_6/java_hashset/q1_correct.png)
#### Question 2
![q2.png](w3schools/week_6/java_hashset/q2.png)
![q2_correct.png](w3schools/week_6/java_hashset/q2_correct.png)
#### Question 3
![q3.png](w3schools/week_6/java_hashset/q3.png)
![q3_correct.png](w3schools/week_6/java_hashset/q3_correct.png)
#### Question 4
![q4.png](w3schools/week_6/java_hashset/q4.png)
#### Exercise Completed
![exercise_completed.png](w3schools/week_6/java_hashset/exercise_completed.png)

### Java Iterator
- An ``Iterator`` is an object that can be used to loop through collections. 
- It is like ``ArrayList`` and ``HashSet``.
- It is called "iterator" because "iterating" is the technical term for looping.

So, to use an iterator, we must import it from the ``java.util`` package

### Getting an Iterator
- The ``iterator`` method can be used to get an ``Iterator`` for any collection:

```java
// Import the ArrayList class and the Iterator class
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Make a collections
        ArrayList<String> cars = new ArrayList<String>();
        
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("Mazda");
        
        // Get the iterator
        Iterator<String> it = cars.iterator();
        
        // print the first item
        System.out.println(it.next()); // Volvo
        System.out.println(it.next()); // BMW
        System.out.println(it.next()); // Ford
    }
}
```

### Looping through a Collection
To loop through a collection, we use the ``hasNext()`` and ``next()`` methods of the ``Iterator``:
```java
while(it.hasNext()) {
    System.out.println(it.next());
}
/*
        Output:
Volvo
BMW
Ford
Mazda
 */
```

### Removing Items from a Collection
- Iterators are designed to easily change the collections that they loop through.
- The ``remove()`` method can remove items from a collection while looping.

```java
// Use an iterator to remove numbers less than 10 from a collection:

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(3);
        numbers.add(5);
        numbers.add(14);
        numbers.add(23);
        numbers.add(4);
        
        // creating iterator object for numbers collection
        Iterator<Integer> it = numbers.iterator();
        
        // while it.hasNext(), if the value is true then:
        // Store the value of it.next() in Integer i object,
        // and if the i value which we get is less than 10, then remove it.
        while (it.hasNext()) {
            Integer i = it.next();
            if ( i < 10) {
                it.remove();
            }
        }
        System.out.println(numbers); // [14, 23]
    }
}
```

**Note:**
- If we try to remove items using a **for loop** or a **for-each loop**, it would not work in collections.
- It is because collection is changing size at the same time that the code is trying to loop.

### Java Iterator Exercises
#### Question 1
![q1.png](w3schools/week_6/java_iterator/q1.png)
![q1_correct.png](w3schools/week_6/java_iterator/q1_correct.png)
#### Question 2
![q2.png](w3schools/week_6/java_iterator/q2.png)
![q2_correct.png](w3schools/week_6/java_iterator/q2_correct.png)
#### Question 3
![q3.png](w3schools/week_6/java_iterator/q3.png)
![q3_correct.png](w3schools/week_6/java_iterator/q3_correct.png)
#### Question 4
![q4.png](w3schools/week_6/java_iterator/q4.png)
#### Exercise Completed
![exercise_completed.png](w3schools/week_6/java_iterator/exercise_completed.png)

### Java Wrapper Classes
Wrapper classes provide a way to use primitive data types (``int``, ``boolean``, etc..) as objects.

**Primitive Data Type - Wrapper Class**
- ``byte`` : ``byte``
- ``short`` : ``Short``
- ``int`` : ``Integer``
- ``long`` : ``Long``
- ``float`` : ``Float``
- ``double`` : ``Double``
- ``boolean`` : ``Boolean``
- ``char`` : ``Character``


Sometimes, we must use wrapper classes:
- For example, when working with Collection objects, such as ``ArrayList``
- because, primitive types cannot be used (the list can only store objects):

```java
// Example

import java.util.ArrayList;

ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid

ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // valid
```

### Creating Wrapper Objects
- To create a wrapper object, we use the wrapper class instead of primitive types
- To get the value, we can just print the object:

```java
public class Main {
  public static void main(String[] args) {
    Integer myInt = 5;
    Double myDouble = 5.55;
    Character myChar = 'A';
    System.out.println(myInt);
    System.out.println(myDouble);
    System.out.println(myChar);
  }
}
```
- Since, we are now working with objects, we can use certain methods to get information about the specific object.
  - For example, the following methods are used to get the value associated with the corresponding wrapper object:
    - ``intValue()``
    - ``byteValue()``
    - ``shortValue()``
    - ``longValue()``
    - ``floatValue()``
    - ``doubleValue()``
    - ``charValue()``
    - ``booleanValue()``

```java
// This example will output the same result as the example above:
public class Main {
  public static void main(String[] args) {
    Integer myInt = 5;
    Double myDouble = 5.55;
    Character myChar = 'E';
    System.out.println(myInt.intValue());
    System.out.println(myDouble.doubleValue());
    System.out.println(myChar.charValue());
  }
}

/*
        Output:
5
5.55
E
 */
```

- There is another useful method which is ``toString()`` method.
- ``toString()`` method is used to convert **wrapper objects to Strings.**
- Here, in the example, we will convert an ``Integer`` to a ``String``, and use the ``length()`` method of the ``String`` class to output the length of the "String":

```java
public class Main {
  public static void main(String[] args) {
    Integer myInt = 100;
    String myString = myInt.toString();
    System.out.println(myString.length());
  }
}
// Output: 3
```

### Java Wrapper Exercise
#### Question 1
![q1.png](w3schools/week_6/java_wrapper/q1.png)
![q1_correct.png](w3schools/week_6/java_wrapper/q1_correct.png)
#### Question 2
![q2.png](w3schools/week_6/java_wrapper/q2.png)
![q2_correct.png](w3schools/week_6/java_wrapper/q2_correct.png)
#### Question 3
![q3.png](w3schools/week_6/java_wrapper/q3.png)
![q3_correct.png](w3schools/week_6/java_wrapper/q3_correct.png)
#### Question 4
![q4.png](w3schools/week_6/java_wrapper/q4.png)
#### Exercise Completed
![exercise_completed.png](w3schools/week_6/java_wrapper/exercise_completed.png)

## Java Advanced
### Java Exceptions
- When executing Java code, different errors can occur:
  - coding errors made by the programmer
  - errors due to wrong input
  - or, other unforeseeable things
- When an error occurs, Java will normally stop and generate an error message.
- The technical term for this is: Java will throw an **exception** (throw an error).

### Java try and catch
- The ``try`` statement allows us to define a block of code to be tested for errors while it is being executed.
- The ``catch`` statement allows us to define a block of code to be executed, if an error occurs in the try block.
- The ``try`` and ``catch`` keywords come in pairs:
```java
try {
    // Block of code to try
}
catch (Exception e) {
    // Block of code to handle errors
}
```
- Let's consider the following example:
```java
// This will generate an error, because myNumbers[10] does not exist.
public class Main {
  public static void main(String[] args) {
    int[] myNumbers = {1, 2, 4};
    System.out.println(myNumbers[10]); // errors because there is no value that exists in 10th index
  }
}
```
- Output to the above code will be like:
```commandline
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
        at Main.main(Main.java:4)
```
- **Note:** ``ArrayIndexOutOfBoundsException`` occurs when we try to access an index number that does not exist.
- So, if an error occurs, we can use ``try...catch`` to catch the error and execute some code to handle it:
```java
public class Main {
  public static void main(String[] args) {
    try {
        int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    }
  }
}
```
### Finally
- The ``finally`` statment lets us execute code, after ``try...catch``, regardless of the result:
```java
public class Main{
  public static void main(String[] args) {
    try {
        int[] myNumbers = {3, 5, 14, 21};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    } finally {
      System.out.println("The \"try catch\" is finished");
    }
  }
}
/*
Output:

Something went wrong.
The "try catch" is finished 
 */
```

### The throw keyword
- The ``throw`` statement allows us to create a custom error.
- The ``throw`` statement is used together with an **exception type**. 
- There are many exception types available in Java:
  - ``ArithmeticException``
  - ``FileNotFoundException``
  - ``ArrayIndexOutOfBoundsException``
  - ``SecurityException``, etc.

```java
// Throw an exception if age is below 18 (print "Access denied"). If age is 18 or older, print "Access Granted":
public class Main {
    static void checkAge (int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
          System.out.println("Access granted - You are old enough!");
        }
    }

  public static void main(String[] args) {
    checkAge(14); // setting age to 14 (which is below 18...)
  }
}
/*
Output:

Exception in thread "main" java.lang.ArithmeticException: Access denied - You must be at least 18 years old.
	at Main.checkAge(Main.java:5)
	at Main.main(Main.java:13)        
 */
```
- If **age** was 20, we would **not** get an exception
```java
checkAge(23);

/*
Output:

Access granted - You are old enough!        
 */
```

### Java Exceptions Exercise
#### Question 1
![q1.png](w3schools/week_6/java_advanced_maybe_week7/java_exceptions/q1.png)
![q1_correct.png](w3schools/week_6/java_advanced_maybe_week7/java_exceptions/q1_correct.png)
#### Question 2
![q2.png](w3schools/week_6/java_advanced_maybe_week7/java_exceptions/q2.png)
![q2_correct.png](w3schools/week_6/java_advanced_maybe_week7/java_exceptions/q2_correct.png)
#### Question 3
![q3.png](w3schools/week_6/java_advanced_maybe_week7/java_exceptions/q3.png)
![q3_correct.png](w3schools/week_6/java_advanced_maybe_week7/java_exceptions/q3_correct.png)
#### Question 4
![q4.png](w3schools/week_6/java_advanced_maybe_week7/java_exceptions/q4.png)
#### Exercise Completed
![exercise_completed.png](w3schools/week_6/java_advanced_maybe_week7/java_exceptions/exercise_completed.png)

