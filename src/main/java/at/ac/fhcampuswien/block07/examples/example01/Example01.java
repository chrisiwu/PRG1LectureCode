package at.ac.fhcampuswien.block07.examples.example01;

public class Example01 {
    public static void main(String[] args) {
        // declaration of a variable to store the object
        Person student;
        Person friend;

        // creation of an object with the "new" statement
        student = new Person("Christoph", 30);
        friend = new Person("Jürgen", 22);

        // call of methods on objects
        student.sayName();
        System.out.println(friend.getAge());
        friend.increaseAge();
        System.out.println(friend.getAge());
        System.out.println(student.getComments());
        student.setComments("Good student.");
        System.out.println(student.getComments());
    }
}