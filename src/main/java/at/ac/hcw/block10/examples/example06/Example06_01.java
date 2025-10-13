package at.ac.hcw.block10.examples.example06;

import java.io.FileWriter;
import java.io.IOException;

public class Example06_01 {
    public static void main(String[] args) {
        Example06_01 main = new Example06_01();

        main.createHelloWorldFile();
    }

    /* if there is an error during runtime that
         inhibits further execution of code,
         an exception is thrown
       exceptions are objects that inherit from Throwable
       how to throw an exception:
         throw new NullPointerException("customer is null");
       encountering an exception stops execution
         of actual code block
       if the encountered Exception is unchecked we may:
         - catch it, sanitize state, and finish normally or
         - catch it, do something, and re-throw some exception or
         - ignore it silently, so that it is automatically
             thrown at the caller's invocation point
       if the encountered exception is checked, and we choose c),
         then we must declare it in the throws-clause of our method */
    public void createHelloWorldFile() {
        FileWriter writer = null;

        /* code within try block might throw an exception
           if an IOException (or subclass of it) is thrown
             the catch block gets executed */
        try {
            writer = new FileWriter("test.txt");
            writer.write("Hello World!");
            writer.close();
        } catch (IOException e) {
            System.out.println("File cannot be written.");
        }

        // rest of code
    }
}