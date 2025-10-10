package at.ac.hcw.block02.examples;

public class Example01 {
    public static void main(String[] args) {
        /* variable:
             - symbol to identify a memory area
               that can store data (information)
             - used to store data of a particular data type
             - variables are names associated with values
           Java is a statically typed programming language.
           Every variable and every expression must be
             bound to a specific data type at compile time.
           Statically typed language: types are known at compile time.
             Types cannot be changed at runtime.
           Dynamically typed: types of variables can change at runtime.
           declaration of variables:
             - syntax: datatype name;
             - datatype: every data type that
                 exists in Java or in the program
             - name: = identifier */
        int age;
        double area;
        long initialSpeed;
        char letterGrade;
        char lettergrade; // CAUTION! Java is case sensitive!
        boolean exists;

        // primitive declarations with assignments
        int x;
        x = 234;
        byte b = 89;
        boolean isFun = true;
        double d = 3456.98;
        char c = 'f';
        int z = x;
        boolean isPunkRock;
        isPunkRock = false;
        boolean powerOn;
        powerOn = isFun;
        /* note the 'f' and 'L'.
           With some number types you need to
             tell the compilers what you mean. */
        long big = 3456789L;
        float f = 32.5f;

        /* Type Casting:
           Be sure the value can fit into the variable.
           You cannot put a large value into a small type. E.g. int inside byte.
           If you assign smaller values to larger types,
             they get type casted implicitly. This is "safe" because
             we won't lose information by casting! */
        int number;
        number = 24;
        byte byteFromInt = (byte) number;

        String text = "123";
        int numberFromText = Integer.parseInt(text); // works fine

        String str = "Hello World";
        //int numberFromText2 = Integer.parseInt(str); // NumberFormatException: For input string: "Hello World"

        byte byteNumber = 24;
        int intFromByte = byteNumber; // works fine

        /* declaration of constants:
           A constant is a variable that’s value never changes.
           Using constants improves readability,
             because they provide recognizable names for fixed values
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