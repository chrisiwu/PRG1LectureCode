package at.ac.fhcampuswien.block13.examples.example04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example04 {
    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();
        members.add(new Member("Ada Lovelace", 160));
        members.add(new Member("Yao Ming", 229));
        members.add(new Member("Bart Simpson", 122));

        for (Member m : members) {
            System.out.println(m);
        }

        System.out.println("Sorted list:");
        Collections.sort(members); // Collections.reverseOrder()

        for (Member m : members) {
            System.out.println(m);
        }
    }
}