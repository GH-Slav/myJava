package by.tms._Lessons_.Ch05.Операторы._2_Цикл.For;

public class Comma {
    public static void main(String[] args) {
        for (int a = 1, b = 4; a < b; a++, b--) {
            System.out.println("a равно " + a);
            System.out.println("b равно " + b);
        }
    }
}
