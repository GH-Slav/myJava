package by.tms._Lessons_.Ch03._2_Массивы;

import java.util.Arrays;
import java.util.Scanner;

public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Сколько вам нужно выбрать комбинаций чисел? ");
        int k = in.nextInt();

        System.out.print("Какое самое большое число? ");
        int n = in.nextInt();

        //заполнить массив числами 1 2 3 ... n
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 1;

        //выбрать k-число и ввести их во второй массив
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            //получить случайный индекс
            //в пределах от О до n - 1
            int r = (int) (Math.random() * n);

            //выбрать элемент из произвольного места
            result[i] = numbers[r];

            //переместить последний элемент
            //в произвольное место
            numbers[r] = numbers[n - 1];
            n--;
        }

        //вывести отсортированный массив
        Arrays.sort(result);
        System.out.println("Поставьте следующую комбинацию. Это сделает тебя богатым!");
        for (int r : result)
            System.out.println(r);
    }
}
