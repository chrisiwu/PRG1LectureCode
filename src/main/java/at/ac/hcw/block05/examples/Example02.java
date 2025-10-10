package at.ac.hcw.block05.examples;

public class Example02 {
    public static void main(String[] args) {
        /* if you don't need to keep track of the index going
             through an array, you can use the for-each loop */
        int length = 5;
        int[] myNumbers = new int[length];  // declare array with specified length

        for (int i = 0; i < length; i++) { // fill the array using a loop
            myNumbers[i] = i * i;
        }

        for (int element : myNumbers) { // use a for-each loop to print each element
            System.out.print(element + " "); // 0 1 4 9 16
        }
    }
}