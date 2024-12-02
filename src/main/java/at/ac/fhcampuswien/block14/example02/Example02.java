package at.ac.fhcampuswien.block14.example02;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Example02 {
    public static void main(String[] args) {
        // FileWriter is meant for writing streams of characters
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("Hello, World!");
            writer.newLine(); // to write a new line
            writer.write("This is another line.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // write a list of strings with Files.write
        List<String> lines = Arrays.asList("Hello, World!", "This is another line.");

        try {
            Files.write(Paths.get("output.txt"), lines, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // for writing streams of raw bytes, consider using a FileOutputStream
        try (FileOutputStream fos = new FileOutputStream("output.dat")) {
            fos.write(new byte[]{65, 66, 67}); // Writing A, B, C in ASCII
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}