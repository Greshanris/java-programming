# Week 2 Assignment notes

## Java Operators
- Perform operations on variables and values.
- We use ``+`` operator to add together two values:
```java
int x = 100 + 50;
```
- We can add together a variable and a value, or a variable and another variable:
```java
int sum1 = 100 + 50; // 150 
int sum2 = sum1 + 250;// 150 + 250
int sum3 = sum2 + sum2; // 800
```
- Java divides the operators into the following groups:
  - Arithmetic operators
  - Assignment operators
  - Comparison operators
  - Logical operators
  - Bitwise operators

### Arithmetic Operators
Arithmetic operators are used to perform common mathematical operations.
- ``+`` : Addition 
- ``-`` : Subtraction
- ``*`` : Multiplication
- ``/``: Division
- ``%`` : Modulus which is just remainder of the division
- ``++`` : Increment by 1
- ``--`` : Decrement by 1

### Assignment Operator
- Used to assign values to variables
```java
int x = 10;
```
- Here, ``=`` is assignment operator
#### Addition assignment
- ``+=`` adds a value to a variable
```java
int x = 10;
x += 5;
```
#### List of Assignment Operator
- ``=`` 
- ``+=`` adds value to variable in left side
- ``-=`` subtracts value to variable in left side
- ``*=`` multiplies value to variable in left side
- ``/=`` divides value to variable in left side
- ``%=`` finds our remainder of variable in left side divided by value in right side.
- ``x &= 3`` equals ``x = x & 3``
- ``x |= 3`` equals ``x = x | 3``
- ``x ^=`3` equals ``x = x ^ 3``
- ``x >>= 3`` equals ``x = x >> 3``
- ``x <<= 3`` equals ``x = x << 3``

### Java Comparison Operators
- to compare two values and return either ``true`` or ``false``
```java
int x = 5;
int y = 3;
System.out.println(x > y); // returns true as 5 is greater than 3
```

#### List of Comparison Operator
- ``==`` : is equals to 
- ``!=`` : is not equals to
- ``>`` : greater than
- ``<`` : less than
- ``>=`` : greater than or equal to
- ``<=`` : less than or equal to

### Logical Operators
- We can also test for ``true`` or ``false`` values with logical operators.
- Logical operators are used to determine the logic between variables or values:
#### List of Logical operators
- ``&&`` : ``Logical and`` : returns true if both statements are true
- ``||`` : ``Logical or`` : returns true if one of the statements are true
- ``!`` : ``Logical not`` : Reverses the result, returns false if the result is true.

### Java Operators Exercise
#### Question 1
![q1.png](w3_screenshots/java_operators/q1.png)
![q1_correct.png](w3_screenshots/java_operators/q1_correct.png)
#### Question 2
![q2.png](w3_screenshots/java_operators/q2.png)
![q2_correct.png](w3_screenshots/java_operators/q2_correct.png)
#### Question 3
![q3.png](w3_screenshots/java_operators/q3.png)
![q3_correct.png](w3_screenshots/java_operators/q3_correct.png)
#### Question 4
![q4.png](w3_screenshots/java_operators/q4.png)
![q4_correct.png](w3_screenshots/java_operators/q4_correct.png)
#### Question 5
![q5.png](w3_screenshots/java_operators/q5.png)
#### Exercise Completed
![Exercise_completed.png](w3_screenshots/java_operators/Exercise_completed.png)

