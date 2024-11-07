package at.ac.fhcampuswien.block12.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example01 {
    public static void main(String[] args) {
        List list = new ArrayList();

        // collections can take any kind of object
        list.add("some String");
        list.add(Integer.valueOf(10));

        Iterator it = list.iterator();
        Object obj = it.next();

        Integer x = null;

        // ensuring type safety at runtime
        if (obj instanceof Integer) {
            x = (Integer) obj;
            System.out.println(x);
        }
    }
}