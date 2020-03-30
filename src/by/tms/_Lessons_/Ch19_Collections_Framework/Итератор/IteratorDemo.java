package by.tms._Lessons_.Ch19_Collections_Framework.Итератор;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> AL = new ArrayList<>();
        AL.add("Р");
        AL.add("Е");
        AL.add("Б");
        AL.add("У");
        AL.add("С");
        AL.add("Щ");
        System.out.println("Вывести содержание списочного массива: " + AL);
        Iterator<String> itr = AL.iterator();
        while (itr.hasNext()) {
            String elem  = itr.next();
            System.out.print(elem + " ");
        }
        System.out.println();
        ListIterator<String> liter = AL.listIterator();
        while(liter.hasNext()); {
            String elem = liter.next();
            liter.set(elem + "+");
            System.out.println("Изменное содержание списочного массива: ");
        }
        itr = AL.iterator();
        while(itr.hasNext());{
            String elem = itr.next();
            System.out.println(elem + "  ");
        }
        System.out.println();
        System.out.println("Список в обратном порядке: ");
        while (liter.hasPrevious()){
            String elem = liter.previous();
            System.out.println(elem + "  ");
        }
        System.out.println();
    }
}
