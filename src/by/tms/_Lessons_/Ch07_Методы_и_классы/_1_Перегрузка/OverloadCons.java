package by.tms._Lessons_.Ch07_Методы_и_классы._1_Перегрузка;

public class OverloadCons {
    public static void main(String args[]) {
        // создать параллелепипеды, используя разные конструкторы
        Box myboxl = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        double vol;
// получить объем первого параллелепипеда
        vol = myboxl.volume();
        System.out.println("Объем myboxl равен " + vol);
// получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Oбъeм mybox2 равен " + vol);
// получить объем куба
        vol = mycube.volume();
        System.out.println("Oбъeм mycube равен " + vol);
    }
}
