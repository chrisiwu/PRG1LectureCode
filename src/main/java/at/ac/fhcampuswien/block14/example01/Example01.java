package at.ac.fhcampuswien.block14.example01;

import java.io.FileWriter;
import java.io.IOException;

public class Example01 {
    public static void createHelloWorldFile1() {
        try {
            FileWriter writer = new FileWriter("/home/user/test.txt");
            writer.write("Hello World!");
            writer.close();
        } catch (IOException e) {
            System.out.println("File cannot be written.");
        }
    }

    public static void createHelloWorldFile2() throws IOException {
        FileWriter writer = new FileWriter("/home/user/test.txt");
        writer.write("Hello World!");
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        createHelloWorldFile1();
        createHelloWorldFile2();
    }
}