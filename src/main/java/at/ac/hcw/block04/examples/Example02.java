package at.ac.hcw.block04.examples;

public class Example02 {
    /* methods are declared within a class
         but outside of any other method) */
    public static void myMethod1(String s) {
        System.out.println(s);
    }

    public static int myMethod2(int i) {
        /* return statement indicates which value
             will be the result of the method
             (e.g. result of a math function) */
        return i * 2 + 1;
    }

    public static void main(String[] args) {
        /* usage of the method from within
             another method (e.g. the main method) */
        myMethod1("Hello");

        int j = myMethod2(5);
        System.out.println("j=" + j);
    }
}