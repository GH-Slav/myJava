package by.tms.DomashneeZadanie._1_Array;

import java.util.Arrays;

//Отсортированные числа в порядке возрастания и убывания
public class Zada4a_4 {
    public static void main(String[] args) {
        int[] d = {44, 88, -15, -101, 4, 99, 66678, 1, -22};
        boolean ddd = false;
        int dddd;
        while (!ddd) {
            ddd = true;
            for (int i = 0; i < d.length - 1; i++) {
                if (d[i] < d[i + 1]) {
                    ddd = false;
                    dddd = d[i];
                    d[i] = d[i + 1];
                    d[i + 1] = dddd;
                }
            }
        }
        System.out.println(Arrays.toString(d));
    }
}

