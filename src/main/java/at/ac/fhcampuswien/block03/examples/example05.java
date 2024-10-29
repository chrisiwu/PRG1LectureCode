package at.ac.fhcampuswien.block03.examples;

public class example05 {
    public static void main(String[] args) {
        // var detects automatically the datatype of a variable
        var variable = "Variable x";
        System.out.println(variable);

        // int data type
        int integerOne = 100;
        System.out.println(integerOne);

        // use underscore characters to improve the readability
        int integerTwo = 2_147_483_647;
        integerTwo += 1;
        System.out.println(integerTwo);

        // the division of two integers yields an integer value
        int integerDivisionOne = integerOne / 15;
        System.out.println(integerDivisionOne);

        // use decimal notation to get a double valaue
        double integerDivisionTwo = integerOne / 15.0;
        System.out.println(integerDivisionTwo);

        // character data type
        char character = 'a';
        System.out.println(character);

        // constant (cannot be overwritten)
        // d at the end of the number for 64-bit floating point
        final double PI = 3.1415d;
        //PI = 2.718;
        System.out.println(PI);

        // type casting
        integerOne = (int) PI;
        System.out.println(integerOne);

        // hexadecimal numbers
        int hexadecimal = 0xF;
        System.out.println(hexadecimal);

        // octal numbers
        // 8 and 9 is not a valid digit
        int octal = 015;
        System.out.println(octal);

        // binary number
        int binary = 0b11010;
        System.out.println(binary);

        // boolean data type
        boolean bool = false;
        System.out.println(bool);

        // scientific notation
        double scientific = 1.2345e2;
        System.out.println(scientific);
    }
}