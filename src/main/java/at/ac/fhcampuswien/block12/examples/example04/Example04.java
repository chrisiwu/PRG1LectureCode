package at.ac.fhcampuswien.block12.examples.example04;

import java.util.HashSet;
import java.util.Set;

public class Example04 {
    public static void main(String[] args) {
        Set<?> set1 = new HashSet<String>();

        set1 = new HashSet<Integer>();
    }
}