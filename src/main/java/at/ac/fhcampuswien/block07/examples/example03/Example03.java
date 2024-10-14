package at.ac.fhcampuswien.block07.examples.example03;

import java.util.StringTokenizer;

public class Example03 {
    public static void main(String[] args) {
        StringTokenizer tokens;

        tokens = new StringTokenizer("to be or not to be");

        while (tokens.hasMoreTokens()) {
            String word = tokens.nextToken();
            System.out.println(word);
        }

        System.out.println("Done!");
    }
}