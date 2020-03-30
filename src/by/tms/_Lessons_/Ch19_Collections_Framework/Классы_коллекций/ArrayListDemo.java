package by.tms._Lessons_.Ch19_Collections_Framework.Классы_коллекций;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Начальный размер списочного массива: " +  al.size());
        al.add("А");
        al.add("Н");
        al.add("К");
        al.add("Е");
        al.add("Т");
        al.add("А");
        al.add(1,"Б");
        al.add(7, "0");
        System.out.println("Размер списочного массива, после добавления символов: " +  al.size());
        System.out.println("Вывести содержимое списочного массива: " +  al);
        al.remove("Н");
        al.remove(5);
        System.out.println("Размер списочного массива, после удаления символов: " +  al.size());
        System.out.println("Вывести содержимое списочного массива: " +  al);
    }
}
