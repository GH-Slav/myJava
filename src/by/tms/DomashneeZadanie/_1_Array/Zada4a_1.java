package by.tms.DomashneeZadanie._1_Array;
//Четные и нечетные числа
public class Zada4a_1 {
    public static void main(String[] args) {

        int[] a = new int[100];
        for (int i = 1, ii = 0; ii < a.length; i++, ii++) {
            a[ii] = i;

        }
        int i = a[3];
        for (int aa = 0; aa < a.length; aa++)
            if (a[aa] % 2 != 0) {
                System.out.println(a[aa]);
            }
    }
}
