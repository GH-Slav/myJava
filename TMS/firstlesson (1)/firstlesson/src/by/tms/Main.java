package by.tms;

public class Main {

    double sum(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        Main main = new Main();
        double sum = main.sum((int)5.4, 5);
        System.out.println(sum);

        boolean b1 = 2 > 5;
        boolean b2 = 2 < 5;
        boolean b3 = 5 != 5;
        boolean b4 = 5 == 5;


        int a = 2 + 2;
        int b = 2 - 2;
        double c = 2 / 5;
        int d = 2 % 2;
        int e = 2 * 2;

        byte aa = -128; //8
        short bb = -32768; //16
        int cc = 232432423; //32
        long dd = 1242343243;//64

        double ee = 234324324.54;//64
        float ff = 33213.65f;//32

        boolean fff = false;

        char ffff = 'M';

        Dog dog;

        int i = a - 2;
//        System.out.println(i)
    }


}
