package by.tms._Lessons_.Ch03._1_Типы_данных_и_переменные;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("int в byte: ");
        b = (byte) i;
        System.out.println("i = " + i);
        System.out.println("b = " + b);

        System.out.println("double в int: ");
        i = (int) d;
        System.out.println("d = " + d);
        System.out.println("i = " + i);

        System.out.println("double в byte: ");
        b = (byte) d;
        System.out.println("d = " + d);
        System.out.println("b = " + b);
    }
}
