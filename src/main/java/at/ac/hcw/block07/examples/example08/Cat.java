package at.ac.hcw.block07.examples.example08;

public class Cat {
    private int size;
    private String name;
    /* = value is the same for ALL instances of the class
       static variables are shared
       all instances of the same class share
         a single copy of the static variables
       static variables are initialized when the class is loaded
         - before any object of that class can be created
         - initialized before any static method of the class runs */
    private static int count;

    public Cat(String name, int size) {
        this.name = name;
        this.size = size;
        count++;
    }

    public static int getCount() {
        return count;
    }
}