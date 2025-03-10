# Java - Introduction

- Java is a popular programming language, created in 1995.
- It is owned by Oracle, and more than 3 billion devices run java 
- It is used for:
  - Mobile applications ( specifically Android apps )
  - Desktop applications
  - Web applications
  - Web Servers and application servers
  - Games
  - Databases Connection
  - And much, much more!

## Why Use Java?
- Java works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.)
- It is one of the most popular programming languages in the world
- It has a large demand in the current job market.
- It is easy to learn and simple to use.
- It is open-source and free.
- It is secure, fast and powerful.
- It has a huge community support (tens of millions of developers)
- Java is an Object oriented language which gives a clear structure to programs and allows code to be reused, lowering development costs.
- As Java is close to C++ and C#, it makes it easy for programmers to switch to java or vice versa.

## Getting Started
- Created account in w3 school and went to "Learn Java".
- Installed Intellij-Community Edition and installed java JRE
- Checking javac -version and found to be 23.0.2
![javac-version.png](w3school_screenshot/javac-version.png)

## Java Quickstart
- In Java, every application begins with a class name, and that **class** must **match** the **filename.**
- Here, we are creating our first java file, which will be called **Main.java**
- This file will contain "Hello World" message, which is written with the following code:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```
![hello_world_code.png](w3school_screenshot/hello_world_code.png)

- Then, we saved the file, and navigated to the directory and compiled the code:
```commandline
javac Main.java
ls
```

![after doing javac Main.java.png](w3school_screenshot/after%20doing%20javac%20Main.java.png)

- After compiling the code, there were no errors, and run the file with this command in terminal:
```commandline
java Main
```

![run-java-Main-to-run-the-output-code.png](w3school_screenshot/run-java-Main-to-run-the-output-code.png)

And, this is how we executed the first Java program.

## Java Syntax
So, in the previous sections:
- we created a Java file called "Main.java"
- we used the following code to print "Hello World" to the screen
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

### Example Explained
Every line of code that runs in Java must be inside a ``class``.
And, the class name should always start with an uppercase first letter.
In our example, we named the class **Main**.

**Note:** Java is case-sensitive: "MyClass" and "myclass" has different meaning.

The name of the java file **must match** the class name. When saving the file, saving it using the class Name, and add ".java" to the end of the filename.
To tun the example, we compiled it and ran it.

### The ``main`` Method
The ``main()`` method is required and we see it in every Java program:
```java
public static void main(String[] args){}
```

- Any code inside the ``main()`` method will be executed.
- We don't have to worry about the keywords before and after it. We will get to know them bit by bit while reading the tutorial.
- For now, every Java program has a ``class`` name which must match the filename, and that every program must contain the ``main()`` method.

### ``System.out.println()``
Inside the ``main()`` method, we can use ``println()`` method to print a line of text to the screen:
```java
public static void main(String[] args) {
    System.out.println("Hello World");
}
```

**Note:** the curly braces ``{}`` marks the beginning and the end of a block of code.

- ``System`` is a built-in Java class that contains useful members, such as ``out``, which is short for "output".
- The ``println()`` method, short for "print line", is used to print a value to the screen (or a file).
- We should not worry much about how ``System``, ``out`` and ``println()`` works. We just should know that we need them together to print the stuff to the screen.
- We should note that each code statement must end with a semicolon (;).

### Java Syntax Exercises
#### A file containing a class called MyClass should be saved as:
![q1.png](w3school_screenshot/syntax_exercise/q1.png)
![q1_correct.png](w3school_screenshot/syntax_exercise/q1_correct.png)
#### Java is case-sensitive: 'MyClass' and 'myclass' has different meaning.
![q2.png](w3school_screenshot/syntax_exercise/q2.png)
![q2_correct.png](w3school_screenshot/syntax_exercise/q2_correct.png)
#### Insert the missing part of the code below to output "Hello World".
![q3.png](w3school_screenshot/syntax_exercise/q3.png)
![q3_correct.png](w3school_screenshot/syntax_exercise/q3_correct.png)
#### In Java, each code statement must end with a semicolon (;).
![q4.png](w3school_screenshot/syntax_exercise/q4.png)
#### Exercise Completed
![exercise_completed.png](w3school_screenshot/syntax_exercise/exercise_completed.png)

## Java Comments
Comments can be used to explain Java code, and to make it more readable.
It can also be used to prevent execution when testing alternative code.

### Single-line Comments
- Single-line comments start with two forward slashes (//).
- Any text between ``//`` and the end of the line is ignored by Java (will not be executed).
```java
// This is a comment
System.out.println("Hello World");
```
- This example uses a single-line comment at the end of a line of code
```java
System.out.println("Hello World"); // This is a comment.
```

### Java Multi-line Comments
- Multi-line comments start with ``/*`` and ends with ``*/``.
- Any text between ``/*`` and ``*/`` will be ignored by Java.
```java
/* This code will print the hello world
        and but class should be declared first and then other things.
 */
