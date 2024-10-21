package at.ac.fhcampuswien.block08.examples.example06;

public class Example06 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person first = new Person("First", 01, 01, 1000);
        /* Assigning a value with "=" copies the value.
           With reference values only the reference is copied. */
        Person second = first;
        /* Default implementation of clone() performs a shallow copy,
             meaning it copies all fields as they are.
           If a field is a reference to an object,
             only the reference is copied. */
        Person third = (Person) first.clone();
        /* To perform a deep copy where objects
             referenced by fields are also cloned:
           - You can override clone() to manually
               clone each referenced object.
           - You can write a copy constructor that takes another object
               and copies its fields to create a new instance.
           - You can write a method that explicitly copies
               the values from one object to another. */
        Person fourth = new Person(first);

        System.out.println(first == first); // true
        System.out.println(first == second); // true
        System.out.println(first == third); // false
        System.out.println(first.equals(third)); // true
        System.out.println(first == fourth); // false
        System.out.println(first.equals(fourth)); // true
        System.out.println();

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        System.out.println();

        second.setBirthday(2, 2, 2000);
        third.setBirthday(3, 3, 3000);
        fourth.setBirthday(4, 4, 4000);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
    }
}