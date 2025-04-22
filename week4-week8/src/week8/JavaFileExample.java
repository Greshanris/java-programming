package week8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JavaFileExample {
    public static void main(String[] args) {
        try {

            File newFile = new File("R:\\rishav_folder\\Present_assignment\\PRG401JAVA\\week4-week8\\src\\week8\\newFile.txt");
            if (newFile.createNewFile()) {
                System.out.println("Created file name: " + newFile.getName());
            } else {
                System.out.println("File already exist");
            }

            FileWriter newWriter = new FileWriter("R:\\rishav_folder\\Present_assignment\\PRG401JAVA\\week4-week8\\src\\week8\\newFile.txt");
            newWriter.write("this is test write\n");
            newWriter.write("this is the test data\n");
            newWriter.write("this is the test data\n");
            newWriter.close();
        } catch (IOException e) {
        System.out.println("Exception: " + e.getMessage());
    }
}}
