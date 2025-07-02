package at.ac.fhcampuswien.block03.exercises;

public class Exercise05 {
    public static void main(String[] args) {
        double x = 5;
        double y = 0;
        double z;

        // avoid a "division by zero" error
        if (y == 0) {
            System.out.println("Error: can't divide by zero");
        } else {
            z = x / y;
            System.out.println("The result is " + z + ".");
        }
    }
}