package at.ac.hcw.block02.examples;

public class Example04 {
    /* Code Indentation and Block Statements:
         - code block = section enclosed by a pair of curly brackets
         - blocks define a program's structure and its bounds
         - curly brackets must always have a matching pair!
         - blocks also influence the readability
         - code inside block is indented */
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
        int firstNumber = 10, secondNumber = 20;
        int sum = firstNumber + secondNumber;
        System.out.println(sum);

        int a = 2, b = 3;
        double c = Math.sqrt(a * a + b * b); // Math.sqrt returns a double value
        System.out.println(c);

        int count = 0;
        count = count + 1;
        System.out.println(count);

        final int TAXRATE = 20; // constant
        int gross = 234;
        double net = gross * (1 - TAXRATE / 100);
        System.out.println(net);

        /* calculation rules:
             1. expression within braces are calculated first
             2. operator precedence (* and / first,afterwards + and -)
             3. usually from left to right! */
        int z = 4 + 2 / 3 - 1;
        System.out.println(z);
    }
}