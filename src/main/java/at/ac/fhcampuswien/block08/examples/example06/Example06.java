package at.ac.fhcampuswien.block08.examples.example06;

import at.ac.fhcampuswien.block08.examples.example05.Person01;
import at.ac.fhcampuswien.block08.examples.example05.SimpleDate;

public class Example06 {
    public static void main(String[] args) {
        Person01 first = new Person01("First", new SimpleDate(31, 12, 9999));
        Person01 second = first;
        Person01 third = first.clone();
    }
}