public class JavaBreakContinue {
    public static void main(String[] args) {
        // use of break and continue
        for (int i = 1; i<=10;i++) {
            if (i==5) {
                // here, break will break the loop of if statement of i==5
                    break;
            }
            System.out.println(i);
        }
    }
}
