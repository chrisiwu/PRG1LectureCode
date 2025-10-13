package at.ac.hcw.block10.examples.example07;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Example07 {
    public static void main(String[] args) {
        // FileWriter is meant for writing streams of characters
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("Hello, World!");
            writer.newLine();
            writer.write("This is another line.");
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // write a list of Strings with Files class
        List<String> linesOutput = Arrays.asList("Hello, World!", "This is another line.");
        try {
            Files.write(Paths.get("output.txt"),
                    linesOutput,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // for writing streams of raw bytes, consider using FileOutputStream
        try (FileOutputStream fos = new FileOutputStream("output.dat")) {
            fos.write(new byte[]{65, 66, 67}); // writing A, B, C in ASCII
        } catch (IOException e) {
            e.printStackTrace();
        }

        // simple BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // files API
        try {
            // read all bytes (binary-safe)
            byte[] bytes = Files.readAllBytes(Path.of("output.dat"));
            for (byte byteData : bytes) {
                System.out.println(byteData);
            }

            // read all lines as strings
            List<String> linesInput = Files.readAllLines(Path.of("output.txt"),
                    StandardCharsets.UTF_8);
            for (String line : linesInput) {
                System.out.println(line);
            }

            // read entire file as single string
            String content = Files.readString(Path.of("output.txt"));
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // FileInputStream for reading binary data from files
        try (FileInputStream fis = new FileInputStream("output.dat")) {
            int byteData;

            while ((byteData = fis.read()) != -1) {
                System.out.println(byteData + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        /* try-with-resources:
           declare resources to be used in a try block
             with the assurance that the resources will
             be closed after the execution of that block
           the BufferedReader will automatically be closed,
             regardless of whether the try block completes
             successfully or an exception is thrown */
        // try-with-resources block
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // handling any IO exceptions that might occur
            e.printStackTrace();
        }
    }
}