System.out.println("Hello World");
```
### Java Comment Exercises
#### What is the meaning of comments in Java?
![q1.png](w3school_screenshot/comment_exercise/q1.png)
![q1_correct.png](w3school_screenshot/comment_exercise/q1_correct.png)
#### Comments in Java are written with special characters. Insert the missing parts:
![q2.png](w3school_screenshot/comment_exercise/q2.png)
![q2_correct.png](w3school_screenshot/comment_exercise/q2_correct.png)
#### When do we usually use multi-line comments?
![q3.png](w3school_screenshot/comment_exercise/q3.png)
#### Exercise Completed
![exercise_completed.png](w3school_screenshot/comment_exercise/exercise_completed.png)

# Java - Output

## Java Output/Print

### Print Text
We learned from the previous chapter that we can use the ``println()`` method to output values or print text in java;
```
System.out.println("Hello World!");
```

We can add as many ``println()`` methods as we want. Note that it will add a new line for each method:

```
System.out.println("Hello World!");
System.out.println("I am learning Java.");
System.out.println("It is awesome!");
```
![code.png](w3school_screenshot/output_print_exercise/run_code/code.png)
#### After compiling the code and running it:
![compiling_and_running.png](w3school_screenshot/output_print_exercise/run_code/compiling_and_running.png)

### Double quotes
- Text must be wrapped inside double quotations marks ``""``.
```java
System.out.println("This sentence will work!");
```
- While this will result in error:
```java
System.out.println(This sentence will produce an error);
```

### The ``Print()`` Method
- There is also a ``print()`` method, which is similar to ``println()``.
- The only difference is that it does not insert a new line at the end of the output:
```java
System.out.print("Hello World!");
System.out.print("I will print on the same line.");
```

### Java Output/Print Exercise
#### Which method is often used to print text in Java?
![q1.png](w3school_screenshot/output_print_exercise/q1.png)
![q1_correct.png](w3school_screenshot/output_print_exercise/q1_correct.png)
#### Text inside println() must be wrapped inside double quotes.
![q2.png](w3school_screenshot/output_print_exercise/q2.png)
![q2_correct.png](w3school_screenshot/output_print_exercise/q2_correct.png)
#### The difference between println() and print() is that:
![q3.png](w3school_screenshot/output_print_exercise/q3.png)
#### Exercise Completed
![exercise_completed.png](w3school_screenshot/output_print_exercise/exercise_completed.png)

## Java Output Numbers
### Print Numbers
We can also use the ``println()`` method to print the numbers.
```java
System.out.println(3);
System.out.println(38);
System.out.println(49003);
```

We can also perform mathematical calculations inside the ``println()`` method:
```java
System.out.println(5 + 3);
```

```java
System.out.println(2 * 5);
```
#### Code in Local Machine
![code.png](w3school_screenshot/java_output_exercise/code_and_run/code.png)
#### After Compiling and Running
![compiled_and_run.png](w3school_screenshot/java_output_exercise/code_and_run/compiled_and_run.png)

### Java Output Numbers Exercise
#### What is the output of the following code? ``System.out.println(3 + 3);``
![q1.png](w3school_screenshot/java_output_exercise/q1.png)
![q1_correct.png](w3school_screenshot/java_output_exercise/q1_correct.png)
#### Numbers inside println() must be wrapped inside double quotes. True or False
![q2.png](w3school_screenshot/java_output_exercise/q2.png)
![q2_correct.png](w3school_screenshot/java_output_exercise/q2_correct.png)
#### What is the output of the following code? ``System.out.println(2 * 5);``
![q3.png](w3school_screenshot/java_output_exercise/q3.png)
#### Exercise Completed
![Exercise_completed.png](w3school_screenshot/java_output_exercise/Exercise_completed.png)

## Java Variables
### Introduction
Variables are the containers that store the values which can be string, number, or booleans.
But, if we try to find out the **types** of variables, then it will be as follows:
- ``String`` which stores text which is anything inside ``""``.
- ``int`` which stores integers ( whole numbers ) which is without decimals. For instance, ``1``, ``345``.
- ``float`` which is just a decimal number ``2.4``
- ``char`` which stores single characters such as ``a`` or ``B``. Char values are surrounded by single quotes. So, earlier a will be 'a' or B will be 'B'. This is how it is stored.
- ``boolean`` which stores values with two states: ``true`` or ``false``.

### Declaring Variables
So, to create a variable, we must specify the type and assign it a value:

_Syntax_
```
type variableName = value;
```
### String type Variable
so, to create a variableName ``Name`` with value ``Rishav`` which is dataType ``String``:
```java
String name = "Rishav";
// To display the value
System.out.println(name);
```
#### Code in Local Machine
![code.png](w3school_screenshot/java_variables/code_compile_and_run/code.png)
#### Compiling and Running the Code
![compiling_and_running.png](w3school_screenshot/java_variables/code_compile_and_run/compiling_and_running.png)

### int type Variable
Here, we are creating a variable called ``rishavNum`` of type ``int`` and assigning it the value ``5``
```java
int rishavNum = 5;
System.out.println(rishavNum);
```
#### Code in Local Machine
![code2.png](w3school_screenshot/java_variables/code_compile_and_run/code2.png)
#### Compiling and Running the Code
![compiling_and_running2.png](w3school_screenshot/java_variables/code_compile_and_run/compiling_and_running2.png)

### Declaring Variable first and assigning value later
```java
int rishavNum;
rishavNum = 3;
System.out.println(rishavNum);
```
#### Code in Local Machine
![code3.png](w3school_screenshot/java_variables/code_compile_and_run/code3.png)
#### Compiling and Running the Code
![compiling_and_running3.png](w3school_screenshot/java_variables/code_compile_and_run/compiling_and_running3.png)

### Assigning new value to an existing variable overwriting the previous value
```java
// assiging 23 number
int rishavNum = 23;
rishavNum = 5; // now, rishavNum is 5
// displaying
System.out.println(rishavNum);
```
#### Code in Local Machine
![code4.png](w3school_screenshot/java_variables/code_compile_and_run/code4.png)
#### Compiling and Running the Code
![compiling_and_running4.png](w3school_screenshot/java_variables/code_compile_and_run/compiling_and_running4.png)

### Final Variables
typing ``final`` keyword before the datatype such as ``int`` or ``String`` while declaring variables will make variable unchangeable and read-only
```java
final int rishavNum = 23; // to not overwrite the value
rishavNum = 3;
System.out.println(rishavNum);
```
#### Code in Local Machine
![code5.png](w3school_screenshot/java_variables/code_compile_and_run/code5.png)
#### Compiling and Running the Code (error encounter because we can't assign new value to variable declared with ``final`)
![compiling_and_running5.png](w3school_screenshot/java_variables/code_compile_and_run/compiling_and_running5.png)

