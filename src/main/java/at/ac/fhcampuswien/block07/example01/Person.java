package at.ac.fhcampuswien.block07.example01;

public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.age = 0;
        this.name = name;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

//    public static void printPerson() {
//        System.out.println(this.name + ", age " + this.age + " years");
//    }

    public String toString() {
        return this.name + ", age " + this.age + " years";
    }
}