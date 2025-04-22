package week7;

// Custom exception created by inheriting the built-in "Exception" class.
class MyException extends Exception {
    // Constructor that passes a message to the parent Exception class using super()
    MyException(String message) {
        super(message);
    }
}

public class ExceptionExample {
    // creating ageValidation method for exception handling
    /*
    Here, we are learning, "How to use the custom exception inside a method?"
    but, why do we need to "throws MyException" in the method definition?
    ANSWER: - Java needs to know this method "might throw a checked exception"
            - And the person calling it should handle it properly.
     */
    public  static  void ageValidation(int age) throws MyException {
        if (age < 20) {
            // How to use the custom exception inside a method? answer
            throw new MyException("Not eligible for driving license");
        } else {
            System.out.println("Eligible for driving license");
        }
    }

//    public static void checking_I(int i) throws MyException {
//        if (i <= 0) {
//            throw new MyException("Value must be greater than zero");
//        } else {
//            int result = 10 / i;
//            System.out.println(result);
//        }
//    }

    // Main Function
    public static void main(String[] args) {
        try {
            // calling ageValidation(10) method, to check Exception handling
            System.out.println("\nCalling out ageValidation(10) method: ");
            ageValidation(10);
        } catch (MyException e) {
            System.out.println("MyException:" + e.getMessage());
        }

        // initiating i value
        int i = 0;

        // now, to handle error, we use try{}catch(){} block
        try {
            // Checking by defining a method:

//            System.out.println("\nCalling checking_I(): ");
//            checking_I(i);

            // Checking by if..else statement:
            if (i <= 0) {
                throw new MyException("Value must be greater than zero");
            } else {
                int result = 10 / i;
                System.out.println(result);
            }
        } catch (ArithmeticException e) {
            System.out.println("Not divisible by zero: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception:" + e.getMessage());
        } catch (MyException e) {
            System.out.println("MyException:" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        } finally {
            System.out.println("Finished\n");
        }

        int[] nums = {1,8,3,4};

        for (int n:nums){
            try {
//                i = 2;
                if (i <= 0) {
                    throw new ArithmeticException("Value is less than 0");
                } else {
                    double result1 = n / i ;
                    System.out.println(n + " / " + i + " = " + result1 );
                }
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception Error: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
            } catch (RuntimeException e) {
                System.out.println("Runtime Exception:" + e.getMessage());
            } finally {
                System.out.println("Finished");
            }
        }

    }
}
