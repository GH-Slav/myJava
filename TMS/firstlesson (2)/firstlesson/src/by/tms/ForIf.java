package by.tms;

import java.util.Arrays;

public class ForIf {


    //f(aa, ab)
    Integer f(int a, int b){
        return a + b;
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

    void abc(Long a){
        System.out.println(a);
    }

    void abc(byte a){
        System.out.println(a);
    }
//    void abc(Object a){
//        System.out.println(a);
//    }

    void equal(int a, int b){
//        if (a == b){
//            System.out.println(a + " == " + b);
//        } else if(a > b) {
//            System.out.println(a + " > " + b);
//        } else {
//            System.out.println(a + " < " + b);
//        }
    }

    void fora(){
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

    public static void main(String[] args) {
//        ForIf forIf = new ForIf();

        int[] a = new int[]{2, 4, 6, 78 ,89};
        for (int i = 1, ii = 0; ii < a.length;i++, ii++){
            a[ii] = i;
        }
//        int i = a[3];
        for (int aa = 0;aa<a.length;aa++){
            System.out.println(a[aa]);
        }
//        System.out.println(Arrays.toString(a));
//        System.out.println(a[6]);
    }
}
