package by.tms.old;

import java.util.Scanner;

public class ForIfImpl implements ForIf {
    public int a = 0;

    void abc(){
        if (a == 100) return;
        a++;
        abc();
    }


    public static void main(String[] args) {
        ForIfImpl forIfImpl = new ForIfImpl();
        System.out.println("Введите комманду");
        Scanner scanner = new Scanner(System.in);
        forIfImpl.abc(scanner.next());
//        int[] a = new int[]{2, 4, 6, 78 ,89};
//        for (int i = 1, ii = 0; ii < a.length;i++, ii++){
//            a[ii] = i;
//        }
////        int i = a[3];
//        for (int aa = 0;aa<a.length;aa++){
//            System.out.println(a[aa]);
//        }
//        System.out.println(Arrays.toString(a));
//        System.out.println(a[6]);

    }

//    void abc(double a){
//        System.out.println(a);
//    }
//    void abc(int a){
//        System.out.println(a);
//    }
//    void abc(float a){
//        System.out.println(a);
//    }
    //void abc(long a){
    //   System.out.println(a);
    //
//    void abc(Integer a){
//        System.out.println(a);
//    }

    //f(aa, ab)
    Integer f(int a, int b) {
        return a + b;
    }

    void abc(Long a) {
        System.out.println(a);
    }
//    void abc(Object a){
//        System.out.println(a);
//    }

    void abc(byte a) {
        System.out.println(a);
    }

    void equal(int a, int b) {
        String aa = "Test";
//        if (a == b){
//            System.out.println(a + " == " + b);
//        } else if(a > b) {
//            System.out.println(a + " > " + b);
//        } else {
//            System.out.println(a + " < " + b);
//        }
    }

    void fora() {
//        int i = 0;
//        for (;i < 10;i++){
//        }
//        System.out.println(i);
//        while (i < 10){
//            System.out.println(i);
//            i++;
//        }

//        do {
//            System.out.println(i);
//            i++;
//        } while (i < 10);

    }

    void abc(String a) {
        if (a == null || a.length() < 2) return;
        switch (a) {
            case "/start":
                start();
                break;
            case "/stop":
                break;
            default:
                System.out.println("Нет такого!");
        }
    }

    //public
    //protected
    //package-private
    //private


    private void start() {
        System.out.println("Start");
    }

    @Override
    public void stop(String message) {
        System.out.println(message);
    }
}
