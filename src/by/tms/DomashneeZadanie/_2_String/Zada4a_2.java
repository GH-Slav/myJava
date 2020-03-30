package by.tms.DomashneeZadanie._2_String;

import java.util.Scanner;

//Написать метод который принимает строку и возвращает true если строка палиндром
public class Zada4a_2 {
    public static void main(String[] args) {
        System.out.print("Напиши слово:    ");
        Scanner s = new Scanner(System.in);
        String slovo = s.next();
        System.out.println(slovo);
        Zada4a_2 dzThree = new Zada4a_2();
        System.out.println(dzThree.fff(slovo));
    }

    public boolean fff(String o) {
        StringBuilder stringBuilder = new StringBuilder(o);
        StringBuilder reverse = stringBuilder.reverse();
        if (o.equals(reverse.toString())) {
            return true;
        }
        return false;
    }
}