## Java String
### Strings
#### Java Strings
- Strings are used for storing tetxt
- A ``String`` variable contains a collection of characters surrounded by ``""``
```java
String greet = "Hello Java";
```
#### String Length
- String in java is an object
- It contains methods that can perform certain operations on strings.
- For instance, ``length`` of a string can be found with ``length()`` method.
```java
String alphabetUppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println("The length of alphabets are: " + alphabetUppercase.length());
```
#### More String Methods
- Other String method includes ``toUpperCase()` and ``toLowerCase()``
```java
String codeText = "Hello World";
System.out.println(codeText.toUpperCase());
System.out.println(codeText.toLowerCase());
```
#### Finding a Character in a String
- The ``indexOf()`` method returns **index** position of the first occurence of a specified text in a string.
```java
String txt = "This is a sample text";
System.out.println(txt.indexOf("is")); // outputs: 2 not 5
```
### Java String Exercise
#### Question 1
![q1.png](w3_screenshots/java_strings/strings/q1.png)
![q1_correct.png](w3_screenshots/java_strings/strings/q1_correct.png)
#### Question 2
![q2.png](w3_screenshots/java_strings/strings/q2.png)
![q2_correct.png](w3_screenshots/java_strings/strings/q2_correct.png)
#### Question 3
![q3.png](w3_screenshots/java_strings/strings/q3.png)
![q3_correct.png](w3_screenshots/java_strings/strings/q3_correct.png)
#### Question 4
![q4.png](w3_screenshots/java_strings/strings/q4.png)
![q4_correct.png](w3_screenshots/java_strings/strings/q4_correct.png)
#### Question 5
![q5.png](w3_screenshots/java_strings/strings/q5.png)
#### Exercise Completed
![Exercise_completed.png](w3_screenshots/java_strings/strings/Exercise_completed.png)

### Concatenation
#### String Concatenation
- ``+`` operator is used between strings to combine them. This is called **concatenation**.
```java
String firstName = "Rishav";
String lastName = "Chaudhary";
System.out.println(firstName + " " + lastName);
```
- we can also use the ``concat()`` method to concatenate two strings.
```java
String firstName = "Rishav";
String lastName = "Chaudhary";
System.out.println(firstName.concat(lastName));
```
### Java String Concatenation Exercise
#### Question 1
![q1.png](w3_screenshots/java_strings/concatenation/q1.png)
![q1_correct.png](w3_screenshots/java_strings/concatenation/q1_correct.png)
#### Question 2
![q3.png](w3_screenshots/java_strings/concatenation/q3.png)
![q3_correct.png](w3_screenshots/java_strings/concatenation/q3_correct.png)
#### Question 3
![q4.png](w3_screenshots/java_strings/concatenation/q4.png)
#### Exercises Completed
![Exercise_completed.png](w3_screenshots/java_strings/concatenation/Exercise_completed.png)

### Numbers and strings
#### Adding Numbers and Strings
``note``:  Java uses the + operator for both addition and concatenation.
- If we add two numbers, the result will be number
```java
int x = 3;
int y = 5;
int z = x + y; // z will be 8 (an integer/number)
```
- If we add two strings, the result will be a string concatenation
```java
String x = "3";
String y = "5";
String z = x + y; // z will be 35 "a String"
```
- If we add a number and a string, the result will be a string concatenation;
```java
String x = "12";
int y = 34;
String z = x + y; // z will be 1234 (a string)
```
### Java Numbers and Strings Exercise
#### Question 1
![q1.png](w3_screenshots/java_strings/java%20Numbers%20and%20strings/q1.png)
![q1_correct.png](w3_screenshots/java_strings/java%20Numbers%20and%20strings/q1_correct.png)
#### Question 2
![q2.png](w3_screenshots/java_strings/java%20Numbers%20and%20strings/q2.png)
![q2_correct.png](w3_screenshots/java_strings/java%20Numbers%20and%20strings/q2_correct.png)
#### Question 3
![q3.png](w3_screenshots/java_strings/java%20Numbers%20and%20strings/q3.png)
#### Exercise Completed
![Exercise_completed.png](w3_screenshots/java_strings/java%20Numbers%20and%20strings/Exercise_completed.png)

### Special Characters
#### Strings - Special Characters
- Because String must be written within quotes, Java will misunderstand this string, and generate an error:
```java
// this will generate an error
String text = "We are the "Nepalese" gentlemen from the Himalayas.";
```
- The solution to avoid this problem is to use the **backslash escape character**.
- The backslash(\) escape character turns special characters into string characters:

| Escape character | Result | Description |
|---|---|---|
| \' | ' | Single quote |
| \" | " | Double quote |
| \\ | \ | Backslash |

- The sequence ``\"`` inserts a double quote in a string:
```java
String txt = "We are the \"Nepalese\" gentlemen from the Himalayas.";
```
- The sequence ``\'`` inserts a single quote in a string:
```java
String txt = "It\'s alright.";
```
- The sequence ``\\`` inserts a single backslash in a string.
```java
String txt = "The character \\ is called backslash.";
```
#### Other common escape sequences that are valid in java are;
- ``\n`` : new line
- "\r" : Carriage Return
- "\t" : Tab
- "\b" : Backspace
- "\f" : Form Feed

### Java Special Characters Exercise
#### Question 1
![q1.png](w3_screenshots/java_strings/special%20characters/q1.png)
![q1_correct.png](w3_screenshots/java_strings/special%20characters/q1_correct.png)
#### Question 2
![q2.png](w3_screenshots/java_strings/special%20characters/q2.png)
![q2_correct.png](w3_screenshots/java_strings/special%20characters/q2_correct.png)
#### Question 3
![q3.png](w3_screenshots/java_strings/special%20characters/q3.png)
#### Exercise Completed
![Exercise_completed.png](w3_screenshots/java_strings/special%20characters/Exercise_completed.png)

## Java Math
- Java Math class has many methods that allows us to perform mathematical tasks on numbers.
### Math.max(x,y)
- The ``Math.max(x,y)`` method can be used to find the highest value of ``x`` and ``y``:
```java
Math.max(10, 34);
```
### Math.min(x,y)
- The ``Math.min(x,y)`` method can be used to find the lowest value of x and y:
```java
Math.min(4,8);
```
### Math.sqrt(x)
- The ``Math.sqrt(x)`` method returns the square root of x:
```java
Math.sqrt(16);
```
### Math.abs(x)
- The ``Math.abs(x)`` method returns the absolute (positive) value of x:
```java
Math.abs(-5.8);
```
### Random Numbers
- The ``Math.random()`` returns a random number between 0.0 (inclusive), and 1.0 (exclusive)
```java
Math.random();
```
- To get more control over the random number
  - For example, we only want a random number between 0 and 100, we can use
```java
int randomNum = (int)(Math.random() * 101); // 0 to 100
```

### Java Math Exercise
#### Question 1
![q1.png](w3_screenshots/java_math/q1.png)
![q1_correct.png](w3_screenshots/java_math/q1_correct.png)
#### Question 2
![q2.png](w3_screenshots/java_math/q2.png)
![q2_correct.png](w3_screenshots/java_math/q2_correct.png)
#### Question 3
![q3.png](w3_screenshots/java_math/q3.png)
![q3_correct.png](w3_screenshots/java_math/q3_correct.png)
#### Question 4
![q4.png](w3_screenshots/java_math/q4.png)
#### Exercise Completed
![Exercise_completed.png](w3_screenshots/java_math/Exercise_completed.png)

## Java Booleans
### Java Booleans
- In programming, sometime, we need a data type that can only have two values like:
  - on or off
  - true or false
  - yes or no
- So, ``boolean`` data type, is the one that can store ``true`` or ``false``.

### Boolean Values
- A boolean types is declared with the ``boolean`` keyword and can only take the values ``true`` or ``false``.
```java
boolean isJavaFun = false;
boolean isJavascriptFun = true;
System.out.println(isJavaFun); // outputs false
System.out.println(isJavascriptFun); // outputs true
```
- However, it is more common to return boolean values from boolean expressions for conditional testing
### Boolean Expression
- boolean are useful to build logic, and find answers
```java
int x = 10;
int y = 9;
System.out.println(x > y); // returns true, because 10 is higher than 9
```
- We can even do
```java
System.out.println(10 > 9);
```
- We can use ``equal to`` ``=`` operator to evaluate an expression
```java
int x = 10;
System.out.println(x == 10); // returns true
```
### Real life Example
For instance, if we want to find out if a person is old enough to vote
- if age is greater than or equal to 18, then the person could vote.
- the age is 25, build the logic and code it using boolean expressions
```java
int myAge = 25;
int votingAge = 18;
System.out.println(myAge >=  votingAge);
```
```java
int myAge = 25;
int votingAge = 18;

