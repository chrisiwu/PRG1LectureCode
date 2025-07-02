package at.ac.fhcampuswien.block03.exercises;

public class Exercise04 {
    public static void main(String[] args) {
        int first = 10;
        int second = 15;
        int third = 5;
        int min;

        /* Three values are provided, stored in
             the variables first, second and third.
           Store the minimum value in the variable named min. */
        if (first < second) {
            min = first;
        } else {
            min = second;
        }

        if (third < min) {
            min = third;
        }

        System.out.println(min);
    }
}