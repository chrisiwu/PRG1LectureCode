package at.ac.hcw.block10.examples.example05;

import java.util.HashMap;

public class Example05 {
    public static void main(String[] args) {
        HashMap<String, String> numbers = new HashMap<>();

        numbers.put("One", "Uno");
        numbers.put("Two", "Dos");

        String translation = numbers.get("One");

        System.out.println(translation); // Uno
        System.out.println(numbers.get("Two")); // Dos
        System.out.println(numbers.get("Three")); // null
        System.out.println(numbers.get("Uno")); // null
    }
}