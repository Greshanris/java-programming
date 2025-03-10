// CLASSWORK

/*
WAP which helps us to check whether a given number is positive or not.
WAP which grade from 0 to 100
90-100: A
80-89: B
70-79: C
60-69: D
Below 60: E
*/

public class JavaCondition {
    public static void main(String[] args) {
        // WAP which helps us to check whether a given number is positive or not.
        int number = -3;
        if (number > 0) {
            System.out.println("Number is +ve");
        } else if (number < 0) {
            System.out.println("Number is -ve");
        } else {
            System.out.println("Number is 0");
        }
        // WAP which grade from 0 to 100
        int grade = 78;
        if (grade >= 90 && grade <= 100) {
            System.out.println("Grade A");
        } else if (grade < 90 && grade >=80) {
            System.out.println("Grade B");
        } else if (grade < 80 && grade >= 70) {
            System.out.println("Grade C");
        } else if (grade < 70 && grade >= 60) {
            System.out.println("Grade D");
        } else if (grade < 60) {
            System.out.println("Grade E");
        } else {
            System.out.println("No Grade");
        }
    }

}