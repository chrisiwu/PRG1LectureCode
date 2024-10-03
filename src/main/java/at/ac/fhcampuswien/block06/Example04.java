package at.ac.fhcampuswien.block06;

public class Example04 {
    public static void main(String[] args) {
        // create array with initial values
        String[] arrayOfStrings = {"Tick", "Trick", "Track"};
        double[] arrayOfFloatingPoints = {1.20, 3.14, 100.0, 0.6666666667};

        for (int i = 0; i < arrayOfStrings.length; i++) {
            System.out.println(arrayOfStrings[i] + ": " + arrayOfFloatingPoints[i]);
        }
    }
}