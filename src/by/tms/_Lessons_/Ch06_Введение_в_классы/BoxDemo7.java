package by.tms._Lessons_.Ch06_Введение_в_классы;

public class BoxDemo7 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3,6,9);

//рассчитать объем первого параллелепипеда
        System.out.println(mybox1.volume());
//рассчитать объем второго параллелепипеда
        System.out.println(mybox2.volume());
    }
}