// now using if..else
if (myAge >= votingAge) {
    System.out.println("Old enough to vote");
} else {
    System.out.println("Not old enough to vote.");
}
```
### Boolean Exercises
#### Question 1
![q1.png](w3_screenshots/java_booleans/q1.png)
![q1_correct.png](w3_screenshots/java_booleans/q1_correct.png)
#### Question 2
![q2.png](w3_screenshots/java_booleans/q2.png)
![q2_correct.png](w3_screenshots/java_booleans/q2_correct.png)
#### Question 3
![q3.png](w3_screenshots/java_booleans/q3.png)
![q3_correct.png](w3_screenshots/java_booleans/q3_correct.png)
#### Question 4
![q4.png](w3_screenshots/java_booleans/q4.png)
#### Exercise completed
![Exercise_completed.png](w3_screenshots/java_booleans/Exercise_completed.png)

## Java If...Else
### Java Conditions and If Statements
- We can use logical conditions to perform different actions for different decisions.
- There are four keywords used ``if``, ``else``, ``else if``, ``switch``.
```java
if (condition1) {
    // this gets executed if the condition1 is true and other else if and else statements will not be used
        } else if (condition2) {
    // this gets executed if the condition1 is false and condition2 is true
        } else {
    // this conditions will executed if all the conditions is false
        }
