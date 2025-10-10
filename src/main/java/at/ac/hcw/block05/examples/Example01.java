package at.ac.hcw.block05.examples;

public class Example01 {
    public static void main(String[] args) {
        /* Arrays:
           An array is a collection of values of the same type
             that are stored under a single name and
             can be accessed via an index.
           Manage and manipulate groups of related values.
           Index is a number that corresponds
             with a position within the array.
           Indeces start with 0!
           Given an array of n elements, indices will be [0, n – 1].
           Key Points:
             - has a fixed sized, which is determined at
                 initialisation and cannot be changed
             - each element can be accessed using its index
             - all elements are of same type. */
        int[] numbers = new int[3]; // can hold 3 integer values
        String[] strings = new String[5]; // initialise array with length 5

        final int FIRST = 0;

        numbers[0] = 2; // set value at index 0 to 2
        numbers[1] = numbers[0] + 1; // get value at index 0, add 1 and save result at index 1
        numbers[2] = 5;

        System.out.println(numbers[0]); // 2
        System.out.println(numbers[1]); // 3
        System.out.println(numbers[2]); // 5
        System.out.println(numbers[FIRST]); // 2

        /* process all array elements:
             size of an array with associated property length */
        System.out.println("The array has " + numbers.length + " elements.");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        /* if the index is pointing outside the array
             (element does not exist) we get an
             ArrayIndexOutOfBoundsException */
//        System.out.println(numbers[4]); // ArrayIndexOutOfBoundsException: index 4 out of bounds for length 3
    }
}