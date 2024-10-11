package at.ac.fhcampuswien.block07.example01;

public class Example01 {
    public static void main(String[] args) {
        Person ada = new Person("Ada");
        Person leon = new Person("Leon");
        Person martin = new Person("Martin");

        ada.printPerson(); // Ada, age 0 years
        leon.printPerson(); // Leon, age 0 years
        martin.printPerson(); // Martin, age 0 years

        System.out.println(leon); // same as System.out.println(leon.toString());
    }
}