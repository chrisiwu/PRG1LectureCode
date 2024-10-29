package at.ac.fhcampuswien.block03.examples;

import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        // variables must be declared in advance!
        String userName;
        int age;
        double salary;
        String str;

        /* standard since Java 5.0
           invalid input can lead to a runtime error!
           the following package must be included:
           - import java.util.Scanner;
           - Scanner scanner = new Scanner(System.in);
           syntax:
           - stringVariable = scan.next();
           - intVariable = scan.nextInt();
           - doubleVariable = scan.nextDouble(); */
        Scanner scanner = new Scanner(System.in);

        System.out.print("User Name: ");
        userName = scanner.next();
        System.out.println(userName);

        System.out.print("Age: ");
        age = scanner.nextInt();
        System.out.println(age);

        System.out.print("Salary: ");
        salary = scanner.nextDouble();
        System.out.println(salary);

        str = scanner.nextLine();
    }
}