
public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] newArr = {{1, 2, 3}, {4, 5, 6}}; // this is new multidimensional array

        System.out.println(newArr[0][1]);

        for (int[] arrValue:newArr) {
            for (int value:arrValue) {
                System.out.println(value+" ");
            }
            System.out.println();
        }
    }
}
