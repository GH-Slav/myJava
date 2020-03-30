package by.tms.DomashneeZadanie._1_Array;
//Наибольшее и наименьшее число
public class Zada4a_2 {
    public static void main(String[] args) {

        int[] b = new int[]{1, 4, 5, 7, 9, 10};
        int max = b[0], min = b[0];
        for (int i : b) {
            if (max < i) max = i;
            if (min > i) min = i;
        }
        System.out.println(max);
        System.out.println(min);
    }
}
