package at.ac.hcw.block08.examples.example06;

public class Example06 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        /* equals(Object o):
           tells you if two objects are considered "equal" */
        if (cat.equals(dog)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        /* getClass():
           gives you the class that object was instantiated from */
        System.out.println(cat.getClass()); // class com.example.Cat

        /* hashCode():
           get object hashCode (think of it as a unique ID) */
        System.out.println(cat.hashCode()); // 245257410

        /* toString():
           string representation of the object
           by default the packagename, classname and
             hexadecimal form of hashcode */
        System.out.println(cat.toString()); // com.example.Cat@e9e54c2
        System.out.println(cat); // com.example.Cat@e9e54c2
    }
}