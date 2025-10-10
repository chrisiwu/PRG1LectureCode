package at.ac.hcw.block02.examples;

import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        /* Input:
           syntax:
             - stringVariable = scan.next();
             - intVariable = scan.nextInt();
             - doubleVariable= scan.nextDouble(); */
        String userName;
        int age;
        double salary;
        String str;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter user name: ");
        userName = scanner.next();
        System.out.print("Enter age: ");
        age = scanner.nextInt();
        System.out.print("Enter salary: ");
        salary = scanner.nextDouble();
        scanner.nextLine(); // diese Zeile entfernt das verbleibende '\n'
        System.out.print("Enter String: ");
        str = scanner.nextLine();

        System.out.println(userName);
        System.out.println(age);
        System.out.println(salary);
        System.out.println(str);
    }
}