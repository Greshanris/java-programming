public class JavaMethods {
    // defining methods in JavaMethods class which is a block of code
    // in void, we do not need to return the value
    // while in String, int, we do need to return the corresponding datatype
    // if we declare int a, int b in the parameter of sum() function used as a method
    public static void sum(int a, int b) {
        System.out.println("sum: " + (a+b));
    }
    public static void main(String[] args) {
        sum(2, 5);
        sum(3, 7);
    }
}
