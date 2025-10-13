package at.ac.hcw.block10.examples.example08;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Example08_02 {
    public static void main(String[] args) {
        Person person = null;

        try (FileInputStream fileIn = new FileInputStream("person.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            person = (Person) in.readObject();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Person class not found.");
            c.printStackTrace();
        }

        System.out.println("deserialized person ...");
        System.out.println(person);
    }
}