package at.ac.fhcampuswien.block03.examples;

public class example04 {
    // 1. block
    public static void main(String[] args) {
        // 2. block
        /* syntax: resultVariable = expression;
           expression has the following format:
             operand operator operand
           with operand being a:
           - literal
           - named variable or constant
           - result of a method call
           - expression!
           with operator being e.g. one of:
             +, -, *, /, % (modulus = remainder of integer division) */
        int firstNumber = 10, secondNumber = 20, sum;
        double net, gross = 1200;
        final double TAXRATE = 20;
        int count = 0;
        double a = 3, b = 4, c;
        double z;

        sum = firstNumber + secondNumber;
        System.out.println(sum);

        net = gross / (1 + TAXRATE / 100);
        System.out.println(net);

        count = count + 1;
        System.out.println(count);

        c = Math.sqrt(a * a + b * b);
        System.out.println(c);

        /* calculation rules:
           - expression within braces are calculated first
           - operator precedence (* and / first, afterwards + and -)
           - usually from left to right! */
        z = 4 + 2 / 3.0 - 1;
        System.out.println(z);
    }
}