### Other types
So, upto now, we only declared variable of ``int`` and ``String`` type. Here, we will declare another types as well:
```java
// declaring integer type
int rishavNum = 23;
//  declaring float type
float rishavFloatNum = 8.65f; // using "f" to indicate a float literal
// declaring boolean type
boolean rishavBool = true;
// declaring string type
String rishavText = "Rishav";

// Then, printing all
System.out.println("rishavNum = " + rishavNum);
System.out.println("rishavFloatNum = " + rishavFloatNum);
System.out.println("rishavBool = " + rishavBool);
System.out.println("rishavText = " + rishavText);
```
#### Code in Local Machine
![code6.png](w3school_screenshot/java_variables/code_compile_and_run/code6.png)
#### Compiling and Running the Code
![compiling_and_running6.png](w3school_screenshot/java_variables/code_compile_and_run/compiling_and_running6.png)

### Java Variables Exercise
#### True or False: To create a variable in Java, you must specify the type first.
![q1.png](w3school_screenshot/java_variables/q1.png)
![q1_correct.png](w3school_screenshot/java_variables/q1_correct.png)
#### Create a variable named "carName" with value as "Volvo"
![q2.png](w3school_screenshot/java_variables/q2.png)
![q2_correct.png](w3school_screenshot/java_variables/q2_correct.png)
#### Create a variable named maxSpeed and assign the value 120 to it.
![q3.png](w3school_screenshot/java_variables/q3.png)
![Exercise_completed.png](w3school_screenshot/java_variables/Exercise_completed.png)

