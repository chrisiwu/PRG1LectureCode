package at.ac.fhcampuswien.block07.example04;

public class Person02 {
    // properties
    private String name;
    private int age;

    // constructor
    public Person02(String name) {
        this.name = name;
        this.age = 0;
    }

    // methods
    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

//    public static void printPerson() {
//        System.out.println(this.name + ", age " + this.age + " years");
//        System.out.println("I am a static method");
//    }

    @Override
    public String toString() {
        return this.name + ", age: " + this.age + " years";
    }
}