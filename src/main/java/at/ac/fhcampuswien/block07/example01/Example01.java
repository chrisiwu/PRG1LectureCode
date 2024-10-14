package at.ac.fhcampuswien.block07.example01;

public class Example01 {
    public static void main(String[] args) {
        Person student;
        Person friend;

        student = new Person("Christoph", 30);
        friend = new Person("Jürgen", 22);

        student.sayName();
        friend.increaseAge();
        student.setComments("Good student.");
    }
}