package at.ac.fhcampuswien.block03.exercises;

public class Exercise02 {
    public static void main(String[] args) {
        int x = 5;
        int inputValue = 20;
        final int THRESHOLD = 10;

        // print a message if the value of x is positive:
        if (x > 0) System.out.println("The value of x is positive.");

        // print a warning if inputValue exceeds a threshold:
        if (inputValue >= THRESHOLD) System.out.println("Warning: Overload!");

        // print either positive or negative depending on the value of x:
        if (x < 0) System.out.println("negative");
        else System.out.println("positive or zero");
    }
}