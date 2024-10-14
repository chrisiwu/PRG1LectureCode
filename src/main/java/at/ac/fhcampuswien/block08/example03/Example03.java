package at.ac.fhcampuswien.block08.example03;

public class Example03 {
    public static void main(String[] args) {
        Person leon = new Person("leon", 1992);
        Person ada = leon;

        /* Null is a special literal that can be assigned
             to reference variables to indicate that they do not
             currently point to any object or instance.
           = the absence of an object */
        ada = null;

        /* Calling a method on an object that refers to nothing
             throws a NullPointerException. */
        ada.getBirthYear();
    }
}