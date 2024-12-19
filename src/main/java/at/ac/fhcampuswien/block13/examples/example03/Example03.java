package at.ac.fhcampuswien.block13.examples.example03;

import java.util.HashMap;
import java.util.Map;

public class Example03 {
    /* Map:
         - key-value pairs for mapping data
         - access via keys
         - no duplicate keys allowed! */
    public static void main(String[] args) {
        Map<String, String> numbers = new HashMap<>();
        numbers.put("One", "Uno");
        numbers.put("Two", "Zwei");
        numbers.put("Two", "Dos"); // overwrites value of given key

        String translation = numbers.get("One");
        System.out.println(translation); // Uno

        System.out.println(numbers.get("Two")); // Dos
        System.out.println(numbers.get("Three")); // null
        System.out.println(numbers.get("Uno")); // null
    }
}