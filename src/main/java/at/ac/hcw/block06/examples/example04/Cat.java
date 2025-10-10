package at.ac.hcw.block06.examples.example04;

public class Cat {
    // properties - instance variables
    private int size;
    private String breed;
    private String name;

    /* constructors:
       constructors are used to set an
         initial state for an object
         when it is created
       constructor's name is always
         the same as the class name
       constructor is called when object
         is instantiated with the new keyword
       if programmer does not define a constructor,
         Java automatically creates a default one
         for the class
         - it does not do anything apart
             from creating the objects
         - object variables remain uninitialized
         - if a constructor has been defined,
             no default constructor exists */
    public Cat(String name, int size) {
        this.name = name;
        this.size = size;
        this.breed = "";
    }

    // methods
    public void meow() {
        System.out.println("Meow! Brrrrrr");
    }
}