package by.tms._Lessons_.Ch19_Collections_Framework.Классы_коллекций;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> alta = new ArrayList<Integer>();
        alta.add(77);
        alta.add(8);
        alta.add(45);
        alta.add(1234);
        alta.add(-889);
        System.out.println("Вывести содержимое списочного массива: " +  alta);
// Обычный массив
        Integer obmas[] = new Integer[alta.size()];
        obmas = alta.toArray(obmas);
//Суммировать элементы массива
        int sum = 0;
        for (int i : obmas) sum += i;
        System.out.println("Сумма: " + sum);
    }
}
