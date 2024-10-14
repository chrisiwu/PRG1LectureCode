package at.ac.fhcampuswien.block06.examples;

public class Example01 {
    public static void main(String[] args) {
        // assigning and accessing elements
        final int FIRST = 0;
        int[] numbers = new int[3]; // initialise array with length 3
        String[] strings = new String[5];

        numbers[0] = 2; // set value at index 0 to 2
        numbers[1] = numbers[0] + 1; // get value at index 0, add 1 and save result at index 1
        numbers[2] = 5; // set value at index 2 to 5

        System.out.println(numbers[0]); // prints 2
        System.out.println(numbers[1]); // prints 3
        System.out.println(numbers[2]); // prints 5
        System.out.println(numbers[FIRST]); // prints 2
    }
}