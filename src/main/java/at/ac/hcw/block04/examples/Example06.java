package at.ac.hcw.block04.examples;

public class Example06 {
    public static void main(String[] args) {
        int min = 5;
        int max = 10;

        printNumbers(min, max);

        System.out.println();
        System.out.println(min);
        System.out.println();

        max = 8;

        printNumbers(min, max);
    }

    /* as a method is called the values of
         its parameters are copied (pass-by-value)
       multiple methods can use variables with the same name
       changing the value of the variables inside
         the method does not affect the value
         of the variable in the other methods.
       -> function scope */
    public static void printNumbers(int min, int max) {
        while (min < max) {
            System.out.println(min);
            min++;
        }
    }
}