package at.ac.hcw.block07.examples.example06;

public class Example06 {
    public static void main(String[] args) {
        /* to compare two primitives, we use the == operator
           it simply compares the bits of two variables */
        int x = 3;
        byte y = 3;

        if (x == y) {
            System.out.println("x is equal to y");
        }

        /* to see if two references are the same
             (if they refer to the same object in the heap),
             we also use the == operator */
        Cat a = new Cat("Garfield", 30);
        Cat b = new Cat("Mrs. Norris", 24);
        Cat c = a;

        if (a == b) { // false
            System.out.println("a == b");
        }
        if (a == c) { // true
            System.out.println("a == c");
        }
        if (b == c) { // false
            System.out.println("b == c");
        }

        /* but sometimes you want to know if two objects are equal
           for that we need the equals method */
        Cat s = new Cat("Garfield", 30);
        Cat t = new Cat("Mrs. Norris", 24);
        Cat u = new Cat("Garfield", 30);

        if (s.equals(t)) { // false
            System.out.println("s.equals(t)");
        }
        if (s.equals(u)) { // true
            System.out.println("s.equals(u)");
        }
        if (t == u) { // false
            System.out.println("t == u");
        }
    }
}