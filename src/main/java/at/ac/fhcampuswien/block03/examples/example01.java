package at.ac.fhcampuswien.block03.examples;

public class example01 {
    public static void main(String[] args) {
        /* variable:
           - symbol to identify a memory area
               that can store data (information)
           - used to store data of a particular data type
           Java is a strongly typed programming language.
           Every variable and every expression must be
             bound to a specific data type at compile time.
           declaration of variables:
           - syntax: datatype name;
           - datatype: every data type that
               exists in Java or in the program
           - name: =identifier */
        int age;
        double area;
        long initialSpeed;
        char letterGrade;
        char lettergrade; // CAUTION! Java is case sensitive!
        boolean exists;

        /* declaration of constants:
           - syntax: final datatype name = value;
           - datatype: every data type that
               exists in Java or in the program
           - name: = identifier
               convention: ONLY upper case letters!
           - value: can be a literal, variable,
               other constant, or an expression */
        final int SPEEDOFLIGHT = 300;
        final float PI = 3.142F;
        final String COMPANY = "acme"; // literals: String uses "...", char uses '.'
    }
}