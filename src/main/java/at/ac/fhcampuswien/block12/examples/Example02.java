package at.ac.fhcampuswien.block12.examples;

import java.util.ArrayList;
import java.util.List;

public class Example02 {
    public static void main(String[] args) {
        // declaring variables & creating instances
        List<Object> objects1 = new ArrayList<Object>();

        /* Java 7: introduced the Diamond Operator
           less work for developers: you can omit
             the type parameter if the type is known */
        List<Object> objects2 = new ArrayList<>();
    }
}