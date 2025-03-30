# Week 5 Assignment notes
## Java Classes
### Java OOP
- OOP stands for Object-Oriented Programming
- Procedural programming is about writing procedures or methods that perform operations on the data,
- while object-oriented programming is about creating objects that contain both data and methods.

- Object-oriented programming has several advantages over procedural programming:
  - OOP is faster and easier to execute
  - OOP provides a clear structure for the programs.
  - OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
  - OOP makes it possible to create full reusable applications with less code and shorter development time.
``The "Don't Repeat Yourself" (DRY) principle is about reducing the repetition of code. We should extract out the codes that are common for the application, and place them at a single place and reuse them instead of repeating it.``
### Java- What are Classes and Objects?
- Classes and objects are the two main aspects of object-oriented programming.

| class | objects |
|-------|---------|
| Fruit | => Apple |
| Fruit | => Banana |
| Fruit | => Mango |

- So, a class is a template for objects, and an object is an instance of a class.
- When the individual objects are created, they inherit all the variables and methods from the class.

### Java OOP Exercise
#### Question 1
![q1.png](w3schools/week_5/java_oop/q1.png)
![q1_correct.png](w3schools/week_5/java_oop/q1_correct.png)
#### Question 2
![q2.png](w3schools/week_5/java_oop/q2.png)
![q2_correct.png](w3schools/week_5/java_oop/q2_correct.png)
#### Question 3
![q3.png](w3schools/week_5/java_oop/q3.png)
#### Exercise Completed
![exercise_completed.png](w3schools/week_5/java_oop/exercise_completed.png)

### Java Classes and Objects
- Java is an Object-oriented programming language
- Everything in Java is associated with classes and objects, along with its attributes and methods.
- For instance, In real life, a car is an object. The car has **attributes**, such as weight and color, and **methods**, such as drive and brake.

So, A class is like an object contructor, or a "blueprint" for creating objects.

### Creating a class
So, to create a class named "``Main``" with a variable x:
```java
public class Main {
    int x = 5;
}
```
### Creating an Object
- In Java, an object is created from a class. We have already created a class named ``Main``, so now we can use this to create objects.
- To create an object of ``Main``, specify the class name, followed by the object name, and use the keyword ``new``:
```java
public class Main {
    int x = 5; // which is the properties or attributes

  public static void main(String[] args) {
    Main myObj = new Main(); // creating an object
    System.out.println(myObj.x);
  }
}
```
### Multiple Objects
- We can create multiple objects of one class:
```java
public class Main {
    int x = 5;

  public static void main(String[] args) {
    Main myObj1 = new Main(); 
    Main myObj2 = new Main();

    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
  }
}
```

### Using Multiple Classes
- We can also create an object of a class and access it in another class.
- This is often used for better organization of classes ( one class has all the attributes and methods, while the other class holds the ``main()`` method (code to be executed)).
- Remember that the name of the java file should match the class name. In this example, we have created two files in the same directory/folder:
  - Main.java
  - Second.java

```java
// this is the Main.java file code
public class Main {
    int x = 5;
}
```
```java
// this is the Second.java file code
class Second {
  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
```
- When both files have been compiled:
```commandline
javac Main.java
javac Second.java
```
- Run the Second.java file:
```commandline
java Second
```
- or, use IDE like IntelliJ or Visual Studio code

### Java Classes and Objects Exercise
#### Question 1
![q1.png](w3schools/week_5/java_classes_objects/q1.png)
![q1_correct.png](w3schools/week_5/java_classes_objects/q1_correct.png)
#### Question 2
![q2.png](w3schools/week_5/java_classes_objects/q2.png)
![q2_correct.png](w3schools/week_5/java_classes_objects/q2_correct.png)
#### Question 3
![q3.png](w3schools/week_5/java_classes_objects/q3.png)
![q3_correct.png](w3schools/week_5/java_classes_objects/q3_correct.png)
#### Question 4
![q4.png](w3schools/week_5/java_classes_objects/q4.png)
![q4_correct.png](w3schools/week_5/java_classes_objects/q4_correct.png)
#### Question 5
![q5.png](w3schools/week_5/java_classes_objects/q5.png)
#### Exercise Completed
![exercise_completed.png](w3schools/week_5/java_classes_objects/exercise_completed.png)

### Java Class Attributes
- In the previous chapter, we used the term "variable" for ``x`` in the example (as shown below). It is actually an attribute of the class.
- Or, we could say that class attributes are variables within a class:

```java
// creating a class called Main with two attributes: x and y:
public class Main {
    int x = 5;
    int y = 3;
}
```
- Another term for class attributes is **fields**.

### Accessing Attributes
- We can access attributes by creating an object of the class, and by using the dot syntax(``.``):
- The following example will create an object of the ``Main`` class, with the name ``myObj``. We use the ``x`` attribute on the object to print it's value.

```java
public class Main {
    int x = 5;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
```
### Modifying Attributes
- We can also modify attribute values:
```java
// setting the value of x to 40
public class Main {
    int x;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 40;
    System.out.println(myObj.x);
  }
}
```
- We can also override existing values:
```java
// changing the value of x to 25
public class Main {
    int x = 10;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 25; // x is now 25
    System.out.println(myObj.x);
  }
}
```
- If we don't want the ability to override existing values, declare the attribute as ``final``:
```java
public class Main {
    final int x = 10;

  public static void main(String[] args) {
    Main myObj = new Main();
    
    myObj.x = 25; // This will generate an error: cannot assign a value to the final value
    System.out.println(myObj.x);
  }
}
```

- The ``final`` keyword is useful when we want a variable to always store the same value, like PI (3.14159).
- The ``final`` keyword is called a "modifier".

### Multiple Objects
- If we create multiple object of one class, we can change the attribute values in one object, without affecting the attributes values in the other:
```java
public class Main {
    int x = 5;

  public static void main(String[] args) {
    Main myObj1 = new Main(); // Object 1
    Main myObj2 = new Main(); // Object 2
    
    myObj2.x = 25;
    System.out.println(myObj1.x); // outputs 5
    System.out.println(myObj2.x); // outputs 25
  }
}
```
### Multiple Attributes
- We can specify as many attributes as we want:

```java
public class Main {
    String fname = "Rishav";
    String lname = "Chaudhary";
    int age = 22;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Age: " + myObj.age);
  }
}
```
- Now, the next chapter will teach us how to create class methods and how to access them with objects.

### Java Class Attributes Exercise
#### Question 1
![q1.png](w3schools/week_5/java_class_attributes/q1.png)
![q1_correct.png](w3schools/week_5/java_class_attributes/q1_correct.png)
#### Question 2
![q2.png](w3schools/week_5/java_class_attributes/q2.png)
![q2_correct.png](w3schools/week_5/java_class_attributes/q2_correct.png)
#### Question 3
![q3.png](w3schools/week_5/java_class_attributes/q3.png)
![q3_correc.png](w3schools/week_5/java_class_attributes/q3_correc.png)
#### Question 4
![q4.png](w3schools/week_5/java_class_attributes/q4.png)
#### Exercise Completed
![exercise_completed.png](w3schools/week_5/java_class_attributes/exercise_completed.png)