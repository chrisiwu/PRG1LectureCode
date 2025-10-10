package at.ac.hcw.block02.examples;

public class Example14 {
    public static void main(String[] args) {
        /* expressions
             - an expression is something which can be evaluated.
             - = a syntactically valid combination of constants, variables,
                 functions and operators which yields a value */

        // arithmetic expressions
        int result = 5 + 3 * 2; // result = 11
        System.out.println(result);

        int score1 = 10;
        int score2 = 5;
        double average = (score1 + score2) / 2.0;
        System.out.println(average);

        // relational expressions
        int grade = 75;
        boolean isPassed = grade >= 60;
        System.out.println(isPassed);

        int a = 1;
        int b = 1;
        boolean isEqual = a == b;
        System.out.println(isEqual);

        // logical expressions
        int age = 20;
        boolean hasID = true;
        boolean isEligible = age >= 18 && hasID;
        System.out.println(isEligible);

        String input = "String";
        boolean isValid = input != null || input.length() > 0;
        System.out.println(isValid);

        // assignment expressions
        int x = 10;
        x += 5; // x = 15
        System.out.println(x);

        // modulo expression
        int number = 16;
        boolean isEven = number % 2 == 0;
        System.out.println(isEven);

        int total = 100;
        int divisor = 15;
        int remainder = total % divisor;
        System.out.println(remainder);

        // conditional (ternary) expression
        String testResult = (grade >= 50) ? "Pass" : "Fail";
        System.out.println(testResult);
    }
}