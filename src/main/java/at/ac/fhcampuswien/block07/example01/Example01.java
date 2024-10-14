package at.ac.fhcampuswien.block07.example01;

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
        friend.increaseAge();
        student.setComments("Good student.");
    }
}