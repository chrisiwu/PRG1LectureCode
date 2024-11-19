package at.ac.fhcampuswien.block13.examples.example04;

import java.util.ArrayList;

public class Example04 {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        Person john = new Person("John", 10, 12, 1992);
        persons.add(john);

        persons.add(new Person("Matthew", 2, 7, 1987));
        persons.add(new Person("Martin", 23, 10, 2003));

        for (Person person : persons) {
            System.out.println(person);
        }
    }
}