package at.ac.fhcampuswien.block08.examples.example04;

public class Example04 {
    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(10, 12, 1815);

        Person ada = new Person("Ada Lovelace", date);
        Person pascal = new Person("Blaise Pascal", 19, 6, 1623);

        System.out.println(ada); // Ada Lovelace (10.12.1815)
        System.out.println(pascal); // Blaise Pascal (19.6.1623)
    }
}