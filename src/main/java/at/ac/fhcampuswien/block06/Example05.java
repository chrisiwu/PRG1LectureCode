package at.ac.fhcampuswien.block06;

import java.util.Arrays;

public class Example05 {
    public static int[] reverseArray(int[] numbers) {
        int n = numbers.length;

        // swap elements from the beginning with elements from the end until you reach the middle
        for (int i = 0; i < n / 2; i++) {
            int temp = numbers[i]; // temporary hold the value of current element
            numbers[i] = numbers[n - 1 - i]; // replace current element with corresponding element at the end
            numbers[n - 1 - i] = temp;  // replace element at the end with temp
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] myNumbers = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(myNumbers));

        int[] reveresed = reverseArray(myNumbers);

        System.out.println(Arrays.toString(reveresed));
        System.out.println(Arrays.toString(myNumbers));

        System.out.println(reveresed);
        System.out.println(myNumbers);
    }

}