## Java Variables - Print Variables
### Display Variables
The ``println()`` method is used to display variables
And, if we combine both text and a variable using ``+`` character, then
```java
String name = "Rishav";
System.out.println("My name is " + name); // using + character to combine text and a variable
```
#### Code in Local Machine
![code1.png](w3school_screenshot/java_print_variable/code_compile_and_run/code1.png)
#### Compiling and Running the Code
![compile_and_run1.png](w3school_screenshot/java_print_variable/code_compile_and_run/compile_and_run1.png)

### Using ``+`` character to add a variable to another variable:
```java
String firstName = "Rishav";
String lastName = "Chaudhary";
String fullName = firstName + lastName;
System.out.println(fullName);
```
#### Code in Local Machine
![code2.png](w3school_screenshot/java_print_variable/code_compile_and_run/code2.png)
#### Compiling and Running the Code
![compile_and_run2.png](w3school_screenshot/java_print_variable/code_compile_and_run/compile_and_run2.png)

### For numeric values, the ``+`` character works as a mathematical operator:
```java
int x = 5;
int y = 3;
System.out.println(x + y); // printing the value of x + y
```
#### Code in Local Machine
![code3.png](w3school_screenshot/java_print_variable/code_compile_and_run/code3.png)
#### Compiling and Running the Code
![compile_and_run3.png](w3school_screenshot/java_print_variable/code_compile_and_run/compile_and_run3.png)

### Java Print Variables Exercise
#### Which method is often used to print variables?
![q1.png](w3school_screenshot/java_print_variable/q1.png)
![q1_correct.png](w3school_screenshot/java_print_variable/q1_correct.png)
#### Insert the missing parts to combine both text and a variable.
![q2.png](w3school_screenshot/java_print_variable/q2.png)
![q2_correct.png](w3school_screenshot/java_print_variable/q2_correct.png)
#### Display the sum of 5 + 10, using two variables: x and y.
![q3.png](w3school_screenshot/java_print_variable/q3.png)
![q3_correct.png](w3school_screenshot/java_print_variable/q3_correct.png)
#### Create a variable called z, assign x + y to it, and display the result.
![q4.png](w3school_screenshot/java_print_variable/q4.png)
#### Exercise Completed
![Exercise_finished.png](w3school_screenshot/java_print_variable/Exercise_finished.png)

