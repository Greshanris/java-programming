# Week 3 Assignment Notes

## Java Switch
### Java Switch Statements
- Instead of writing many ``if..else`` statements, we can use the ``switch`` statement.
- The ``switch`` statement selects one of many code blocks to be executed:

```java
switch(expression) {
    case x:
        // code block
        break;
    case y:
        // code block
        break;
    default:
        // code block
}
```
### How java switch works:
- The ``switch`` expression is evaluated once.
- The value of the expression is compared with the values of each ``case``.
- If there is a match, the associated block of code is executed.
- The ``break`` and ``default`` keywords are optional.

For example,

```java
int day = 5;
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}
// output will be "Friday"
```
### Why do break keyword is used?
- when Java reaches a ``break`` keyword, it breaks out of the switch block.
- This stops the execution of more code, and case testing inside the block.
- When a match is found, and the job is done, it's time for a break. There is no need for more testing.

### The default Keyword
- The ``default`` keyword specifies some code to run if there is no case match:
```java
int day = 3;
switch (day) {
        case 6:
            System.out.println("Today is Saturday");
            break;
        case 7:
            System.out.println("Today is Sunday");
            break;
        default:
            System.out.println("Looking forward to the Weekend");
}
// Outputs "Looking forward to the weekend"
```

### Java Switch Exercise
#### Question 1
![q1.png](w3school/java_switch/q1.png)
![q1_correct.png](w3school/java_switch/q1_correct.png)
#### Question 2
![q2.png](w3school/java_switch/q2.png)
![q2_correct.png](w3school/java_switch/q2_correct.png)
#### Question 3
![q3.png](w3school/java_switch/q3.png)
#### Exercise Completed
![exercise_completed.png](w3school/java_switch/exercise_completed.png)

## Java While Loops
### Loops
- Loops can execute a block of code as long as a specified condition is reached.
- Loops are handy because they save time, reduce errors, and they make code more readable
### While Loop
- The ``while`` loop loops through a block of code as long as a specified condition is ``true``:
```java
while(condition) {
    // code block to be executed
        }
```
#### Example
```java
// below code in the loop will run, over and over again as long as variable i is less than 5
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
        }
```
### While loop Exercises
#### Question 1
![q1.png](w3school/java_while_loop/while_loop/q1.png)
![q1_correct.png](w3school/java_while_loop/while_loop/q1_correct.png)
#### Question 2
![q2.png](w3school/java_while_loop/while_loop/q2.png)
![q2_correct.png](w3school/java_while_loop/while_loop/q2_correct.png)
#### Question 3
![q3.png](w3school/java_while_loop/while_loop/q3.png)
#### Exercise Completed
![Exercise_completed.png](w3school/java_while_loop/while_loop/Exercise_completed.png)

## Java Do/While Loop
### The Do/While Loop
- The ``do/while`` loop is variant of the ``while`` loop.
- The loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.

```java
do {
    //code block to be executed
}
while (condition);
```
#### Example
```java
// here the loop will be executed at least once and then it will loop until the condition is false
int i = 0;
do {
    System.out.println(i);
    i++;
}
while (i < 5);
```
### Do/While Exercises
#### Question 1
![q1.png](w3school/java_while_loop/do_while_loop/q1.png)
![q1_correct.png](w3school/java_while_loop/do_while_loop/q1_correct.png)
#### Question 2
![q2.png](w3school/java_while_loop/do_while_loop/q2.png)
![q2_correct.png](w3school/java_while_loop/do_while_loop/q2_correct.png)
#### Question 3
![q3.png](w3school/java_while_loop/do_while_loop/q3.png)
#### Exercise Completed
![exercise_completed.png](w3school/java_while_loop/do_while_loop/exercise_completed.png)

