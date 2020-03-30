package by.tms._Lessons_.Ch04.Операции;

public class Operations {
    public static void main(String[] args) {
        int a = 4;
        int b = 9;
        int c = 5;
        int d = 10;
        a += 1;
        b *= 4;
        c -= a * b;
        c /= 2;
        d %= 3;
        System.out.println("a =  " + a);
        System.out.println("b =  " + b);
        System.out.println("c =  " + c);
        System.out.println("d =  " + d);
        System.out.println();
        int f = 8 + 2;
        int g;
        int h;
        g = --f;
        h = ++f;
        f++;
        System.out.println("f =  " + f);
        System.out.println("g =  " + g);
        System.out.println("h =  " + h);
        System.out.println();
    }
}
