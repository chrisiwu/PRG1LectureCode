package at.ac.fhcampuswien.block12.examples.example04;

public class Example04 {
    public static void main(String[] args) {
        GenericList<String> myStrings = new ArrayGenericList<>(5);

        myStrings.add("hello");
        myStrings.add("generics");

        System.out.println("String list: " + myStrings);
        System.out.println("element at index 1: " + myStrings.get(1));

        GenericList<Integer> myNumbers = new ArrayGenericList<>(3);

        myNumbers.add(10);
        myNumbers.add(20);
        myNumbers.add(4);
        myNumbers.add(5);

        System.out.println("Integer list: " + myNumbers);
        System.out.println("Element at index 1: " + myNumbers.get(1));
    }
}