## Java For Loop
### Java For Loop
- When we know exactly how many times we want to loop through a block of code, we use the ``for`` loop instead of a ``while`` loop.
```java
for (statement 1; statement 2; statement 3) {
    // code block to be executed
        }
```
here,
- **Statement 1** is executed (one time) before the execution of the code block.
- **Statement 2** defines the condition for executing the code block.
- **Statement 3** is executed (every time) after the code block has been executed.

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```
### Java For Loop Exercise
#### Question 1
![q1.png](w3school/java_for_loop/for_loop/q1.png)
![q1_correct.png](w3school/java_for_loop/for_loop/q1_correct.png)
#### Question 2
![q2.png](w3school/java_for_loop/for_loop/q2.png)
![q2_correct.png](w3school/java_for_loop/for_loop/q2_correct.png)
#### Question 3
![q3.png](w3school/java_for_loop/for_loop/q3.png)
![q3_correct.png](w3school/java_for_loop/for_loop/q3_correct.png)
#### Question 4
![q4.png](w3school/java_for_loop/for_loop/q4.png)
#### Exercise Completed
![exercise_completed.png](w3school/java_for_loop/for_loop/exercise_completed.png)

## Java Nested Loops
### Nested Loops
- It is also possible to place a loop inside another loop. This is called a **nested loop**.
- The "inner loop" will be executed one time for each iteration of the "outer loop":
#### Example
```java
// outer loop
for (int i = 1; i <= 2; i++) {
    System.out.println("Outer: " + i); // Executes 2 times
    
    // inner loop
    for (int j = 1; j <= 3; j++) {
        System.out.println("Inner: " + j); // Executes 6 times (2 * 3)
    }
}
```
### Java Nested Loop Exercise
#### Question 1
![q1.png](w3school/java_for_loop/nested_loop/q1.png)
![q1_correct.png](w3school/java_for_loop/nested_loop/q1_correct.png)
#### Question 2
![q2.png](w3school/java_for_loop/nested_loop/q2.png)
![q2_correct.png](w3school/java_for_loop/nested_loop/q2_correct.png)
#### Question 3
![q3.png](w3school/java_for_loop/nested_loop/q3.png)
#### Exercise Completed
![exercise_completed.png](w3school/java_for_loop/nested_loop/exercise_completed.png)

## Java For Each Loop
### For-Each Loop
- There is also a "**for-each**" loop, which is used exclusively to loop through elements in an **array** (or other data sets):
```java
for (type variableName : arrayName) {
    // code block to be executed
}
```
#### Example which outputs all elements in the **cars** array, using a "**for-each**" loop:
```java
String[] cars = {"mercedez", "Lambhorghini", "Bugatti Chiron", "Ford Mustang", "Aventador", "Porsche", "Rolls Royce"};
for (String i : cars) {
    System.out.println(i);
}
```
### For-Each Loop Exercises
#### Question 1
![q1.png](w3school/java_for_loop/for-each_loop/q1.png)
![q1_correct.png](w3school/java_for_loop/for-each_loop/q1_correct.png)
#### Question 2
![q2.png](w3school/java_for_loop/for-each_loop/q2.png)
![q2_correct.png](w3school/java_for_loop/for-each_loop/q2_correct.png)
#### Question 3
![q3.png](w3school/java_for_loop/for-each_loop/q3.png)
#### Exercise Completed
![exercise_completed.png](w3school/java_for_loop/for-each_loop/exercise_completed.png)

## Java Break/Continue
### Java Break
- We have seen the ``break`` statement used in an earlier chapter of the tutorial.
- It is used to "jump out" of a ``switch`` statement.
- The ``break`` statement can also be used to jump out of a loop.

```java
for (int i = 0; i < 10; i++) {
    if (i == 4) {
        break;
    }
    System.out.println(i);
}
```

### Java Continue
- The ``continue`` statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
```java
for (int i = 0; i < 10; i++) {
    if (i == 4) {
        continue;
    }
    System.out.println(i);
}
```
### Break and Continue in While loop
#### Break Example
```java
int i = 0;
while (i < 10) {
    System.out.println(i);
    i++;
    if (i == 4) {
        break;
    }
}
```
#### Continue Example
```java
int i = 0;
while (i < 10) {
    if (i == 4) {
        i++;
        continue;
    }
    System.out.println(i);
}
```
### Java Break and Continue Example
#### Question 1
![q1.png](w3school/java_break_continue/q1.png)
![q1_correct.png](w3school/java_break_continue/q1_correct.png)
#### Question 2
![q2.png](w3school/java_break_continue/q2.png)
![q2_correct.png](w3school/java_break_continue/q2_correct.png)
#### Question 3
![q3.png](w3school/java_break_continue/q3.png)
![q3_correct.png](w3school/java_break_continue/q3_correct.png)
#### Question 4
![q4.png](w3school/java_break_continue/q4.png)
#### Exercise Completed
![exercise_completed.png](w3school/java_break_continue/exercise_completed.png)

## Java Arrays
### Java Arrays
- Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
```java
String[] cars = {"Rolls Royce","Bugatti Chiron", "Ford Mustang", "Lambhorghini", "Ferrari Aventador"};
int[] myNum = {10, 20, 30, 40};

