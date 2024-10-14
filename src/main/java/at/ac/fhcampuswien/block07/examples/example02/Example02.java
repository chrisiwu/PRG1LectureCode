package at.ac.fhcampuswien.block07.examples.example02;

import java.util.Random;

public class Example02 {
    public static void main(String[] args) {
        Random die = new Random();
        int face = die.nextInt(6) + 1;

        System.out.println(face);
    }
}