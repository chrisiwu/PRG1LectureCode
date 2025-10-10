package at.ac.hcw.block06.examples.example05;

public class Person {
    private String name;
    private int age;

    /* constructor overloading is used
         to create multiple constructors
         with different parameters
       allows for the creation of objects
         in different ways
       it is not possible to have two
         constructors with the exact
         same parameters!
       if constructors share commonalities
         (special cases of other constructors)
         it is possible to call the constructor
         from within another constructor
         with this keyword */
    public Person(String name) {
        this.name = name;
        this.age = 0; // default value

        /* here the code of the second constructor
             is run, and the age is set to 0 */
//        this(name, 0);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ')';
    }
}