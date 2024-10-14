package at.ac.fhcampuswien.block06.examples;

public class Example03 {
    public static void main(String[] args) {
        // array iteration
        int length = 5;
        int[] myNumbers = new int[length];  // declare array with specified length

        // fill the array using a loop
        for (int i = 0; i < length; i++) {
            myNumbers[i] = i * i;
        }

        // use a for-each loop to print each element
        for (int element : myNumbers) {
            System.out.print(element + " ");
        }
    }
}