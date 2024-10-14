package at.ac.fhcampuswien.block08.examples.example01;

public class Person {
    // properties
    private String name;
    private int age;

    // constructors
    /* Constructor overloading is used to create multiple
         constructors with different parameters.
       Allows the creation of objects in different ways.
       It is not possible to have two constructors
         with the exact same parameters.
       If constructors share commonalities
         (special cases of other constructors)
         it is possible to call the constructor from
         within another constructor with this keyword. */
    public Person(String name) {
        this(name, 0); // here the code of the second constructor is run, and the age is set to
    }

//    public Person(String name) {
//        this.name = name;
//        this.age = 0; // default value
//    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // methods
    // methods can be overloaded like constructors
    public void growOlder() {
        age += 1;
    }

    public void growOlder(int years) {
        age += years;
    }

    @Override
    public String toString() {
        return name + ", age: " + age + " years";
    }
}