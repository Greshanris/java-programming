public class JavaStringClass {
    public static void main(String[] args) {
        String stringOne = "text";
        String stringTwo = "text2";
        StringBuilder strBuilder = new StringBuilder();

        // for appending
        strBuilder.append("test1");
        strBuilder.append("test2");

        System.out.println(stringOne.length()); // to know the length of the string
        System.out.println(stringTwo.toUpperCase()); // to make stringTwo in uppercase
        System.out.println(stringOne + stringTwo); // for concatenation

        String firstName = "Rishav";
        String lastName = "Chaudhary";
        String fullName = "Rishav Chaudhary";

        System.out.println(fullName.charAt(2)); // index number 2 character
        System.out.println("This is use of equals method with lastName " + fullName.equals(lastName));
        System.out.println("This is use of compareTo method with lastName " + fullName.compareTo(lastName));
        System.out.println(fullName.substring(0, 4)); // making substring from index 0 to 4
    }
}