package at.ac.fhcampuswien.block08.examples.example05;

public class Example05 {
    public static void main(String[] args) {
        Person01 ada1 = new Person01("Ada Lovelace", new SimpleDate(10, 12, 1815));
        Person01 ada2 = new Person01("Ada Lovelace", new SimpleDate(10, 12, 1815));

        /* Using == compares the equality of the values
             stored in the "boxes of the variables".
           With reference variables, such comparisons would
             examine the equality of the memory references. */
        System.out.println(ada1 == ada2); // false
        System.out.println(ada1.equals(ada2)); // false
        ada2 = ada1;
        System.out.println(ada1 == ada2); // true
        System.out.println(ada1.equals(ada2)); // true

        // after overriding the equals method:
        Person02 ada3 = new Person02("Ada Lovelace", new SimpleDate(10, 12, 1815));
        Person02 ada4 = new Person02("Ada Lovelace", new SimpleDate(10, 12, 1815));

        System.out.println(ada3 == ada4); // false
        System.out.println(ada3.equals(ada4)); // true
    }
}