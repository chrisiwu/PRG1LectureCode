package at.ac.fhcampuswien.block08.example02;

public class Example02 {
    public static void main(String[] args) {
        Person first = new Person("First");

        System.out.println(first);  // First (1970)
        youthen(first);
        System.out.println(first);  // First (1971)

        Person second = first;
        youthen(second);
        System.out.println(first);  // First (1972)
    }

    public static void youthen(Person person) {
        person.setBirthYear(person.getBirthYear() + 1);
    }
}