## Java Declare Multiple Variables
### Declare Many variables
So, to declare more than one variable having ``Same Type``, we can use comma-separated list:
```java
/*
int x = 5;
int y = 6;
int z = 50; and below code is same
 */
int x = 3, y = 5, z = 23;
System.out.println(x + y + z);
```
#### Code in Local Machine
![code1.png](w3school_screenshot/java_declare_variable/code_compile_and_run/code1.png)
#### Compiling and Running the Code
![compile_and_run1.png](w3school_screenshot/java_declare_variable/code_compile_and_run/compile_and_run1.png)

### One Value to Multiple Variables
We can also assign the **same value** to multiple variables in one line
```java
int x, y, z;
x = y = z = 543; // Assigning the same value to multiple variables in one line
System.out.println(x + y + z);
```
#### Code in Local Machine
![code2.png](w3school_screenshot/java_declare_variable/code_compile_and_run/code2.png)
#### Compiling and Running the Code
![compile_and_run2.png](w3school_screenshot/java_declare_variable/code_compile_and_run/compile_and_run2.png)

### Java Declare Multiple Variables
#### Which of the following declares multiple variables of the same type?
![q1.png](w3school_screenshot/java_declare_variable/q1.png)
![q1_correct.png](w3school_screenshot/java_declare_variable/q1_correct.png)
#### Fill in the missing parts to create three variables of the same type, using a comma-separated list:
![q2.png](w3school_screenshot/java_declare_variable/q2.png)
![q2_correct.png](w3school_screenshot/java_declare_variable/q2_correct.png)
#### Fill in the missing parts to assign the same value to multiple variables in one line:
![q3.png](w3school_screenshot/java_declare_variable/q3.png)
#### Exercise Completed
![Exercise_Completed.png](w3school_screenshot/java_declare_variable/Exercise_Completed.png)

## Java Identifiers
### Identifiers
- All java **variables** must be **identified** with **unique names**.
- So, these unique names are actually called **identifiers**.
- Identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume).
- But, it is recommended to use descriptive names in order to create understandable and maintainable code:

```java
// Better
int minutesPerHour = 60;

// good, but can be better understandable
int m = 60;
```

The general rules for naming variables are:
- Names can contain letters(a,b,c ...), digits(3,3,4,), underscores(_), and dollar signs ($).
- Names must begin with a letter, rishav123
- Names should start with a lowercase letter, and cannot contain whitespace.
- Names can also begin with $ and _. $rishavChaudhary
- Names are case-sensitive. So, myVar and myvar are different
- Reserved words (like java keywords, such as ``int`` or ``boolean``) cannot be used as names.

### Java Identifiers Exercise
#### Which is NOT a legal variable name?
![q1.png](w3school_screenshot/java_identifiers/q1.png)
![q1_correct.png](w3school_screenshot/java_identifiers/q1_correct.png)
#### True or False: All Java variables must be identified with unique names.
![q2.png](w3school_screenshot/java_identifiers/q2.png)
![q2_correct.png](w3school_screenshot/java_identifiers/q2_correct.png)
#### Create a variable named maxSpeed and assign the value 120 to it.
![q3.png](w3school_screenshot/java_identifiers/q3.png)
#### Exercise Completed
![Exercise_completed.png](w3school_screenshot/java_identifiers/Exercise_completed.png)

### Java Variables - Examples
```java
// Student Rishav's Data
String studentName = "Rishav Chaudhary";
int studentId = 220534;
int studentAge = 23;
float studentFee = 30000.45f;
char studentGrade = 'A'; // char stores in ASCII number, so even we write 65 it still prints A.

// printing the student's data
System.out.println("Student Name: " + studentName);
System.out.println("Student ID: " + studentId);
System.out.println("Student Age: " + studentAge);
System.out.println("Student Fee: " + studentFee);
System.out.println("Student Grade: " + studentGrade);
```
#### Code in Local Machine
![code1.png](w3school_screenshot/java-variable-examples/code1.png)
#### Compiling and Running the Code
![compile_and_run1.png](w3school_screenshot/java-variable-examples/compile_and_run1.png)

