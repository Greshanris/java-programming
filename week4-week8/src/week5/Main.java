package week5;

public class Main {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1); // Recursive call
        } else {
            return 0; // Base case
        }
    }
}
