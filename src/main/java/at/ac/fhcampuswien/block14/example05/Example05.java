package at.ac.fhcampuswien.block14.example05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example05 {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close(); // explicitly close the BufferedReader
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        // BufferedReader is manually closed in the finally block
    }
}