### Calculating the area of rectangle
```java
int length = 6;
int width = 9;
int area; // initializing

// calculating the area of a rectangle
area = length * width;

// printing the variable
System.out.println("Length: " + length);
System.out.println("width: " + width);
System.out.println("Area of the rectangle: " + area);
```
#### Code in Local Machine
![code2.png](w3school_screenshot/java-variable-examples/code2.png)
#### Compiling and Running the Code
![compile_and_run2.png](w3school_screenshot/java-variable-examples/compile_and_run2.png)

# Java - Data Types
## Java Data Types
As explained in the previous chapter, a variable in java must be a specified data type
These are:
- integer ``int``
- float ``float`` which should use ``f`` keyword after decimal numbers indicating Floating Point Number
- char ``char`` which is a single character in '' like 'D'.
- boolean ``true`` or ``false``
- String ``String`` which is anything in "", like "Rishav".

But, Data Types are divided into Two major groups. The above are divided into these two types also including ``Arrays`` and ``Classes``.
- Primitive Data Types
  - ``byte``, ``short``, ``int``, ``long``, ``float``, ``double``, ``boolean``, and ``char``
  - so, altogether 8 types
- Non-primitive Data Types
  - ``String``, ``Arrays``, and ``Classes``.
  - So, altogether 3 types

### Primitive Data Types
A primitive Data Type specifies the type of a variable and the kind of values it can hold.
There are 8 primitive data types in Java.

| **Data Type** | **Description** |
|---------------|-----------------|
| ``byte`` | Stores whole numbers from -128 to 127 |
| ``short`` | Stores whole numbers from -32,768 to 32,767 |
| ``int`` | Stores whole numbers from -2,147,483,648 to 2,147,483,647 |
| ``long`` | Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| ``float`` | Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits |
| ``double`` | Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits |
| ``boolean`` | Stores true or false vaules |
| ``char`` | Stores a single character/letter or ASCII values |

### Java - Data Type (after primitive Data Type) Exercises
#### What is an int in Java?
![q1.png](w3school_screenshot/java-data-types/q1.png)
![q1_correct.png](w3school_screenshot/java-data-types/q1_correct.png)
#### Add the correct data type for the following variables:
![q2.png](w3school_screenshot/java-data-types/q2.png)
![q2_correct.png](w3school_screenshot/java-data-types/q2_correct.png)
#### byte, short, int, long, float, double, boolean and char are called:
![q3.png](w3school_screenshot/java-data-types/q3.png)
#### Exercise Completed
![Exercise_completed.png](w3school_screenshot/java-data-types/Exercise_completed.png)

## Java Numbers
### Numbers
Primitive number types are divided into two groups;
- ``Integer Types`` from positive to negative whole number, which include ``byte``, ``short``, ``int``, and ``long``.
- ``Floating Point Types`` representing numbers in fractional part, ``float``, and ``double``.

### Integer Types
#### Byte
It store whole numbers from -128 to 127 and used to save memory.
```java
byte myNum = 100;
System.out.println(myNum);
```

#### Short
The ``short`` data type can store whole numbers from -32768 to 32767
```java
short myNum = 5000;
System.out.println(myNum);
```

#### Int
The ``int`` data type can store whole numbers from -2147483648 to 2147483647
```java
int myNum = 100000;
System.out.println(myNum);
```

#### Long
The ``long`` data type can store whole numbers from -9223372036854775808 to 9223372036854775807
but, at the end of the value "L" keyword should be introduced.
```java
long myNum = 15000000000000L;
System.out.println(myNum);
```

### Floating Point Types
We should use a floating point type whenever we need a number with a decimal, such as 9.99 ir 3.14515
The ``float`` and ``double`` data types can store fractional numbers.
- We should put "f" for floats and "d" for doubles at the end of the value
```java
float myNum = 5.75f;
System.out.println(myNum);
```

