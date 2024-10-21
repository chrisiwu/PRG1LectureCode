package at.ac.fhcampuswien.block08.examples.example02;

public class Example02 {
    public static void main(String[] args) {
        /* Variables are classified into primitive
             and reference variables.
           Primitive variable‘s information is stored as
             the value of that variable.
           Reference variables hold a reference
             to information related to that variable. */
        Person first = new Person("First");

        System.out.println(first);  // First (1970)
        growOlder(first);
        System.out.println(first);  // First (1971)

        /* Assigning a value with „=„ copies the value.
           With reference values only the reference is copied. */
        Person second = first;
        growOlder(second);
        System.out.println(first);  // First (1972)
    }

    public static void growOlder(Person person) {
        person.setBirthYear(person.getBirthYear() + 1);
    }
}