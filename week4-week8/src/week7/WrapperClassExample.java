package week7;

import java.util.ArrayList;

public class WrapperClassExample {
    public static void main(String[] args) {

        // This is primitive type variable (int).
        int num = 5;

        // Now, this is a wrapper class for "int" primitive type
        Integer newNum = num; // (Auto-boxing)
        // Wrapper class is used to convert primitive data type to object. (since, String is already an object, we do not need to convert it)

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(newNum);

        Integer number = numbers.get(0);
        System.out.println("Integer (Object) after auto-boxing: " + number);
        int finalValue = number; // Auto-unboxing
        System.out.println("int (Primitive Data Type) after auto-unboxing: " + finalValue);

    }
}
