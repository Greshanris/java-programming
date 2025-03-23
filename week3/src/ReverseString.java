// java program using a for loop to reverse the string "JavaProgramming" and print the reversed string
public class ReverseString {
    public static void main(String[] args) {
        String text = "JavaProgramming";
        StringBuilder reverseText = new StringBuilder();

        // to reverse the string
        for (int i = text.length() - 1; i >= 0; i--) {
            reverseText.append(text.charAt(i));
        }

        System.out.println(reverseText.toString());
    }
}