```java
double myNum = 19.99d;
System.out.println(myNum);
```
- Float can only have six or seven decimal digits.
- Double can have a precision of about 16 digits. So, ``double`` is safer to use.

### Scientific Numbers
A floating point number can also be a scientific number with an "e" to indicate the power of 10.
```java
float f1 = 35e3f; // it means that 35 * 10 to the power 3 and f.
double d1 = 12E4d; // it means that 12 * 10 to the power 4 and d.
System.out.println(f1);
System.out.println(d1);
```
#### Code in Local Machine
![code1.png](w3school_screenshot/java_number_data_type/code_compile_and_run/code1.png)
#### Compiling and Running the Code
![compile_and_run1.png](w3school_screenshot/java_number_data_type/code_compile_and_run/compile_and_run1.png)

### Java Number Exercise
#### Integer types are used to store:
![q1.png](w3school_screenshot/java_number_data_type/q1.png)
![q1_correct.png](w3school_screenshot/java_number_data_type/q1_correct.png)
#### Which is NOT a valid integer type?
![q2.png](w3school_screenshot/java_number_data_type/q2.png)
![q2_correct.png](w3school_screenshot/java_number_data_type/q2_correct.png)
#### True or False:A float variable has greater precision than double.
![q3.png](w3school_screenshot/java_number_data_type/q3.png)
![q3_correct.png](w3school_screenshot/java_number_data_type/q3_correct.png)
#### What is the correct letter suffix to use for float values?
![q4.png](w3school_screenshot/java_number_data_type/q4.png)
#### Exercise Completed
![Exercise_completed.png](w3school_screenshot/java_number_data_type/Exercise_completed.png)

## Java Boolean Data Types
### Boolean Types
- It is ``true`` or ``false`` which corresponds to on or off and also yes or no.
```java
boolean hadEaten = false;
boolean hadLearnt = true;
System.out.println(hadEaten);
System.out.println(hadLearnt);
```
- mostly used for conditional testing.

### Boolean Exercises
#### What is the correct syntax for declaring a boolean variable in Java?
![q1.png](w3school_screenshot/java_boolean/q1.png)
![q1_correct.png](w3school_screenshot/java_boolean/q1_correct.png)
#### The boolean data type can take two values, which are:
![q2.png](w3school_screenshot/java_boolean/q2.png)
![q2_correct.png](w3school_screenshot/java_boolean/q2_correct.png)
#### What is the output of the following code? boolean isFishTasty = false; System.out.println(isFishTasty);
![q3.png](w3school_screenshot/java_boolean/q3.png)
#### Exercise Completed
![Exercise_completed.png](w3school_screenshot/java_boolean/Exercise_completed.png)

## Java Characters
### Characters
The ``char`` data type is used to store a **single** character. The character must be surrounded by single quotes, like 'A' or 'c':
```java
char myGrade = 'B';
System.out.println(myGrade);
```
Alternatively, if we are familiar with ASCII values, we can use those to display certain characters:
```java
char myVar1 = 65, myVar2 = 66, myVar3 = 67;
System.out.println(myVar1);
System.out.println(myVar2);
System.out.println(myVar3);
```
#### Code in Local Machine
![code1.png](w3school_screenshot/java_characters/code_compile_and_run/code1.png)
#### Compiling and Running the Code
![compile_and_run1.png](w3school_screenshot/java_characters/code_compile_and_run/compile_and_run1.png)

### Strings
String data type is used to store a sequence of characters (text)
```java
String greeting = "Hello Java";
System.out.println(greeting);
```
- String type is used so much and integrated in java in such a way, that it is called "the special ninth type"
- String in java is non-primitive because it refers to an object.
- String object has methods that are used to perform certain operations on strings