// to access the elements of an array
System.out.println(cars[0]);
System.out.println(myNum[2]);

// to change an array element
cars[2] = "Mustang";
System.out.println(cars[2]);

// to know the Array length
System.out.println(cars.length);
```

### Java Array Exercise
#### Question 1
![q1.png](w3school/java_arrays/arrays/q1.png)
![q1_correct.png](w3school/java_arrays/arrays/q1_correct.png)
#### Question 2
![q2.png](w3school/java_arrays/arrays/q2.png)
![q2_correct.png](w3school/java_arrays/arrays/q2_correct.png)
#### Question 3
![q3.png](w3school/java_arrays/arrays/q3.png)
![q3_correct.png](w3school/java_arrays/arrays/q3_correct.png)
#### Question 4
![q4.png](w3school/java_arrays/arrays/q4.png)
![q4_correct.png](w3school/java_arrays/arrays/q4_correct.png)
#### Question 5
![q5.png](w3school/java_arrays/arrays/q5.png)
#### Exercise Completed
![exercise_completed.png](w3school/java_arrays/arrays/exercise_completed.png)

## Java Loop Through an Array
- We can loop throught the array elements with the ``for``loop, and we can use the ``length`` property to specify how many times the loop should run.
```java
String[] cars = {"Bugatti", "Lambhorghini", "Ferrari", "BMW", "Ford Mustang"};
for (int i = 0; i < cars.length; i++) {
    System.out.println(cars[i]);
}

// we can even loop through an array with For-Each
//for (type variable : arrayname) {
//        ...
//}
for (String i : cars) {
    System.out.println(i);
}
```
### Java Array and Loops
#### Question 1
![q1.png](w3school/java_arrays/java_loop_through_an_array/q1.png)
![q1_correct.png](w3school/java_arrays/java_loop_through_an_array/q1_correct.png)
#### Question 2
![q2.png](w3school/java_arrays/java_loop_through_an_array/q2.png)
![q2_correct.png](w3school/java_arrays/java_loop_through_an_array/q2_correct.png)
#### Question 3
![q3.png](w3school/java_arrays/java_loop_through_an_array/q3.png)
#### Exercise Completed
![exercise_completed.png](w3school/java_arrays/java_loop_through_an_array/exercise_completed.png)

## Java Multi-Dimensional Arrays
### Multidimensional Arrays
- A multidimensional array is an array of arrays
- They are useful when we want to store data as a tabular form, like a table with rows and columns.
```java
// to create a two-dimensional array, we add each array within its own set of curly braces
int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
```
- **myNumbers** is now an array with two arrays as its elements

### Access Elements and Change Element Values
```java
// to access the elements in the array, we have to specify two indexes
int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
System.out.println(myNumbers[1][2]);

// to change the value of an element
int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
myNumbers[1][2] = 9;
System.out.println(myNumbers[1][2]);
```
### Loop through a multi-dimensional Array
- We can use a ``for loop`` inside another ``for loop`` to get the elements of a two-dimensional array
```java
int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
for (int i = 0; i < myNumbers.length; ++i) {
    for (int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
    }
}
```
- We could just a **for-each** loop, which is considered easier to read and write
```java
int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
for (int[] row : myNumbers) {
    for (int i : row) {
        System.out.println(i);
    }
}
```
### Multi-Dimensional Array
#### Question 1
![q1.png](w3school/java_arrays/multi-dimensional_array/q1.png)
![q1_correct.png](w3school/java_arrays/multi-dimensional_array/q1_correct.png)
#### Question 2
![q2.png](w3school/java_arrays/multi-dimensional_array/q2.png)
![q2_correct.png](w3school/java_arrays/multi-dimensional_array/q2_correct.png)
#### Question 3
![q3.png](w3school/java_arrays/multi-dimensional_array/q3.png)
![q3_correct.png](w3school/java_arrays/multi-dimensional_array/q3_correct.png)
#### Question 4
![q4.png](w3school/java_arrays/multi-dimensional_array/q4.png)
#### Exercise Completed
![exercise_completed.png](w3school/java_arrays/multi-dimensional_array/exercise_completed.png)
