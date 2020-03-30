package by.tms.test;

import by.tms.old.Car;
import by.tms.old.ForIf;
import by.tms.old.ForIfImpl;

public class Test {
    public static void main(String[] args) {
//        Human user = new User();
//        user.voice();
        ModerAction moder = new Moderator("men", 22, "moder");

        Calculation a = new CalcV2();
        System.out.println(a.calc(2, 2, "sum"));
    }
}
