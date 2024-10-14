package at.ac.fhcampuswien.block07.example04;

public class Example04 {
    public static void main(String[] args) {
        Person02 ada = new Person02("Ada");
        Person02 leon = new Person02("Leon");
        Person02 martin = new Person02("Martin");

        ada.printPerson(); // Ada, age 0 years
        leon.printPerson(); // Leon, age 0 years
        martin.printPerson(); // Martin, age 0 years

        System.out.println(leon); // same as System.out.println(leon.toString());
    }
}