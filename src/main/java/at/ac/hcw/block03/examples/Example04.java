package at.ac.hcw.block03.examples;

public class Example04 {
    public static void main(String[] args) {
        // does this example print "done"?
        byte count = 0;

        while (count < 5) {
            System.out.println(count);
            count -= 5;
        }

        System.out.println("done");
        System.out.println(count); // Overflow/Underflow
    }
}