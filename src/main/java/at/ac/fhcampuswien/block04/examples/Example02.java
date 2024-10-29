package at.ac.fhcampuswien.block04.examples;

public class Example02 {
    public static void main(String[] args) {
        // does this example print "done"?
        int count = 0;

        while (count < 5) {
            System.out.println("*");
            count = count - 5;
        }

        System.out.println("done");
    }
}