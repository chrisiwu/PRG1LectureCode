package at.ac.hcw.block07.examples.example07;

public class Example07 {
    public static void main(String[] args) throws CloneNotSupportedException {
        SimpleDate date = new SimpleDate(10, 12, 1815);

        Person ada = new Person("Ada Lovelace", date);
        Person pascal = new Person("Blaise Pascal", 19, 6, 1623);

        System.out.println(ada); // Ada Lovelace (10.12.1815)
        System.out.println(pascal); // Blaise Pascal (19.6.1623)

        Person first = new Person("First", 01, 01, 1000);
        /* assigning a value with "=" copies the value
           with reference values only the reference is copied */
        Person second = first;
        /* default implementation of clone() performs a shallow copy,
             meaning it copies all fields as they are
           if a field is a reference to an object,
             only the reference is copied */
        Person third = (Person) first.clone();
        /* to perform a deep copy where objects
             referenced by fields are also cloned:
           - you can override clone() to manually
               clone each referenced object
           - you can write a copy constructor that takes another object
               and copies its fields to create a new instance
           - you can write a method that explicitly copies
               the values from one object to another */
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
        System.out.println();

        second.setName("Second");
        third.setName("Third");
        fourth.setName("Fourth");

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
    }
}