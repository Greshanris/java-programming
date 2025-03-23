public class JavaArrayExample {
    public static void main(String[] args) {
        int a=4;
        int b=5;
        int c=8;
        // array is the that variable, to be exact an object that stores multiple values

        // First way of defining array
        int[] numbers={4, 5, 8}; // now an array is created;

//        // another way of defining array
//        int num[3, 4, 5]; // this way is not used much
//
//        // third way of defining array
//        int[] num = new int[]; // Size of array is fixed, and we cannot add it dynamically

        // we cannot loop the array like iterating over each index
        // so to loop, we need to put i value as 0 in for loop
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        numbers[1]=0;

        // using for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // using for each loop


    }
}
