package at.ac.hcw.block03.examples;

public class Example02 {
    public static void main(String[] args) {
        /* print 5 asterisks (*) on the screen:
             - use 5 println statements
             - use only 1 println statement
             - use a while loop */
        int count = 0;

        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("Done!");

        System.out.println("*\n*\n*\n*\n*");
        System.out.println("Done!");

        while (count < 5) {
            System.out.println("*");
            count = count + 1;
        }
        System.out.println("Done!");
    }
}