package at.ac.fhcampuswien.block08.example01;

public class Example01 {
    public static void main(String[] args) {
        Person leon = new Person("Leon", 32);
        Person ada = new Person("Ada");

        System.out.println(leon);
        System.out.println(ada);

        leon.growOlder();
        System.out.println(leon); // 33

        leon.growOlder(10);
        System.out.println(leon); // 43
    }
}