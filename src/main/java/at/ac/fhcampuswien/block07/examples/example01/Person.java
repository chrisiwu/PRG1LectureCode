package at.ac.fhcampuswien.block07.examples.example01;

public class Person {
    // properties
    private String name;
    private int age;
    private double salary;
    private String comments;
    private double TAX;

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.comments = "";
    }

    // methods
    public void sayName() {
        System.out.println("My name is " + this.name + ".");
    }

    // "get" & "set" methods for some properties (no setName!)
    public String getName() {
        return this.name;
    }

    public String getComments() {
        return this.comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public double getNetSalary() {
        double netSalary; // variables which are not properties or characteristics have to be declared locally
        netSalary = this.salary - TAX;
        return netSalary;
    }

    public void increaseAge() {
        this.age += 1;
    }
}