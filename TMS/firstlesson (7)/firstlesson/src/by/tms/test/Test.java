package by.tms.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Human user = new User();
//        user.voice();
//        ModerAction moder = new Moderator("men", 22, "moder");
//
//        Calculation a = new CalcV2();
//        System.out.println(a.calc(2, 2, "sum"));
//        Object a = new C();
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println(next);

        String a = "HellolleH";
        char[] chars = a.toCharArray();
        char[] newChars = new char[chars.length];
        for (int i = 0, ii = chars.length - 1; i < newChars.length; i++, ii--){
            newChars[i] = chars[ii];
        }
    }
}
