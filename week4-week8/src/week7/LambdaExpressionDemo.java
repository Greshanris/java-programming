package week7;

// Annotations
@FunctionalInterface // if there is only one abstract method: "FunctionalInterface"
interface Calculation {
    int operate (int a, int b); // abstract method
}

public class LambdaExpressionDemo {
    public static void main(String[] args) {
//        Calculation calculation = new Calculation() {
//            @Override
//            public int operate(int a, int b) {
//                return 0;
//            }
//        }

        Calculation add = (int a, int b) -> a+b;

        Calculation multiply = (int a, int b) -> a*b;

        int sum = add.operate(5, 14);
        int multiplication = multiply.operate(5, 6);

        System.out.println("The result of lambda expression (Add): " + sum);
        System.out.println("The result of lambda expression (Multiply): " + multiplication);
    }
}
