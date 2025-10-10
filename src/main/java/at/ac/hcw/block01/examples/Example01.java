/* package definition
     - must conform to directory structure!!
     - use for package names ONLY lower case letter */
package at.ac.hcw.block01.examples;

/* class name
     - must be equal to the filename!!
     - Java is "case-sensitive"
         - correct usage of lower and upper case is important
         - "HelloWorld" is different to "helloworld" in Java!
     - start class names ALWAYS with an upper case letter
         and use "CamelCase" to highlight words */
public class Example01 {
    /* comment
         - comment every method and important sections in your program
         - helps to understand the program by
             a fellow programmer or yourself later on */
    /* main method
         - entry point of the program
         - start method and variable names ALWAYS with a lower case letter
             and use "CamelCase" to highlight words */
    /* a group of related statements (e.g. belonging to a method)
         is always encapsulated in curly braces: { <list of statements> }
         - either put the opening curly brace in the same line
         - or put it on a new line
         - every block marked by curly braces
             should be intended by whitespaces!
             (use the tab key, it intends typical by 2 or 4 spaces)
             → Increases readability and eases finding errors! */
    public static void main(String[] args) {
        /* - use for constants ONLY upper case letters
           - avoid short names with less than 3 letters
           - always use english terms */
        String message = "My first Java project.";

        /* statement
             - every statement must end with a semi-colon ";"
             - start a new line after each semi-colon!
                 - write only one statement per line
                 - increases readability of a program
                 - makes finding errors easier!! */
        System.out.println("Hello, World!");
        System.out.println(message);
    }
}