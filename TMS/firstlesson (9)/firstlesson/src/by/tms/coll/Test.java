package by.tms.coll;

import by.tms.calc.application.User;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<User> tet = new ArrayList<>();
        tet.add(new User());
        tet.add(new User());
        tet.add(new User("Test", 22));
        tet.add(new User());
        tet.add(new User());
//        tet.add("Hello3");
//        tet.add("Hello4");
//        tet.add("Hello5");
        System.out.println(tet.get(2));
        List<String> tet2 = new LinkedList<>();
        tet2.add("Hello");
        tet2.add("Hello2");
        tet2.add("Hello3");
        tet2.add("Hello4");

    }
}
