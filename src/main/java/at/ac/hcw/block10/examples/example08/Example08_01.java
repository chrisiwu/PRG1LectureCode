package at.ac.hcw.block10.examples.example08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example08_01 {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30, 10, 1989);

        try (FileOutputStream fileOut = new FileOutputStream("person.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(person);
            System.out.println("Serialized data is saved in person.ser.");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}