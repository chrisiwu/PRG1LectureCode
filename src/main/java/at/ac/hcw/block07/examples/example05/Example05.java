package at.ac.hcw.block07.examples.example05;

public class Example05 {
    public static void main(String[] args) {
        /* Java always passes a copy of the
             variable's value to methods
           changes to the parameter do not
             affect the original variable */
        int x = 10;
        changePrimitive(x);
        System.out.println("x after method: " + x); // output: 10

        /* What happens if the argument you pass
             is an object instead of a primitive?
           Java passes everything by value, but value
             means stored bits inside the variable
           but reference types only store the reference to an object */
        int[] arr = {1, 2, 3};
        changeArray(arr);
        System.out.println("arr[0] after method: " + arr[0]);  // output: 100
    }

    public static void changePrimitive(int number) {
        number = 20; // this only changes the local copy
    }

    public static void changeArray(int[] array) {
        array[0] = 100;  // modifies the original array
    }
}