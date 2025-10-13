package at.ac.hcw.block10.examples.example06;

import java.io.FileWriter;
import java.io.IOException;

public class Example06_02 {
    /* now the exceptions gets propagated
         to the caller which again needs to
         either handle it or declare it */
    public static void main(String[] args) throws IOException {
        Example06_02 main = new Example06_02();

        main.createHelloWorldFile();
    }

    /* checked exceptions must be forwarded
         if they are not catched */
    public void createHelloWorldFile() throws IOException {
        FileWriter writer = new FileWriter("test.txt");

        writer.write("Hello World!");

        writer.close();
    }
}