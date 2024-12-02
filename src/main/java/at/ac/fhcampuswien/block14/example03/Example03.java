package at.ac.fhcampuswien.block14.example03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Example03 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            List<String> lines = Files.readAllLines(Paths.get("input.txt"));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // reading binary files
        try (FileInputStream fis = new FileInputStream("input.dat")) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.print(byteData + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}