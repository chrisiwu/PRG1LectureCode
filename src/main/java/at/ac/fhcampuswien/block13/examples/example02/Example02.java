package at.ac.fhcampuswien.block13.examples.example02;

import java.util.HashSet;
import java.util.Set;

public class Example02 {
    /* Set Interface:
         - unordered collection
         - stores only unique objects (no duplications) */
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // duplicates are ignored

        System.out.println("Fruits set: " + fruits);

        if (fruits.contains("Banana")) {
            System.out.println("Banana is in the set.");
        }

        System.out.println(fruits.remove("Banana"));

        fruits.remove("Orange");
        System.out.println("Fruits set after removal: " + fruits);

        System.out.println("Set size: " + fruits.size());
    }
}