package by.tms._Lessons_.Ch19_Collections_Framework.Классы_коллекций;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("А");
        ll.add("Р");
        ll.add("К");
        ll.addLast("Z");
        ll.addFirst("П");
        ll.add(0, "Z");
        System.out.println("Вывести содержимое списочного массива, после добавления: " +  ll);
        ll.remove("Z");
        ll.remove(3);
        ll.remove(3);
        System.out.println("Вывести содержимое списочного массива, после удаления: " +  ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println("Вывести содержимое списочного массива, после удаления первого и последнего элементов: " +  ll);
// Чтоб изменить элемент
        String izmena = ll.get(0);
        ll.set(0, izmena + "рк");
        System.out.println("Вывести содержимое списочного массива, после изменения: " +  ll);
    }
}
