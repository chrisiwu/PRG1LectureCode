package at.ac.fhcampuswien.block06.examples;

public class Example02 {
    public static void main(String[] args) {
        // size of an array and iterating
        int[] numbers = new int[4];

        numbers[0] = 42;
        numbers[1] = 13;
        numbers[2] = 12;
        numbers[3] = 7;

        System.out.println("The array has " + numbers.length + " elements.");

        int index = 0;

        while (index < numbers.length) { // stop loop at array length
            System.out.println(numbers[index++]);
        }
    }
}