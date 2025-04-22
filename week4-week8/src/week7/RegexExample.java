package week7;

/*
 3. Regular Expressions (regex)
    - They are patterns for matching and manipulating strings
 */
// Week 7, Day-2: Wednesday, April 16, 2025

public class RegexExample {
    public static void main(String[] args) {
        // defining input string
        String input = "abc123xyz456";
        // .replaceAll(regex:"\\d", replacement:"*") , this replaces digits(d) with *
        String output = input.replaceAll("\\d", "*");
        System.out.println("\nOutput: " + output);

        /*
        .replaceAll()
        \\d : A regex pattern matching any digit (0-9).
        * : Replaces each digit with an asterisk

        WHY to use?
        - Powerful tool for text processing, like validating emails or cleaning data.
         */

        // Replacing all letters with "#" (we will use \\w for [a-zA-z] letters
        String output2 = input.replaceAll("[a-zA-Z]", "#");
        System.out.println("\nAfter replacing words with \"#\": " + output2);

        // Removing all digits instead of replacing them
        String output3 = input.replaceAll("\\d", "");
        System.out.println("\nRemoving all digits: " + output3);
    }
}
