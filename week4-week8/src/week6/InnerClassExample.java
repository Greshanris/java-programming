package week6;

// Week 5: Day 3: Wednesday

// Defined a OuterClass
class OuterClass {
    int x = 12;

    // Defined a InnerClass
    class InnerClass {
        int y = 13;
    }
}

public class InnerClassExample {
    public static void main(String[] args) {
        // created a object sof outer class
        OuterClass outerClass = new OuterClass();

        // now to create a object of innerclass, we need the object of outer class
        // so, we used outerClass.new InnerClass();
        // but this time, we also needed to specify which InnerClass to use
        // So, OuterClass.InnerClass is equivalent to usage of InnerClass
        // The reason being InnerClass being defined inside the OuterClass
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(outerClass.x);
        System.out.println(innerClass.y);
    }
}