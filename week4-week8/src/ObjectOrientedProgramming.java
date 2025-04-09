
// class is a blueprint of an object
class Dog {
    String color;
    int age;
    int size;
    String breed;

    public void agePrint() {
        System.out.println("age: " + this.age);
    }

    public void dogInfo() {
        System.out.println("age: " + this.age);
        System.out.println("color: " + this.color);
        System.out.println("Size: " + this.size);
        System.out.println("Breed: " + this.breed);
    }
}

// Declaring Student Class
class Student{
    // defining properties
    String name;
    int age;
    int rollNo;
    String program;

    public void studentDetail() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("rollNo: " + this.rollNo);
        System.out.println("program: " + this.program);
    }
}

public class ObjectOrientedProgramming {
    public static void main(String[] args) {
        Dog d1 = new Dog(); // creating new instance of the class Dog as name d1

        // now giving properties of an object d1
        d1.age = 10;
        d1.color = "black";
        d1.size = 40;
        d1.breed = "breed1";

        // printing age of the d1 object
        d1.agePrint();

        // now, creating extra d2, d3 objects
        Dog d2 = new Dog();
        d2.age = 3;
        d2.color = "green";
        d2.size = 30;
        d2.breed = "breed2";

        // d3
        Dog d3 = new Dog();
        d3.age = 5;
        d3.color = "red";
        d3.size = 39;
        d3.breed = "breed3";

        // printing the age of d2 and d3 object
        d2.agePrint();
        d3.agePrint();

        // printing out the dog info using dogInfo() method
        System.out.println("d1 object info: ");
        d1.dogInfo();
        System.out.println("d2 object info: ");
        d2.dogInfo();
        System.out.println("d3 object info: ");
        d3.dogInfo();
        System.out.println(" ");


        // creating a new student instance from the class
        Student student = new Student();
        student.name = "Rishav";
        student.age = 23;
        student.rollNo = 5;
        student.program = "BSc.IT";

        student.studentDetail();
    }

}