### Java Characters Exercises
#### Which data type is used to store a single character?
![q1.png](w3school_screenshot/java_characters/q1.png)
![q1_correct.png](w3school_screenshot/java_characters/q1_correct.png)
#### The character inside a char variable must be surrounded by:
![q2.png](w3school_screenshot/java_characters/q2.png)
![q2_correct.png](w3school_screenshot/java_characters/q2_correct.png)
#### What the output of the following code?
![q3.png](w3school_screenshot/java_characters/q3.png)
![q3_correct.png](w3school_screenshot/java_characters/q3_correct.png)
#### To store more than one character (a text), you must use:
![q4.png](w3school_screenshot/java_characters/q4.png)
![q4_correct.png](w3school_screenshot/java_characters/q4_correct.png)
#### What is the output of the following code?
![q5.png](w3school_screenshot/java_characters/q5.png)
#### Exercise Completed
![Exercise_completed.png](w3school_screenshot/java_characters/Exercise_completed.png)

## Non-primitive Data Types
- Non-primitive data types are called **reference types** because they refer to objects.
- Primitive types in Java are predefined and built into the language while non-primitive types are created by programmer except String.
- Non-primitive types can be used to call methods to perform certain operations, whereas primitive types cannot.
- Primitive types start with a lowercase letter (like int) while non-primitive types typically starts with an uppercase letter (like String).
- Primitive types always hold a value, whereas non-primitive types can be null.

## Java Type Casting
Type casting is when we assign a value of one primitive data type to another type.
In Java, there are two types of casting:
- **Widening Casting** (automatically) converting a smaller type to a larger type size
  - byte => short => char => int => long => float => double
- **Narrowing Casting** (manually) converting a larger type to a smaller size type
  - double => float => long => int => char => short => byte

### Widening Casting
Widening Casting is done automatically when passing a smaller size type to a larger size type:
```java
public class Main {
    public static void main(String[] args) {
        int myInt = 5;
        double myDouble = myInt; // it automatically cast: int to double
        
        System.out.println(myInt);
        System.out.println(myDouble);
    }
}
```
#### Code in Local Machine
![code1.png](w3school_screenshot/java_type_casting/code_compile_and_run/code1.png)
#### Compiling and Running the Code
![compile_and_run1.png](w3school_screenshot/java_type_casting/code_compile_and_run/compile_and_run1.png)

### Narrowing Casting
Narrowing casting must be done manually by placing the type in parentheses ``()`` in front of the value
```java
public class Main {
    public static void main(String[] args) {
        double myDouble = 5.3d;
        int myInt = (int) myDouble; // Manual Casting from double to int
      
        System.out.println(myDouble);
        System.out.println(myInt);
    }
}
```
#### Code in Local Machine
![code2.png](w3school_screenshot/java_type_casting/code_compile_and_run/code2.png)
#### Compiling and Running the Code
![compile_and_run2.png](w3school_screenshot/java_type_casting/code_compile_and_run/compile_and_run2.png)

### Java Type Casting Exercise
#### What is Type Casting?
![q1.png](w3school_screenshot/java_type_casting/q1.png)
![q1_correct.png](w3school_screenshot/java_type_casting/q1_correct.png)
#### Passing a smaller size type to a larger size type, is called:
![q2.png](w3school_screenshot/java_type_casting/q2.png)
![q2_correct.png](w3school_screenshot/java_type_casting/q2_correct.png)
#### True or False: Narrowing casting must be done manually
![q3.png](w3school_screenshot/java_type_casting/q3.png)
![q3_correct.png](w3school_screenshot/java_type_casting/q3_correct.png)
#### What is the output of the following code?
![q4.png](w3school_screenshot/java_type_casting/q4.png)
![q4_correct.png](w3school_screenshot/java_type_casting/q4_correct.png)
#### Convert the following double type (myDouble) to an int type:
![q5.png](w3school_screenshot/java_type_casting/q5.png)
#### Exercise Completed
![Exercise_completed.png](w3school_screenshot/java_type_casting/Exercise_completed.png)