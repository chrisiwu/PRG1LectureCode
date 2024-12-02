package at.ac.fhcampuswien.block14.example04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example04 {
    public static void main(String[] args) {
        // try-with-resources block
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // handling any IO exceptions that might occur
            e.printStackTrace();
        }
        // The BufferedReader will automatically be closed here, regardless of whether
        // the try block completes successfully or an exception is thrown.
    }
}