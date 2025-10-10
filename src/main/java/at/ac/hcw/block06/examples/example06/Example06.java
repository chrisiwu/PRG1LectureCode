package at.ac.hcw.block06.examples.example06;

public class Example06 {
    public static void main(String[] args) {
        Cat c = new Cat("Garfield", 30);
        Cat c2 = new Cat("Mrs. Norris", 23);

        c.meow(); // Garfield: meow!
        c2.meow(); // Mrs. Norris: meow!

        c.fight(); // "Cat fight!"
        c.fight(c2); // Garfield: fight! *scratches Mrs. Norris nose*
    }
}