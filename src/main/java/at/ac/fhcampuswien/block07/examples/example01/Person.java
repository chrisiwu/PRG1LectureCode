package at.ac.fhcampuswien.block07.examples.example01;

public class Person {
    // properties
    private String name;
    private int age;
    private double salary;
    private String comments;

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.comments = "";
    }

    // methods
    public void sayName() {
        System.out.println("My name is " + name + ".");
    }

    // "get" & "set" methods for some properties (no setName!)
    public String getName() {
        return name;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseAge() {
        age += 1;
    }
}