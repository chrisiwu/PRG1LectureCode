package at.ac.fhcampuswien.block04.examples;

public class Example07 {
    public static void main(String[] args) {
        int height = 5;

        for (int i = 0; i <= height; i++) { // outer loop for line
            for (int j = 0; j < i; j++) { // inner loop for stars in a line
                System.out.print("*");
            }
            System.out.println(); // start the next line
        }
    }
}