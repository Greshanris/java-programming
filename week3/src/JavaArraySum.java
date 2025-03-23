public class JavaArraySum {
    public static void main(String[] args) {
        int[] input = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < input.length - 1; i++) {
            sum += input[i];
        }
        System.out.println(sum);
    }
}
