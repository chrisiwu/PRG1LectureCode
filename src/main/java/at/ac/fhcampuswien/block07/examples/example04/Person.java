package at.ac.fhcampuswien.block07.examples.example04;

public class Person {
    // properties
    private String name;
    private int age;
    private int id;
    private static int count = 0; // count the number of person objects

    // constructor
    /* Constructors are used to set an initial state
         for an object when it is created.
       The name of the constructor
         is always the same as the class name.
       The constructor is called when object
         is instantiated with the new keyword .

       If a programmer does not define a constructor,
         Java automatically creates a default one for the class.
       It does not do anything apart from creating the objects.
       Object variables remain uninitialized.
       If a constructor has been defined, no default constructor exists. */
    public Person(String name) {
        // instance variables are referred to with this
        this.name = name;
        this.age = 0;
        this.id = ++count;
    }

    // methods
    public int getId() {
        return this.id;
    }

    public void printPerson() {
        System.out.println(this.name + " (" + id + "), age: " + this.age + " years");
    }

//    /* Static indicates that the method does not belong to an object
//       and thus cannot be used to access any variables that belong to objects. */
//    public static void printPerson() {
//        System.out.println(name + ", age: " + age + " years");
//        System.out.println("I am a static method");
//    }

    /* toString method is used in Java to return
         the String representation of an object.
       It is defined in the Object class,
         which is the superclass of all classes in Java.
       By default, toString returns a string that includes
         the class name and the object‘s hashcode
         (eg.: Person@12jdh234) */
    @Override
    public String toString() {
        return this.name + " (" + id + "), age: " + this.age + " years";
    }
}