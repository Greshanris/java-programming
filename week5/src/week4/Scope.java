package week4;

public class Scope {
    String name;

    public static void sum() {
        int num = 0;
    }

    public static void main(String[] args) {
        Scope scope = new Scope();
        scope.printName();
        multiply();
    }

    public void printName() {
        System.out.println("Name: " + name);
    }

    public static void multiply() {
        int num = 5;
        int result = num * 5;
        System.out.println("Result: " + result);
    }
}
