package week8;

import java.io.File;
import java.util.Scanner;

public class JavaFileRead {
    public static void main(String[] args) {
        try {
            File readFile = new File("R:\\rishav_folder\\Present_assignment\\PRG401JAVA\\week4-week8\\src\\week8\\newFile.txt");
            Scanner scanner = new Scanner(readFile);

            while (scanner.hasNextLine()) {
                String text = scanner.nextLine();
                System.out.println(text);
            }
            scanner.close();

            if (readFile.delete()) {
                System.out.println("file deleted: " + readFile.getName());
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
