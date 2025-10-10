package at.ac.hcw.block07.examples.example08;

public class Example08 {
    public static void main(String[] args) {
        /* s1.play() on this instance will
             cause "99 Luftballons" to play */
        Song s1 = new Song("99 Lufballons");
        s1.play();

        // no instance just via class name
        int min = Math.min(42, 37);
        System.out.println(min);

        Cat cat1 = new Cat("Garfield", 30);
        Cat cat2 = new Cat("Mrs. Norris", 24);
        System.out.println(Cat.getCount() + " cats were created");
    }
}