```
- We can use ``else if`` as much as possible

### if exercises
#### Question 1
![q1.png](w3_screenshots/java_if_else/if/q1.png)
![q1_correct.png](w3_screenshots/java_if_else/if/q1_correct.png)
#### Question 2
![q2.png](w3_screenshots/java_if_else/if/q2.png)
![q2_correct.png](w3_screenshots/java_if_else/if/q2_correct.png)
#### Question 3
![q3.png](w3_screenshots/java_if_else/if/q3.png)
#### Exercise completed
![Exercise_completed.png](w3_screenshots/java_if_else/if/Exercise_completed.png)

### Java Else Exercises
#### Question 1
![q1.png](w3_screenshots/java_if_else/else/q1.png)
![q1_correct.png](w3_screenshots/java_if_else/else/q1_correct.png)
#### Question 2
![q2.png](w3_screenshots/java_if_else/else/q2.png)
![q2_correct.png](w3_screenshots/java_if_else/else/q2_correct.png)
#### Question 3
![q3.png](w3_screenshots/java_if_else/else/q3.png)
#### Exercise completed
![Exercise_completed.png](w3_screenshots/java_if_else/else/Exercise_completed.png)

### Else if Exercises
#### Question 1
![q1.png](w3_screenshots/java_if_else/else_if/q1.png)
![q1_correct.png](w3_screenshots/java_if_else/else_if/q1_correct.png)
#### Question 2
![q2.png](w3_screenshots/java_if_else/else_if/q2.png)
![q2_correct.png](w3_screenshots/java_if_else/else_if/q2_correct.png)
#### Question 3
![q3.png](w3_screenshots/java_if_else/else_if/q3.png)
#### Exercise completed
![Exercise_completed.png](w3_screenshots/java_if_else/else_if/Exercise_completed.png)

### Java Short Hand If...Else (Ternary Operator)
#### Short Hand if...else
- There is also a short-hand if else, which is known as the **ternary operator** because it consists of three operands
- It can be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements:
```
variable = (condition) ? expressionTrue : expressionFalse;
```
- So, instead of writing
```java
int time = 22;
if (time < 18) {
    System.out.println("Good day.");
} else {
    System.out.println("Good Evening");
}
```
- We can simply write like this
```java
int time = 22;
String result = (time < 18) ? "Good day." : "Good Evening.";
System.out.println(result);
```
### ternary operator Exercises
#### Question 1
![q1.png](w3_screenshots/java_if_else/short-hand-if-else/q1.png)
![q1_correct.png](w3_screenshots/java_if_else/short-hand-if-else/q1_correct.png)
#### Question 2
![q2.png](w3_screenshots/java_if_else/short-hand-if-else/q2.png)
![q2_correct.png](w3_screenshots/java_if_else/short-hand-if-else/q2_correct.png)
#### Question 3
![q3.png](w3_screenshots/java_if_else/short-hand-if-else/q3.png)
#### Exercise Completed
![Exercise completed.png](w3_screenshots/java_if_else/short-hand-if-else/Exercise%20completed.png)