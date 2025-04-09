package week4;

public class ValidateUser {
    static String userName = "Rishav";
    static String userPassword = "rishav321";

    public static boolean validateUser(String username, String password) {
        return username.equals(userName) && password.equals(userPassword);
    }

    public static void main(String[] args) {
        boolean validateUser  = validateUser("Hari", "Krishna");
        if (validateUser) {
            System.out.println("User is valid");
        } else {
            System.out.println("User is not valid");
        }
    }
}
