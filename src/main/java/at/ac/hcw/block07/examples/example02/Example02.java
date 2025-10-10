package at.ac.hcw.block07.examples.example02;

public class Example02 {
    public static void main(String[] args) {
        Cat c = new Cat("Garfield", 30);
        Cat c2 = new Cat("Mrs. Norris", 24);

//        c.size = 0; // compiler error
        c.setSize(10); // enforce setter

//        c.prepareForFight(); // compiler error
        c.fight(c2);
    }
}