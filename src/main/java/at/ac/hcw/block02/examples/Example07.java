package at.ac.hcw.block02.examples;

public class Example07 {
    public static void main(String[] args) {
        /* three values are provided,
             stored in the variables first, second and third
           store the minimum value in the variable named min */
        int first = 5;
        int second = 10;
        int third = 15;
        int min;

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