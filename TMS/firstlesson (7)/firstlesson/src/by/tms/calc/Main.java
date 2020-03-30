package by.tms.calc;

import by.tms.calc.application.Application;
import by.tms.calc.application.ConsoleApplication;
import by.tms.calc.application.User;
import by.tms.calc.calculator.Calculator;

import java.util.regex.Matcher;

public class Main {

    Integer a = 22;

    public void change(Integer a){
        Integer a1 = new Integer(44);
        System.out.println(a1.hashCode());
        a = a1;
        System.out.println(a.hashCode());
        int i = Application.i;

        System.out.println(Math.cos(45));
    }



    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.a.hashCode());
        main.change(main.a);
        System.out.println(main.a.hashCode());
//        Calculator calculator = new Calculator();
//        Calculator calculator2 = new Calculator();
//        Calculator calculator3 = new Calculator();
//        Calculator calculator4 = new Calculator();
//        Calculator calculator5 = new Calculator();
//        System.out.println(calculator.getAge());
//        calculator2.setAge(22);
//        System.out.println(calculator5.getAge());

         User user = new User();
//        final User user2 = new User();
//        final User user3 = new User();
        System.out.println(user);
        user = new User();
//        System.out.println(user2);
//        System.out.println(user3);
        System.out.println(user.getAge());
        user.setAge(44);
        System.out.println(user.getAge());
    }

}
