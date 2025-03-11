// Looping through
public class JavaLoop {
    public static void main(String[] args) {
        // 1 to  10
        int i = 1;
        int iSum = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
            iSum+=i;
        }
        System.out.println("Sum=" + iSum);

        // summing the digits like 1 + 2 + 3 + 4 and storing it in one variable
        int number = 1234;
        int numberSum = 0;
        while (number != 0) {
            // we need to remove each digit from number from number variable
            int digit = number%10; // 10*123 = 1230 and remainder will be 4
            numberSum += digit; // 0 + 4
            number /= 10; // 123.4
        }
        System.out.println("total sum=" + numberSum);

        // reversing the Number
        int newNumber = 4567;
        //output = 7654
        String reverseNumber = "";
        // reverse = reverse*10*digit
        while (newNumber != 0) {
            int digit = newNumber%10; // so this find out the digit
            reverseNumber = reverseNumber + digit;
            newNumber /= 10;
        }
        System.out.println("Reversed Number will be " + reverseNumber);
    }
}