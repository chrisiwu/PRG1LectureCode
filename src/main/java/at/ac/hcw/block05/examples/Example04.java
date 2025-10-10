package at.ac.hcw.block05.examples;

import java.util.Arrays;

public class Example04 {
    public static void main(String[] args) {
        /* arrays as method parameters:
           when primitive types like int are used as parameters,
             the value of the variable is copied for the method's use
           the same occurs in the case of an array, BUT:
             arrays, like other non-primitive types, that can store large
               amounts of information are so-called reference-type variables
             value of the variable is a reference that points to
               the location that contains the information
           when an array is copied to the method, it receives the
             value of the variable - a reference */
        int[] myNumbers = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(myNumbers));

        int[] reveresed = reverseArray(myNumbers);

        System.out.println(Arrays.toString(reveresed));
        System.out.println(Arrays.toString(myNumbers));

        // same hash values
        System.out.println(reveresed);
        System.out.println(myNumbers);
    }

    public static int[] reverseArray(int[] numbers) {
        int n = numbers.length; // swap elements from the beginning with elements from the end until you reach the middle

        for (int i = 0; i < n / 2; i++) {
            int temp = numbers[i]; // temporary hold the value of current element
            numbers[i] = numbers[n - 1 - i]; // replace current element with corresponding element at the end
            numbers[n - 1 - i] = temp; // replace element at the end with temp
        }

        return numbers;
    }
}