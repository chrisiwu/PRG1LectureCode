package at.ac.fhcampuswien.block07.example01;

public class Example01 {
    public static void main(String[] args) {
        Person01 student;
        Person01 friend;

        student = new Person01("Christoph", 30);
        friend = new Person01("Jürgen", 22);

        student.sayName();
        friend.increaseAge();
        student.setComments("Good student.");
    }
}