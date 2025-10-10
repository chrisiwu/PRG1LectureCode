package at.ac.hcw.block03.examples;

public class Example05 {
    public static void main(String[] args) {
        // does this example print "done"?
        byte i = 1;

        while (i != 50) {
            System.out.println(i);
            i += 2;
        }

        System.out.println("done");
        System.out.println(i); // Overflow/Underflow
    }
}