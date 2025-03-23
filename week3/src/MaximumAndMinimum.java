public class MaximumAndMinimum {
    public static void main(String[] args) {

        int[] numbers = {5, 12, 3, 19, 8, 2};


        int maximum = numbers[0];
        int minimum = numbers[0];


        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }


        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
    }
}
