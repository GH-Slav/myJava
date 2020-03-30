package by.tms._Lessons_.Ch03._2_Массивы;

public class Avarage {
    public static void main(String[] args) {
        double n[] = {10.12, 12.33, 12.44, 14.01, 21.89};
        double result = 0;
        int i;
        for (i = 0; i < 5; i++)
            result = result + n[i];
        System.out.println("Среднее значение равно:  " + result/5);
    }
}
