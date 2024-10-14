package at.ac.fhcampuswien.block07.example04;

public class Person {
    // properties
    private String name;
    private int age;

    // constructor
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    // methods
    public void printPerson() {
        System.out.println(name + ", age: " + age + " years");
    }

//    /* Static indicates that the method does not belong to an object
//       and thus cannot be used to access any variables that belong to objects */
//    public static void printPerson() {
//        System.out.println(name + ", age: " + age + " years");
//        System.out.println("I am a static method");
//    }

    @Override
    public String toString() {
        return name + ", age: " + age + " years";
    }
}