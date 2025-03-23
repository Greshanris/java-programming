
public class CountOccurence {
    public static void main(String[] args) {
        // Write a java program to count how many times a specific number appears in an array
        // input Array: [1, 2, 3, 2, 4, 2, 5]
        int[] newArray = {1, 2, 3, 2, 4, 2, 5};
        int target = 2;
        int count = 0;

        for (int i = 0; i < newArray.length - 1; i++) {
            if (newArray[i] == target) {
                count++;
            }

        }
        System.out.print("count: " + count);
    }
}
