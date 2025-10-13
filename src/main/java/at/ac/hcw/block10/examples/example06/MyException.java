package at.ac.hcw.block10.examples.example06;

// custom exceptions should extend java.lang.Exception
public class MyException extends Exception {
    public MyException() {
        super("An error occurred.");
    }

    // some custom properties ...
}