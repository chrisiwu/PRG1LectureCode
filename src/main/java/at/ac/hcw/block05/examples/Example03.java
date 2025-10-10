package at.ac.hcw.block05.examples;

public class Example03 {
    public static void main(String[] args) {
        /* shortcut to create an array with initial values
           length of array is precisely the number
             of values specified in the block */
        String[] arrayOfStrings = {"Tick", "Trick", "Track"};
        double[] arrayOfFloatingpoints = {1.20, 3.14, 100.0, 0.6666666667};

        for (int i = 0; i < arrayOfStrings.length; i++) {
            System.out.println(arrayOfStrings[i] + " " + arrayOfFloatingpoints[i]);
        }
    }
}