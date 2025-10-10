package at.ac.hcw.block02.examples;

public class Example06 {
    public static void main(String[] args) {
        /* three different approaches to calculate z
             being the absolute value of the difference x-y */
        int x = 5;
        int y = 10;
        int z;

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

        // other option: z = Math.abs(x-y);
        z = Math.abs(x - y);
        System.out.println(z);
    }
}