package by.tms._Lessons_.Ch03._2_Массивы;
import java.util.Arrays;

public class tms_Array {
    public static void main(String[] args) {

        int[] a = new int[]{2, 4, 6, 78, 89};
        for (int i = 1, ii = 0; ii < a.length; i++, ii++) {
            a[ii] = i;
        }
//        int i = a[3];
        for (int aa = 0; aa < a.length; aa++) {
            System.out.println(a[aa]);

//        System.out.println(Arrays.toString(a));
//        System.out.println(a[1]);
        }
    }
}