package at.ac.fhcampuswien.block03.exercises;

public class Exercise03 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int z;

        /* three different approaches to calculate z
             being the absolute value of the difference x-y */
        if (x - y < 0) {
            z = y - x;
        } else {
            z = x - y;
        }
        System.out.println(z);

        if (x > y) {
            z = x - y;
        } else {
            z = y - x;
        }
        System.out.println(z);

        z = x - y;
        if (z < 0) {
            z = -z;
        }
        System.out.println(z);

        z = x - y;
        if (z < 0) {
            z = Math.abs(x - y); // other option
        }
        System.out.println(z);
    }
}