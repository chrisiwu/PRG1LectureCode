package at.ac.fhcampuswien.block13.examples.example01;

import java.util.ArrayList;
import java.util.List;

public class Example01 {
    public static void main(String[] args) {
        /* List Interface:
             - elements are ordered like a sequence
             - access via index
           ArrayList:
             - implements List interface
             - dynamic arrays - resizable */
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);

        List<String> strings = new ArrayList<>();
        strings.add("String is a reference-type variable.");
        strings.add("Hello World!");
//        strings.add(1);

        System.out.println(strings.get(1)); // Hello World!
        System.out.println(strings.contains("Hello World!")); // true
        strings.remove(0);
    }
}