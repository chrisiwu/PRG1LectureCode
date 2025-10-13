package at.ac.hcw.block10.examples.example01;

import java.util.ArrayList;

public class Example01 {
    public static void main(String[] args) {
        /* Collections:
           any group of individual objects that
             is represented as a single unit is
             known as a Java collection
           Java collection framework holds all
             Java collection classes and
             interfaces in it (java.util.Collection,
             java.util.Map)
           Collection classes and interfaces are
             a base structure for components that is
             ready to use for various programming tasks
           offers different operations like searching,
             sorting, insertion, deletion and manipulation
           List - when sequence matters
             duplicates OK
           Set - when uniqueness matters
             no duplicates
           Map - when finding something by key matters
             duplicate values OK, but NO duplicate keys */
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // put something in it
        numbers.add(1);
        // put another thing in it
        numbers.add(2);

        // find out how many things are in it
        int theSize = numbers.size();
        System.out.println(theSize);

        // find out if it contains something
        boolean isIn = numbers.contains(4);
        System.out.println(isIn);

        // find out where something is
        int index = numbers.indexOf(2);
        System.out.println(index);
    }
}